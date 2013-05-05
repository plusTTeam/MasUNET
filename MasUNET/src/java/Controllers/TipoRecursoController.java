package Controllers;

import Entities.TipoRecurso;
import Facades.TipoRecursoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "tipoRecursoController")
@SessionScoped
public class TipoRecursoController extends AbstractController<TipoRecurso> implements Serializable {

    @Inject
    private TipoRecursoFacade ejbFacade;

    public TipoRecursoController() {
        super(TipoRecurso.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
