package Converters;

import Entities.UsuMen;
import Facades.UsuMenFacade;
import Controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@Named
public class UsuMenConverter implements Converter {

    @Inject
    private UsuMenFacade ejbFacade;
    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    Entities.UsuMenPK getKey(String value) {
        Entities.UsuMenPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new Entities.UsuMenPK();
        key.setUsuarioIdusuario(Integer.parseInt(values[0]));
        key.setMensajeIdmensaje(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(Entities.UsuMenPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getUsuarioIdusuario());
        sb.append(SEPARATOR);
        sb.append(value.getMensajeIdmensaje());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof UsuMen) {
            UsuMen o = (UsuMen) object;
            return getStringKey(o.getUsuMenPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), UsuMen.class.getName()});
            return null;
        }
    }
}
