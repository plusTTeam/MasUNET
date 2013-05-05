package Controllers;

import Entities.VistaControlEstudiante;
import Facades.VistaControlEstudianteFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "vistaControlEstudianteController")
@SessionScoped
public class VistaControlEstudianteController extends AbstractController<VistaControlEstudiante> implements Serializable {

    @Inject
    private VistaControlEstudianteFacade ejbFacade;

    public VistaControlEstudianteController() {
        super(VistaControlEstudiante.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
