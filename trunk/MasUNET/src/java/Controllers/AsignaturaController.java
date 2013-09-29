package Controllers;

import Entities.Asignatura;
import Facades.AsignaturaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "asignaturaController")
@SessionScoped
public class AsignaturaController extends AbstractController<Asignatura> implements Serializable {

    @Inject
    private AsignaturaFacade ejbFacade;
    
    public AsignaturaController() {
        super(Asignatura.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
