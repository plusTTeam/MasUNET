package Controllers;

import Entities.Accion;
import Facades.AccionFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "accionController")
@SessionScoped
public class AccionController extends AbstractController<Accion> implements Serializable {

    @Inject
    private AccionFacade ejbFacade;

    public AccionController() {
        super(Accion.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
