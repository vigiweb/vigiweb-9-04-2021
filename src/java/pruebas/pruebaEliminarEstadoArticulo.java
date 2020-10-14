/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.eliminar;
import modelo.estado_articulo;
import controlador.estadoArticuloDAO;
import java.util.ArrayList;
/**
 *
 * @author Famil
 */
public class pruebaEliminarEstadoArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoArticuloDAO estado_articulo_dao = new estadoArticuloDAO();
        
        ArrayList<estado_articulo> mi_listado_estado_articulo = estado_articulo_dao.ConsultarListadoEstadoArticulo(2, "Activo");
        for (estado_articulo C : mi_listado_estado_articulo) {
            System.out.println(" ID. " + C.getId_estado_articulo() + " Descripción : " + C.getDescrip_estado());
        }
        System.out.println("Se elimino");
        estado_articulo_dao.EliminarEstadoArticulo(mi_listado_estado_articulo.get(0));
        mi_listado_estado_articulo = estado_articulo_dao.ConsultarListadoEstadoArticulo(2, "Activo");
        for (estado_articulo C : mi_listado_estado_articulo) {
            System.out.println(" ID. " + C.getId_estado_articulo() + " Descripción : " + C.getDescrip_estado());
        }
    }
    
}
