/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Controllers.util.JsfUtil;
import Entities.Parametro;
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
public class ParametroFacade extends AbstractFacade<Parametro> {

    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParametroFacade() {
        super(Parametro.class);
    }

    public String findByNombre(String parametro) {
        Query q = em.createNamedQuery("Parametro.findByNombre");
        q.setParameter("nombre", parametro);
        try {
            Parametro aux =(Parametro) q.getSingleResult();
            return aux.getValor();
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }
}
