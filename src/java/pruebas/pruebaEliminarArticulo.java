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
public class pruebaEliminarArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        articuloDAO mi_articulo_dao = new articuloDAO();
        ArrayList<articulo> mi_lista_articulo = mi_articulo_dao.ConsultarListadoArticulos(2, "Pantalon");

        for (articulo A : mi_lista_articulo) {

            System.out.println("ID del artículo - " + A.getId_articulo() + "\n" + "Nombre del artículo - " + A.getNombre_articulo() + "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_articulo_dao.EliminarArticulo(mi_lista_articulo.get(0));
        mi_lista_articulo = mi_articulo_dao.ConsultarListadoArticulos(2, "Pantalon");

        for (articulo A : mi_lista_articulo) {

            System.out.println("ID del artículo - " + A.getId_articulo() + "\n" + "Nombre del artículo - " + A.getNombre_articulo() + "\n");

        }

    }
}
