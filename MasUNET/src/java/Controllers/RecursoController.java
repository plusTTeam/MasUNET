package Controllers;

import Entities.Recurso;
import Facades.RecursoFacade;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;

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

    @Override
    public Recurso prepareCreate(ActionEvent event) {    
        Recurso aux = super.prepareCreate(event);
        super.getSelected().setFechaSubida(new Date());
        return  aux;
    }
    
}
