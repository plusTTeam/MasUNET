/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans.Resources;

/**
 * Clase Dedicada para 
 *
 * @author roycalderon
 */

public class Node {

        private String nombre;
        private String descripcion;
        private String tipo;
        private String valoracion;

        public Node(String nombre, String descripcion, String tipo, String valoracion) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.tipo = tipo;
            this.valoracion = valoracion;
        }

        //Getters ^^
        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getTipo() {
            return tipo;
        }

        public String getValoracion() {
            return valoracion;
        }
        
    }
