/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.listar;
import controlador.estadoArticuloDAO;
import java.util.ArrayList;
import modelo.estado_articulo;

/**
 *
 * @author Famil
 */
public class pruebaConsultarListaEstadoArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoArticuloDAO estado_articulo_dao = new estadoArticuloDAO();
        ArrayList<estado_articulo> mi_estado_articulo = new ArrayList<estado_articulo>();
        mi_estado_articulo = estado_articulo_dao.ConsultarListadoEstadoArticulo(0, "");
        
        int size = mi_estado_articulo.size();
        System.out.println("<table border=\"1\"><tr><td>id_estado_articulo</td><td>descrip_estado</td> ");
        
        for(estado_articulo E: mi_estado_articulo){
            
            System.out.println("<tr>");
            System.out.println("<td>" + E.getId_estado_articulo() + "</td>");
            System.out.println("<td>" + E.getDescrip_estado() + "</td>");
            
            
            System.out.println("</tr>");
            
        }
    }
    
}
