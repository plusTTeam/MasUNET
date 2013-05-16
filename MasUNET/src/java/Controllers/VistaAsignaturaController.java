package Controllers;

import Entities.VistaAsignatura;
import Facades.VistaAsignaturaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "vistaAsignaturaController")
@SessionScoped
public class VistaAsignaturaController extends AbstractController<VistaAsignatura> implements Serializable {

    @Inject
    private VistaAsignaturaFacade ejbFacade;

    public VistaAsignaturaController() {
        super(VistaAsignatura.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
