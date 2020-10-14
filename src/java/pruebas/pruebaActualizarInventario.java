/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.inventarioDAO;
import java.util.Scanner;
import modelo.inventario;

/**
 *
 * @author Famil
 */
public class pruebaActualizarInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inventarioDAO mi_inventario_dao = new inventarioDAO();
        inventario mi_inventario = new inventario();

        Scanner teclado = new Scanner(System.in);

        int id_inventario;
        double in_entradas;
        double in_salidas;
        double in_saldo;

        System.out.println("Ingrese la entrada del inventario");
        in_entradas = teclado.nextDouble();

        System.out.println("Ingrese la salida del inventario");
        in_salidas = teclado.nextDouble();

        System.out.println("Ingrese el saldo del inventario");
        in_saldo = teclado.nextDouble();
        
        System.out.println("Ingrese el ID del inventario");
        id_inventario = teclado.nextInt();

        mi_inventario.setId_inventario(id_inventario);
        mi_inventario.setIn_entradas(in_entradas);
        mi_inventario.setIn_salidas(in_salidas);
        mi_inventario.setIn_saldo(in_saldo);

        mi_inventario.setId_inventario(id_inventario);

        String respuesta = mi_inventario_dao.ActualizarInventario(mi_inventario);

        if (respuesta.length() == 0) {

            System.out.println("Actualización exitosa");
        } else {
            System.out.println("Ocurrio un error " + respuesta);
        }
    }
}
