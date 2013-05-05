package Controllers;

import Entities.UserEven;
import Facades.UserEvenFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "userEvenController")
@SessionScoped
public class UserEvenController extends AbstractController<UserEven> implements Serializable {

    @Inject
    private UserEvenFacade ejbFacade;

    public UserEvenController() {
        super(UserEven.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getUserEvenPK().setEventoIdevento(this.getSelected().getEvento().getIdevento());
        this.getSelected().getUserEvenPK().setUsuarioIdusuario(this.getSelected().getUsuario().getIdusuario());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setUserEvenPK(new Entities.UserEvenPK());
    }
}
