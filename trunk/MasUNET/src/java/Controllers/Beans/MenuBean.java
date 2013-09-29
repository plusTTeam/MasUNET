/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Entities.Pagina;
import Facades.PaginaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jesus
 */
@Named(value = "menuBean")
@RequestScoped
public class MenuBean {

    @EJB
    private PaginaFacade ejbFacade;
    
    /**
     * Creates a new instance of MenuBean
     */    
    public MenuBean() {
    
    }
    public List<Pagina> getMainMenu(){
        List<Pagina> aux = ejbFacade.FindListByTipo(1);
        return aux;
    }
    public Pagina getAdminMenu(){
        Pagina aux = ejbFacade.FindByTipo(0);
        return aux;
    }
    public List<Pagina> getAdminSubMenu(){
        List<Pagina> aux = ejbFacade.FindListByTipo(2);
        return aux;
    }
}
