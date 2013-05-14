package Controllers;

import Entities.Asignatura;
import Entities.Recurso;
import Entities.TipoRecurso;
import Facades.RecursoFacade;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

@Named(value = "recursoController")
@SessionScoped
public class RecursoController extends AbstractController<Recurso> implements Serializable {

    //WHAAAAT
    public RecursoController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    //Default
    @Inject//Para que se instancie automaticamente el EJB
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
        return aux;
    }

    //In case i need an advanced query
    public List<Recurso> findRecursosEntities(TipoRecurso Tp, Asignatura Asig) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Recursos.findByidTipoRecurso");
            q.setParameter("idTipoRecurso", Tp.getIdTiporecurso());
            q.setParameter("idAsignatura", Asig.getCodMateria());
            return q.getResultList();
        } catch (Exception e) {
        }
        return null;
    }

    //Advanced Query for get ordered resources by type
    public List<Recurso> getRecursosOrderedByTipoRecurso() {
        //?
        EntityManager em = getEntityManager();
        
        try {
            Query queryRecursos = em.createQuery("SELECT R FROM RECURSO R ORDER BY R.idTipo_recurso;");
            return queryRecursos.getResultList();
        } catch (Exception e) {
        }
        return null;
    }
}
