package Converters;

import Entities.Permisologia;
import Facades.PermisologiaFacade;
import Controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@Named
public class PermisologiaConverter implements Converter {

    @Inject
    private PermisologiaFacade ejbFacade;
    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    Entities.PermisologiaPK getKey(String value) {
        Entities.PermisologiaPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new Entities.PermisologiaPK();
        key.setRolIdrol(Integer.parseInt(values[0]));
        key.setPaginaIdpagina(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(Entities.PermisologiaPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getRolIdrol());
        sb.append(SEPARATOR);
        sb.append(value.getPaginaIdpagina());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Permisologia) {
            Permisologia o = (Permisologia) object;
            return getStringKey(o.getPermisologiaPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Permisologia.class.getName()});
            return null;
        }
    }
}
