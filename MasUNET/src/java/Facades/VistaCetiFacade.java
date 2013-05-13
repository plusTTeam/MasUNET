/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.VistaCeti;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jesus
 */
@Stateless
public class VistaCetiFacade extends AbstractFacade<VistaCeti> {

    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VistaCetiFacade() {
        super(VistaCeti.class);
    }

    public VistaCeti FindUserAndPass(String user, String pass) {
        VistaCeti aux;
        if (!user.isEmpty() & !pass.isEmpty()) {
            try {
                Query query = em.createQuery("SELECT v FROM VistaCeti v WHERE v.usuario = :usuario and v.clave = :clave");
                query.setParameter("usuario", user);
                query.setParameter("clave", pass);
                aux = (VistaCeti) query.getSingleResult();
                if (aux != null) {
                    return aux;
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
        } else {
            return null;
        }
    }
}
