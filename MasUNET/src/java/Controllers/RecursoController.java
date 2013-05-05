package Controllers;

import Entities.Recurso;
import Facades.RecursoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "recursoController")
@SessionScoped
public class RecursoController extends AbstractController<Recurso> implements Serializable {

    @Inject
    private RecursoFacade ejbFacade;

    public RecursoController() {
        super(Recurso.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
