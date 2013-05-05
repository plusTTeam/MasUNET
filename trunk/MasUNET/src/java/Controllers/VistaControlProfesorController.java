package Controllers;

import Entities.VistaControlProfesor;
import Facades.VistaControlProfesorFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "vistaControlProfesorController")
@SessionScoped
public class VistaControlProfesorController extends AbstractController<VistaControlProfesor> implements Serializable {

    @Inject
    private VistaControlProfesorFacade ejbFacade;

    public VistaControlProfesorController() {
        super(VistaControlProfesor.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
