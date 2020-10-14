/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.ciudadDAO;
import java.util.ArrayList;
import modelo.ciudad;

/**
 *
 * @author Famil
 */
public class pruebaConsultarListaCiudad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ciudadDAO ciudad_dao = new ciudadDAO();
        ArrayList<ciudad> mi_ciudad = new ArrayList<ciudad>();
        mi_ciudad = ciudad_dao.ConsultarListadoCiudad("", "");

        int size = mi_ciudad.size();
        System.out.println("<table border=\"1\"><tr><td>id_cat_mat_prim</td><td>descrip</td> ");

        for (ciudad C : mi_ciudad) {

            System.out.println("<tr>");
            System.out.println("<td>" + C.getId_ciudad() + "</td>");
            System.out.println("<td>" + C.getDescrip_ciudad() + "</td>");

            System.out.println("</tr>");

        }
    }

}
