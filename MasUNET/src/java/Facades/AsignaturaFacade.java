/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Controllers.util.JsfUtil;
import Entities.Asignatura;
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
public class AsignaturaFacade extends AbstractFacade<Asignatura> {

    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsignaturaFacade() {
        super(Asignatura.class);
    }

    /**
     * Obtiene todas las Asignaturas que esta viendo un Estudiante por su numero
     * de cedula
     */
    public List<Asignatura> getAllSubjectsStudent(String Cedula, String Lapso) {
        Query q = em.createQuery("SELECT a FROM Asignatura a,VistaControlEstudiante vce where a.codMateria=vce.codMateria and vce.cedula = :cedula and vce.lapso = :lapso ORDER BY a.nombre");
        q.setParameter("cedula", Cedula);
        q.setParameter("lapso", Lapso);
        try {
            return (List<Asignatura>) q.getResultList();
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    /**
     * Obtiene todas las Asignaturas que esta dictando un Profesor por su numero
     * de cedula
     */
    public List<Asignatura> getAllSubjectsTeacher(String Cedula, String Lapso) {
        Query q = em.createQuery("SELECT a FROM Asignatura a,VistaControlProfesor vcp where a.codMateria=vcp.codMateria and vcp.cedula = :cedula and vcp.lapso = :lapso ORDER BY a.nombre");
        q.setParameter("cedula", Cedula);
        q.setParameter("lapso", Lapso);
        try {
            return (List<Asignatura>) q.getResultList();
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }
}
