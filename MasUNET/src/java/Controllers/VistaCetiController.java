package Controllers;

import Entities.VistaCeti;
import Facades.VistaCetiFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "vistaCetiController")
@SessionScoped
public class VistaCetiController extends AbstractController<VistaCeti> implements Serializable {

    @Inject
    private VistaCetiFacade ejbFacade;

    public VistaCetiController() {
        super(VistaCeti.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
