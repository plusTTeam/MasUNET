package Controllers;

import Entities.Notificacion;
import Facades.NotificacionFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "notificacionController")
@SessionScoped
public class NotificacionController extends AbstractController<Notificacion> implements Serializable {

    @Inject
    private NotificacionFacade ejbFacade;

    public NotificacionController() {
        super(Notificacion.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
