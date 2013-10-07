/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Usuario;
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
public class UsuarioFacade extends AbstractFacade<Usuario> {
    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario FindbyUsuario(String usuario){
        Query query = em.createNamedQuery("Usuario.findByUsuario");
        query.setParameter("usuario", usuario);
        Usuario aux;
        try{
            aux = (Usuario) query.getSingleResult();
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
    public Usuario FindbyCedula(String cedula){
        Query query = em.createNamedQuery("Usuario.findByCedula");
        query.setParameter("cedula", cedula);
        Usuario aux;
        try{
            aux = (Usuario) query.getSingleResult();
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
    public Usuario findTheacherSubject(String codmateria,String lapso,int seccion){
        Query q = em.createQuery("SELECT u from Usuario u,VistaControlProfesor vcp where vcp.cedula=u.cedula and vcp.codMateria = :codmateria and vcp.lapso= :lapso and vcp.seccion = :seccion ORDER BY u.nombre");
        q.setParameter("codmateria", codmateria);
        q.setParameter("lapso",lapso);
        q.setParameter("seccion",seccion);
        try {
            return (Usuario) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    public List<Usuario> findAllStudentsSubject(String codmateria,String lapso,int seccion){
        Query q = em.createQuery("SELECT u from Usuario u,VistaControlEstudiante vce where vce.cedula=u.cedula and vce.codMateria = :codmateria and vce.lapso= :lapso and vce.seccion=:seccion ORDER BY u.nombre");
        q.setParameter("codmateria", codmateria);
        q.setParameter("lapso",lapso);
         q.setParameter("seccion",seccion);
        try {
            return (List<Usuario>) q.getResultList();
        } catch (Exception e) {
            return null;
        }
        
    }
    public List<Usuario> findAllStudentsSubjectForMessage(String codmateria,String lapso,String cedula,int seccion){
        Query q = em.createQuery("SELECT DISTINCT u from Usuario u,VistaControlEstudiante vce,VistaControlProfesor vcp "
                + "where (vce.cedula=u.cedula "
                + "and vce.codMateria = :codmateria "
                + "and vce.lapso = :lapso "
                + "and u.cedula != :cedula "
                + "and vce.seccion = :seccion) or (vcp.cedula=u.cedula "
                + "and vcp.codMateria = :codmateria "
                + "and vcp.lapso = :lapso "
                + "and vcp.seccion = :seccion) "
                + "ORDER BY u.nombre");
        q.setParameter("codmateria", codmateria);
        q.setParameter("lapso",lapso);
        q.setParameter("cedula",cedula);
        q.setParameter("seccion",seccion);
        try {
            return (List<Usuario>) q.getResultList();      
        } catch (Exception e) {
            return null;
        }
        
    }
    public List<Usuario> findAllUsers(){
        Query q = em.createQuery("SELECT u from Usuario u");
        try {
            return (List<Usuario>) q.getResultList();      
        } catch (Exception e) {
            return null;
        }
        
    }
}
