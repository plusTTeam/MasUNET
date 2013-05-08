package Controllers;

import Entities.Accion;
import Facades.AccionFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

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
