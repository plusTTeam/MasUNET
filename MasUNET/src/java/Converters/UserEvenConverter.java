package Converters;

import Entities.UserEven;
import Facades.UserEvenFacade;
import Controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@Named
public class UserEvenConverter implements Converter {

    @Inject
    private UserEvenFacade ejbFacade;
    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    Entities.UserEvenPK getKey(String value) {
        Entities.UserEvenPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new Entities.UserEvenPK();
        key.setEventoIdevento(Integer.parseInt(values[0]));
        key.setUsuarioIdusuario(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(Entities.UserEvenPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getEventoIdevento());
        sb.append(SEPARATOR);
        sb.append(value.getUsuarioIdusuario());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof UserEven) {
            UserEven o = (UserEven) object;
            return getStringKey(o.getUserEvenPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), UserEven.class.getName()});
            return null;
        }
    }
}
