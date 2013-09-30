/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.UsuMen;
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
public class UsuMenFacade extends AbstractFacade<UsuMen> {
    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuMenFacade() {
        super(UsuMen.class);
    }
    public List<UsuMen> getMessageUser(Integer iduser, Integer idusermessage) {
        Query q = em.createQuery("SELECT um FROM UsuMen um "
                + "WHERE (um.usuMenPK.usuarioIdusuario = :idusermessage "
                + "AND um.mensaje.idusuario.idusuario = :iduser) or (um.usuMenPK.usuarioIdusuario = :iduser "
                + "AND um.mensaje.idusuario.idusuario = :idusermessage) "
                + "ORDER BY um.mensaje.fecha DESC");
        q.setParameter("idusermessage", iduser);
        q.setParameter("iduser", idusermessage);
        try {
            return (List<UsuMen>) q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
}
