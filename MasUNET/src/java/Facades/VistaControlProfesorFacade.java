/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.VistaControlEstudiante;
import Entities.VistaControlProfesor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jesus
 */
@Stateless
public class VistaControlProfesorFacade extends AbstractFacade<VistaControlProfesor> {
    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VistaControlProfesorFacade() {
        super(VistaControlProfesor.class);
    }
     public VistaControlProfesor FindbyCedula(String cedula){
        Query query = em.createNamedQuery("VistaControlProfesor.findByCedula");
        query.setParameter("cedula", cedula);
        VistaControlProfesor aux;
        try{
            aux = (VistaControlProfesor) query.getSingleResult();
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
