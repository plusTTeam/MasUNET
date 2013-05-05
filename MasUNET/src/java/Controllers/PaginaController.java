package Controllers;

import Entities.Pagina;
import Facades.PaginaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "paginaController")
@SessionScoped
public class PaginaController extends AbstractController<Pagina> implements Serializable {

    @Inject
    private PaginaFacade ejbFacade;

    public PaginaController() {
        super(Pagina.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
