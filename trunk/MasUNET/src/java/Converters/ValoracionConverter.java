package Converters;

import Entities.Valoracion;
import Facades.ValoracionFacade;
import Controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@Named
public class ValoracionConverter implements Converter {

    @Inject
    private ValoracionFacade ejbFacade;
    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    Entities.ValoracionPK getKey(String value) {
        Entities.ValoracionPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new Entities.ValoracionPK();
        key.setUsuarioIdusuario(Integer.parseInt(values[0]));
        key.setRecursoIdrecurso(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(Entities.ValoracionPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getUsuarioIdusuario());
        sb.append(SEPARATOR);
        sb.append(value.getRecursoIdrecurso());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Valoracion) {
            Valoracion o = (Valoracion) object;
            return getStringKey(o.getValoracionPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Valoracion.class.getName()});
            return null;
        }
    }
}
