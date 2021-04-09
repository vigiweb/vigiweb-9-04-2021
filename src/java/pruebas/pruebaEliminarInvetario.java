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
public class pruebaEliminarInvetario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inventarioDAO mi_inventario_dao = new inventarioDAO();
        ArrayList<inventario> mi_lista_inventario = mi_inventario_dao.ConsultarListadoInventario("", "", "");

        for (inventario I : mi_lista_inventario) {

            System.out.println("ID del inventario - " + I.getId_inventario() + "\n" + "Entradas - " + I.getIn_saldo() + "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_inventario_dao.EliminarInventario(mi_lista_inventario.get(0));
        mi_lista_inventario = mi_inventario_dao.ConsultarListadoInventario("", "", "");

        for (inventario I : mi_lista_inventario) {

            System.out.println("Número de id del inventario - " + I.getId_inventario() + "\n" + "Entradas - " + I.getIn_saldo() + "\n");

        }

    }
}
