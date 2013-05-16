/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Asignatura;
import Entities.Usuario;
import Entities.VistaControlEstudiante;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jesus
 */
@Stateless
public class VistaControlEstudianteFacade extends AbstractFacade<VistaControlEstudiante> {

    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VistaControlEstudianteFacade() {
        super(VistaControlEstudiante.class);
    }

    //Single Result
    public VistaControlEstudiante FindbyCedula(String cedula) {
        Query query = em.createNamedQuery("VistaControlEstudiante.findByCedula");
        query.setParameter("cedula", cedula);
        VistaControlEstudiante aux;
        try {
            aux = (VistaControlEstudiante) query.getResultList().get(0);
            if (aux != null) {
                return aux;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Multiple Results In case i need an advanced query
     *
     */
    public List<Asignatura> findAsignaturas4user(String cedulaUser, String lapso) {

        //Query query = em.createNamedQuery("VistaControlEstudiante.findByCedula");
        Query query = em.createQuery("SELECT a FROM Asignatura a, VistaControlEstudiante vce where (vce.codMateria = a.codMateria and vce.lapso= :lapso and vce.cedula=:cedula)");
        query.setParameter("cedula", cedulaUser);
        query.setParameter("lapso", lapso);
        List<Asignatura> aux;
        try {
            aux = (List<Asignatura>) query.getResultList();
            return aux;

        } catch (Exception e) {
            return null;
        }
    }
}
