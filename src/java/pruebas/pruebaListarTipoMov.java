/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.listar;

import controlador.tipoMovDAO;
import java.util.ArrayList;
import modelo.tipo_mov;

/**
 *
 * @author Famil
 */
public class pruebaListarTipoMov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tipoMovDAO tipo_mov_dao = new tipoMovDAO();
        ArrayList<tipo_mov> mi_tipo_mov = new ArrayList<tipo_mov>();
        mi_tipo_mov = tipo_mov_dao.ConsultarListadoTipoMov(0, "");

        int size = mi_tipo_mov.size();
        System.out.println("<table border=\"1\"><tr><td>id_cat_mat_prim</td><td>descrip</td> ");

        for (tipo_mov C : mi_tipo_mov) {

            System.out.println("<tr>");
            System.out.println("<td>" + C.getId_tipo_mov() + "</td>");
            System.out.println("<td>" + C.getM_descrip() + "</td>");

            System.out.println("</tr>");

        }
    }
    
}
