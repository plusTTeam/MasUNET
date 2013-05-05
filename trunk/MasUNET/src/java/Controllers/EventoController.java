package Controllers;

import Entities.Evento;
import Facades.EventoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "eventoController")
@SessionScoped
public class EventoController extends AbstractController<Evento> implements Serializable {

    @Inject
    private EventoFacade ejbFacade;

    public EventoController() {
        super(Evento.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
