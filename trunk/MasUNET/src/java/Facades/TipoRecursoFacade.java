/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.TipoRecurso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jesus
 */
@Stateless
public class TipoRecursoFacade extends AbstractFacade<TipoRecurso> {
    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoRecursoFacade() {
        super(TipoRecurso.class);
    }
    
        
    public TipoRecurso FindByExtension(String ExtensionF) {
        //Hago el Query:
        Query query = em.createNamedQuery("TipoRecurso.findByExtension");
        query.setParameter("extension", ExtensionF);
        TipoRecurso objAuxTipoRecurso;
        try {
            objAuxTipoRecurso = (TipoRecurso) query.getSingleResult();
            if (objAuxTipoRecurso != null) {
                return objAuxTipoRecurso;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
}
