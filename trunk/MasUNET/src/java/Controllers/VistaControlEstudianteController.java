package Controllers;

import Entities.VistaControlEstudiante;
import Facades.VistaControlEstudianteFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

@Named(value = "vistaControlEstudianteController")
@SessionScoped
public class VistaControlEstudianteController extends AbstractController<VistaControlEstudiante> implements Serializable {


    //This is default
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
