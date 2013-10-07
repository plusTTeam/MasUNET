/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Mensaje;
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
    public List<Mensaje> getMessageUser(Integer iduser, Integer idusermessage) {
        Query q = em.createQuery("SELECT um.mensaje FROM UsuMen um "
                + "WHERE (um.usuMenPK.usuarioIdusuario = :idusermessage "
                + "AND um.mensaje.idusuario.idusuario = :iduser) or (um.usuMenPK.usuarioIdusuario = :iduser "
                + "AND um.mensaje.idusuario.idusuario = :idusermessage) "
                + "ORDER BY um.mensaje.fecha ASC");
        q.setParameter("idusermessage", iduser);
        q.setParameter("iduser", idusermessage);
        try {
            return (List<Mensaje>) q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
}
