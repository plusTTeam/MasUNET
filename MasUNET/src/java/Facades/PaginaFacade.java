/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Controllers.util.JsfUtil;
import Entities.Pagina;
import java.util.List;
import java.util.ResourceBundle;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jesus
 */
@Stateless
public class PaginaFacade extends AbstractFacade<Pagina> {

    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaginaFacade() {
        super(Pagina.class);
    }

    public List<Pagina> FindListByTipo(int tipo) {
        try {
            Query query = em.createNamedQuery("Pagina.findByTipo");
            query.setParameter("tipo", tipo);      
            List<Pagina> aux = (List<Pagina>) query.getResultList();
            return aux;
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }

    }

    public Pagina FindByTipo(int tipo) {
        try {
            Query query = em.createNamedQuery("Pagina.findByTipo");
            query.setParameter("tipo", tipo);
            Pagina aux = (Pagina) query.getSingleResult();
            return aux;
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }

    }
}
