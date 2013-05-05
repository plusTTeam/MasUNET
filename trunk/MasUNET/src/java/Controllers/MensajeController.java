package Controllers;

import Entities.Mensaje;
import Facades.MensajeFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "mensajeController")
@SessionScoped
public class MensajeController extends AbstractController<Mensaje> implements Serializable {

    @Inject
    private MensajeFacade ejbFacade;

    public MensajeController() {
        super(Mensaje.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
