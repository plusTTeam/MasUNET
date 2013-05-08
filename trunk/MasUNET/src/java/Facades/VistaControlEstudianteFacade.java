/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Usuario;
import Entities.VistaControlEstudiante;
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
    public VistaControlEstudiante FindbyCedula(String cedula){
        Query query = em.createNamedQuery("VistaControlEstudiante.findByCedula");
        query.setParameter("cedula", cedula);
        VistaControlEstudiante aux;
        try{
            aux = (VistaControlEstudiante) query.getResultList().get(0);
            if(aux!=null) {
                return aux;
            }
            else {
                return null;
            }
        }catch(Exception e){
            return null;
        }
    }
}
