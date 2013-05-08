/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Usuario;
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
}
