/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans.Resources;
//Default Imports 
import Controllers.AbstractController;
import Controllers.AsignaturaController;
import Controllers.RecursoController;
import Controllers.TipoRecursoController;
import Entities.Asignatura;
import Entities.Recurso;
import Entities.TipoRecurso;
import Facades.AsignaturaFacade;
import Facades.RecursoFacade;
import Facades.TipoRecursoFacade;
import Facades.UsuarioFacade;
import Facades.VistaControlEstudianteFacade;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author RoyCalderon 
 */
//NamedBean: Apodo para acceder en las vistas...
@Named(value = "resourcesBean")
//@ApplicationScoped No sirve el file upload...
//@SessionScoped //con esta mierda tampoco sirve el fileupload... 
@RequestScoped
public class ResourcesBean extends AbstractController<Recurso> implements Serializable {

    //Usados para Cargar los recursos... 
    //Otros Objetos
    private UploadedFile file;
    //Objetos de componentes...
    //TreeNode para el Arbol
    private TreeNode treeRoot;
    //Nodo seleccionado que retornare para montar en el dialog... 
    private Node selectedNode;
    //Objetos  de Entidades...
    private Recurso e_Recurso;
    private Asignatura e_Asignatura;
    //Objetos de Controladores...
    private RecursoController c_Recurso;
    private AsignaturaController c_Asig;
    private TipoRecursoController c_TipoRecurso;
    //Los Inject :p
    @EJB
    private RecursoFacade ejbFacade;
    @EJB
    private TipoRecursoFacade ejbFacade_TipoRecurso;
    @EJB
    private AsignaturaFacade ejbFacade_Asignatura;
    //Para que funcionen los EJB debo implementar la etiqueta @EJB... 
    @EJB
    private VistaControlEstudianteFacade ejbFacade_VistaControlEstudiante;
    @EJB
    private UsuarioFacade ejbFacade_Usuario;

    //Constructor!
    public ResourcesBean() {
        super(Recurso.class);   //Para que sepa que clase esta implementando
        if (e_Asignatura == null) {
            e_Asignatura = new Asignatura();
        }
        if (getSelected() == null) {
            prepareCreate(null);
        }
    }

    //SETTERS AND GETTERS !!!!
    public RecursoController getC_Recurso() {
        //Deberia Tomar en cuenta el caso de que venga Vacio...      
        return c_Recurso;
    }
    //Entidades... 
//    public Recurso getE_Recurso() {
//        return e_Recurso;
//    }
//
//    public void setE_Recurso(Recurso e_Recurso) {
//        this.e_Recurso = e_Recurso;
//    }

    public Asignatura getE_Asignatura() {
        return e_Asignatura;
    }

    public void setE_Asignatura(Asignatura e_Asignatura) {
        if (e_Asignatura != null) {
            this.e_Asignatura = e_Asignatura;
        }
    }

    //Componentes...
    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public Node getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(Node selectedNode) {
        this.selectedNode = selectedNode;
    }

    //CONTROladores
    public void setC_Recurso(RecursoController c_Recurso) {
        this.c_Recurso = c_Recurso;
    }

    public AsignaturaController getC_Asig() {
        return c_Asig;
    }

    public TipoRecursoController getC_TipoRecurso() {
        return c_TipoRecurso;
    }

