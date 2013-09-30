/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Mensaje;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jesus
 */
@Stateless
public class MensajeFacade extends AbstractFacade<Mensaje> {

    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MensajeFacade() {
        super(Mensaje.class);
    }

    
    public Integer getIdLastMessage(){
        Query q = em.createQuery("SELECT MAX(m.idmensaje) FROM Mensaje m");
        try {
            return (Integer) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
