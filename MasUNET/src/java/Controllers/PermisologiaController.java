package Controllers;

import Entities.Permisologia;
import Facades.PermisologiaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "permisologiaController")
@SessionScoped
public class PermisologiaController extends AbstractController<Permisologia> implements Serializable {

    @Inject
    private PermisologiaFacade ejbFacade;

    public PermisologiaController() {
        super(Permisologia.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getPermisologiaPK().setPaginaIdpagina(this.getSelected().getPagina().getIdpagina());
        this.getSelected().getPermisologiaPK().setRolIdrol(this.getSelected().getRol().getIdrol());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setPermisologiaPK(new Entities.PermisologiaPK());
    }
}
