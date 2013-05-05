package Controllers;

import Entities.Bitacora;
import Facades.BitacoraFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "bitacoraController")
@SessionScoped
public class BitacoraController extends AbstractController<Bitacora> implements Serializable {

    @Inject
    private BitacoraFacade ejbFacade;

    public BitacoraController() {
        super(Bitacora.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
