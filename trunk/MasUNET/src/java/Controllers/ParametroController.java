package Controllers;

import Entities.Parametro;
import Facades.ParametroFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "parametroController")
@SessionScoped
public class ParametroController extends AbstractController<Parametro> implements Serializable {

    @Inject
    private ParametroFacade ejbFacade;

    public ParametroController() {
        super(Parametro.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
