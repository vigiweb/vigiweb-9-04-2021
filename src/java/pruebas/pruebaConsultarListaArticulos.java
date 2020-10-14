/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.articuloDAO;
import java.util.ArrayList;
import modelo.articulo;

/**
 *
 * @author Famil
 */
public class pruebaConsultarListaArticulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        articuloDAO articulo_dao = new articuloDAO();
        ArrayList<articulo> mi_articulo = new ArrayList<articulo>();
        mi_articulo = articulo_dao.ConsultarListadoArticulos(0, "");
        
        int size = mi_articulo.size();
        System.out.println("<table border=\"1\"><tr><td>id_articulo</td><td>nombre_articulo</td><td>precio_articulo</td><td>cantidad_articulo</td><td>iva_articulo</td><td>descripcion_articulo</td> "
                + " <td>estado_articulo</td><td>inventario_id_inventario</td><td>proveedor_id_proveedor</td> ");
        
        for(articulo A: mi_articulo){
            
            System.out.println("<tr>");
            System.out.println("<td>" + A.getId_articulo() + "</td>");
            System.out.println("<td>" + A.getNombre_articulo() + "</td>");
            System.out.println("<td>" + A.getPrecio_articulo() + "</td>");
            System.out.println("<td>" + A.getCantidad_articulo() + "</td>");
            System.out.println("<td>" + A.getIva_articulo() + "</td>");
            System.out.println("<td>" + A.getDescripcion_articulo() + "</td>");
            System.out.println("<td>" + A.getInventario_id_inventario() + "</td>");
            System.out.println("<td>" + A.getEstado_articulo_id_estado_articulo() + "</td>");
            System.out.println("<td>" + A.getProveedor_id_proveedor() + "</td>");

            
            System.out.println("</tr>");
            
        }

    }
    
}
