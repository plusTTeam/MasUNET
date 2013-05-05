package Controllers;

import Entities.Rol;
import Facades.RolFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "rolController")
@SessionScoped
public class RolController extends AbstractController<Rol> implements Serializable {

    @Inject
    private RolFacade ejbFacade;

    public RolController() {
        super(Rol.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
