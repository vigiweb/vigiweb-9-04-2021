/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.inventarioDAO;
import java.util.ArrayList;
import modelo.inventario;

/**
 *
 * @author Famil
 */
public class pruebaConsultarListaInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inventarioDAO inventario_dao = new inventarioDAO();
        ArrayList<inventario> mi_inventario = new ArrayList<inventario>();
        mi_inventario = inventario_dao.ConsultarListadoInventario(0, 0, 0);

        int size = mi_inventario.size();
        System.out.println("<table border=\"1\"><tr><td>id_inventario</td><td>in_entradas</td><td>in_salidas</td><td>in_saldo</td> ");

        for (inventario D : mi_inventario) {

            System.out.println("<tr>");
            System.out.println("<td>" + D.getId_inventario() + "</td>");
            System.out.println("<td>" + D.getIn_entradas() + "</td>");
            System.out.println("<td>" + D.getIn_salidas() + "</td>");
            System.out.println("<td>" + D.getIn_saldo() + "</td>");

            System.out.println("</tr>");

        }
    }

}
