package Controllers;

import Entities.TipoEvento;
import Facades.TipoEventoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "tipoEventoController")
@SessionScoped
public class TipoEventoController extends AbstractController<TipoEvento> implements Serializable {

    @Inject
    private TipoEventoFacade ejbFacade;

    public TipoEventoController() {
        super(TipoEvento.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
