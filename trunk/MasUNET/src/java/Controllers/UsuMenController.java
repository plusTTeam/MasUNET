package Controllers;

import Entities.UsuMen;
import Facades.UsuMenFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "usuMenController")
@SessionScoped
public class UsuMenController extends AbstractController<UsuMen> implements Serializable {

    @Inject
    private UsuMenFacade ejbFacade;

    public UsuMenController() {
        super(UsuMen.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getUsuMenPK().setMensajeIdmensaje(this.getSelected().getMensaje().getIdmensaje());
        this.getSelected().getUsuMenPK().setUsuarioIdusuario(this.getSelected().getUsuario().getIdusuario());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setUsuMenPK(new Entities.UsuMenPK());
    }
}
