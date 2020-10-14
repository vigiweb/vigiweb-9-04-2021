/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.listar;

import controlador.tipoGeneroDAO;
import java.util.ArrayList;
import modelo.tipo_genero;

/**
 *
 * @author Famil
 */
public class pruebaListarTipoGenero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tipoGeneroDAO tipo_genero_dao = new tipoGeneroDAO ();
        ArrayList<tipo_genero> mi_tipo_genero = new ArrayList<tipo_genero>();
        mi_tipo_genero = tipo_genero_dao.ConsultarListadoTipoGenero(0, "");

        int size = mi_tipo_genero.size();
        System.out.println("<table border=\"1\"><tr><td>id_cat_mat_prim</td><td>descrip</td> ");

        for (tipo_genero C : mi_tipo_genero) {

            System.out.println("<tr>");
            System.out.println("<td>" + C.getId_tipo_genero() + "</td>");
            System.out.println("<td>" + C.getDescrip_genero() + "</td>");

            System.out.println("</tr>");

        }
    }
    
}
