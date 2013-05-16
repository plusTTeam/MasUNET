/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Controllers.util.JsfUtil;
import Entities.Evento;
import Entities.Usuario;
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
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }        
    }
}