    public void upload() {
        if (file != null && e_Asignatura != null && e_Asignatura.getIdasignatura() != null) {

            ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();
            File Folder = new File(extContext.getRealPath("..//..//web//NimRod//" + e_Asignatura.getNombre() + "//"));
            Folder.mkdir();
            File result = new File(extContext.getRealPath("..//..//web//NimRod//" + e_Asignatura.getNombre() + "//" + file.getFileName()));


            try {
                FileOutputStream fileOutputStream = new FileOutputStream(result);

                byte[] buffer = new byte[(int) file.getSize()];

                int bulk;
                InputStream inputStream = file.getInputstream();
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
                        new FacesMessage("Descripcion del Archivo :) "
                        + "\nNombre: " + file.getFileName()
                        + "\nTamaño: " + file.getSize() / 1024
                        + "Kb\nTipo De Archivo: " + file.getContentType()
                        + "\nEl archivo se subío exitosamente!"
                        + "\nA la asignatura: " + getSelected().getNombre() + "Y recurso es: " + getSelected().getNombre());
                FacesContext.getCurrentInstance().addMessage("Recurso Subido", msg);

                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();

//                addMessageInfo("Archivo " + super.getSelected().getNombre() + " Subida", 
//                         "\nArchivo: " + file.getFileName() +
//                        "\nTamaño: " + file.getSize() / 1024 +
//                        "Kb\nTipo De Archivo: " + file.getContentType() +
//                        "\nEl archivo se subío exitosamente!\n" +
//                        "\nA la asignatura:" + e_Asignatura.getNombre() + "Con Nombre :" + getSelected().getNombre()); 

                String[] ext = file.getContentType().split("/");
                //addMessageInfo("TEST",ext[1]);
                //Setting values to Recurso Object before creating on DB 
                TipoRecurso tipo = null;
                for (TipoRecurso aux : ejbFacade_TipoRecurso.findAll()) {
                    if (ext[1].toLowerCase().contains(aux.getExtension().toLowerCase())) {
                        tipo = aux;
                    }
                }
                if (tipo != null) {
                    super.getSelected().setUrl(Folder.toString());
                    super.getSelected().setFechaSubida(new Date());
                    super.getSelected().setUsuarioIdusuario(ejbFacade_Usuario.find(ejbFacade_Usuario.getIdCurrentUser()));
                    super.getSelected().setIdTiporecurso(tipo);
                    //super.getSelected().setValoracionList(new ArrayList<Valoracion>());   
                    super.getSelected().setNumeroDescargas(0);
                    super.getSelected().setAsignaturaIdasignatura(e_Asignatura);
                    //Save new automatically calls Facade that comunicates directly with DB
                    ejbFacade.create(super.getSelected()); //SAve para editar... //Delete para eliminar 
                    //super.saveNew(null);
                }


            } catch (IOException e) {
                e.printStackTrace();
                FacesMessage error = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Se ha producido un error interno del sistema en el intento de carga de archivo. Hemos registrado este error. Intentelo nuevamente.", "");
                FacesContext.getCurrentInstance().addMessage(null, error);
            }
        }
    }

    /**
     * SELECT 1 MENU ;)
     *
     * @author RoyCalderon 
     */
    public List<Asignatura> select1Item() {
        return ejbFacade_VistaControlEstudiante.findAsignaturas4user(ejbFacade.getCedulaCurrentUser(), ejbFacade.getCurrentLapso());
    }

    /**
     * TREENODE ;)
     *
     * @author RoyCalderon 
     */
    public TreeNode getTreeRoot() {
        List<Asignatura> userAsignatures = ejbFacade_Asignatura.getAllSubjectsStudent(ejbFacade.getCedulaCurrentUser(), ejbFacade.getCurrentLapso());

        if (treeRoot == null) {
            treeRoot = new DefaultTreeNode("root", null);

            for (Asignatura objAsig : ejbFacade_Asignatura.getAllSubjectsStudent(ejbFacade.getCedulaCurrentUser(), ejbFacade.getCurrentLapso())) {
                TreeNode node_Asignatura = new DefaultTreeNode(new Node(objAsig.getNombre(), objAsig.getDescripcion(), "Carpeta", "-"), treeRoot);
                for (Recurso objRecur : objAsig.getRecursoList()) {
                    TreeNode node_Recurso = new DefaultTreeNode(new Node(objRecur.getNombre(), objRecur.getDescripcion(), objRecur.getIdTiporecurso().getNombre(), "Calculando ... xD"), node_Asignatura);
                    //Ir al archivo, Calcular tamaño
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
    /**
     * Vista de un recurso en particular;)
     *
     * @author RoyCalderon 
     */
    //private Integer resourceRatingPromedio;
}
