package Controllers;

import Entities.Valoracion;
import Facades.ValoracionFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "valoracionController")
@SessionScoped
public class ValoracionController extends AbstractController<Valoracion> implements Serializable {

    @Inject
    private ValoracionFacade ejbFacade;

    public ValoracionController() {
        super(Valoracion.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getValoracionPK().setUsuarioIdusuario(this.getSelected().getUsuario().getIdusuario());
        this.getSelected().getValoracionPK().setRecursoIdrecurso(this.getSelected().getRecurso().getIdrecurso());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setValoracionPK(new Entities.ValoracionPK());
    }
}
