/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Controllers.Beans.LoginBean;
import Controllers.util.JsfUtil;
import Entities.Evento;
import Entities.Usuario;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jesus
 */
@Stateless
public class EventoFacade extends AbstractFacade<Evento> {
    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EventoFacade() {
        super(Evento.class);
    }
    /**
     * Obtiene todos los Eventos de un Estudiante
     * @param cedula
     * @param lapso
     * @return 
     */
    public List<Evento> getAllEventsStudent(Usuario iduser,String cedula){
        Query q = em.createQuery("SELECT DISTINCT e FROM Asignatura a, VistaControlEstudiante vce, Evento e where (vce.codMateria=a.codMateria and vce.cedula = :cedula and a = e.asignaturaIdasignatura) or (e.usuarioIdusuario = :iduser)");
        q.setParameter("iduser",iduser);
        q.setParameter("cedula",cedula);
        try {
            return (List<Evento>) q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }        
    }
    
    public List<Evento> getAllEventsSubject(Integer idasignatura){
        Query q = em.createQuery("SELECT e FROM Asignatura a, Evento e where a.idasignatura = :idasignatura and e.asignaturaIdasignatura=a");
        q.setParameter("idasignatura",idasignatura);
        try {
            return (List<Evento>) q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }        
    }
    public List<Evento> getAllEventsPersonal(Integer iduser){
        Query q = em.createQuery("SELECT e FROM Evento e where e.usuarioIdusuario.idusuario = :iduser and e.asignaturaIdasignatura is NULL");
        q.setParameter("iduser",iduser);
        try {
            return (List<Evento>) q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }        
    }
    public Evento getLastEvent(){
        Query q = em.createQuery("SELECT e FROM Evento e ORDER BY DESC e.idevento");
        try {
            return (Evento) q.getSingleResult();
        } catch (Exception ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }        
    }
}
