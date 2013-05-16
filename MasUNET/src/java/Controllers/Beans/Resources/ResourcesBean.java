/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans.Resources;
//Default Imports 
import Controllers.AsignaturaController;
import Controllers.RecursoController;
import Controllers.TipoRecursoController;
import Converters.AsignaturaConverter;
import Entities.Asignatura;
import Entities.Recurso;
import Entities.TipoRecurso;
import Entities.Valoracion;
import Entities.VistaControlEstudiante;
import Facades.AsignaturaFacade;
import Facades.RecursoFacade;
import Facades.TipoRecursoFacade;
import Facades.VistaControlEstudianteFacade;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.List;
import javax.ejb.EJB;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.ItemSelectEvent;
//New Ones
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author RoyCalderon 
 */
@Named(value = "resourcesBean")
@ApplicationScoped
public class ResourcesBean {

    /**
     * Creates a new instance of ResourcesBean
     */
    //Objetos de componentes...
    private TreeNode treeRoot;
    //Objetos  de Entidades...
    private Recurso e_Recurso;
    
    //Objetos de Controladores...
    private RecursoController c_Recurso;
    //
    private AsignaturaController c_Asig;
    //
    private TipoRecursoController c_TipoRecurso;
    
    //Nodo seleccionado que retornare para montar en el dialog... 
    private Node selectedNode;
    //Asignatura seleccionada...
    private Asignatura asignaturaSeleccionada;
    
    
    @Inject
    private RecursoFacade ejbFacade;
    @Inject
    private TipoRecursoFacade ejbFacade_TipoRecurso;
    @Inject
    private AsignaturaFacade ejbFacade_Asignatura;
    @EJB
    private VistaControlEstudianteFacade ejbFacade_VistaControlEstudiante;
    
    

    //Constructor!
    public ResourcesBean() {
    }

    public RecursoController getC_Recurso() {
        //Deberia Tomar en cuenta el caso de que venga Vacio...      
        return c_Recurso;
    }

    public Recurso getE_Recurso() {
        return e_Recurso;
    }

    public void setE_Recurso(Recurso e_Recurso) {
        this.e_Recurso = e_Recurso;
    }

    
    
    
    public void setC_Recurso(RecursoController c_Recurso) {
        this.c_Recurso = c_Recurso;
    }

    //Getters de Asignatura y TipoRecurso
    public AsignaturaController getC_Asig() {
        return c_Asig;
    }

    public TipoRecursoController getC_TipoRecurso() {
        return c_TipoRecurso;
    }

    /**
     * TREENODE ;)
     *
     * @author RoyCalderon 
     */
    public TreeNode getTreeRoot() {
        if (treeRoot == null) {
            treeRoot = new DefaultTreeNode("root", null);

            for (Asignatura objAsig : ejbFacade_Asignatura.findAll()) {
                TreeNode node_Asignatura = new DefaultTreeNode(new Node(objAsig.getNombre(), objAsig.getDescripcion(), "Carpeta", "-"), treeRoot);
                for (Recurso objRecur : objAsig.getRecursoList()) {
                    TreeNode node_Recurso = new DefaultTreeNode(new Node(objRecur.getNombre(), objRecur.getDescripcion(), objRecur.getIdTiporecurso().getNombre(), "Valoracion xD"), node_Asignatura);
                }
            }
        }
        return treeRoot;
    }

    //Getting Listas
    private List<Recurso> getRecurso(TipoRecurso Tp, Asignatura Asig) {
        return ejbFacade.findAll();
    }

    public List<Recurso> getRecursosOrderedByTipoRecurso() {
        return getC_Recurso().getRecursosOrderedByTipoRecurso();
    }

    //Set^Getters of Node!
    public Node getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(Node selectedNode) {
        this.selectedNode = selectedNode;
    }

    //Set^Getters of Asignatura
    public Asignatura getAsignaturaSeleccionada() {
        return asignaturaSeleccionada;
    }

    public void setAsignaturaSeleccionada(Asignatura asignaturaSeleccionada) {
        this.asignaturaSeleccionada = asignaturaSeleccionada;
    }
    
    
    

    /**
     * FILE UPLOADING ;)
     *
     * @author RoyCalderon 
     */
    public void handleFileUpload(FileUploadEvent event) {

        ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();
        File result = new File(extContext.getRealPath("//WEB-INF//Resources//" + event.getFile().getFileName()));
        System.out.println(extContext.getRealPath("//WEB-INF//Resources//" + event.getFile().getFileName()));
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(result);

            byte[] buffer = new byte[(int) event.getFile().getSize()];

            int bulk;
            InputStream inputStream = event.getFile().getInputstream();
            while (true) {
                bulk = inputStream.read(buffer);
                if (bulk < 0) {
                    break;
                }
                fileOutputStream.write(buffer, 0, bulk);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStream.close();

            FacesMessage msg =
                    new FacesMessage("Descripcion del Archivo :)",
                    "\nNombre: " + event.getFile().getFileName()
                    + "\nTamaño: " + event.getFile().getSize() / 1024
                    + "Kb\nTipo De Archivo: " + event.getFile().getContentType()
                    + "\nEl archivo se subío exitosamente!"
                    + "\nA la asignatura: " + e_Recurso.getNombre());
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (IOException e) {
            e.printStackTrace();

            FacesMessage error = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Se ha producido un error interno del sistema en el intento de carga de archivo. Hemos registrado este error. Intentelo nuevamente.", "");
            FacesContext.getCurrentInstance().addMessage(null, error);
        }
    }

    /**
     * SELECT 1 MENU ;)
     *
     * @author RoyCalderon 
     */
    public List<Asignatura> select1Item()
    { 
        return ejbFacade_VistaControlEstudiante.findAsignaturas4user("V19235763", ejbFacade.getCurrentLapso());
    }
    
}
