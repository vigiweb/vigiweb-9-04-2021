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
public class pruebaAdicionarInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        inventarioDAO mi_inventario_dao = new inventarioDAO();
        inventario mi_inventario = new inventario();
        
        Scanner teclado = new Scanner (System.in);
        
        double in_entradas;
        double in_salidas;
        double in_saldo;
        
        System.out.println("Ingrese la entrada del inventario");
        in_entradas = teclado.nextDouble();
        
        System.out.println("Ingrese la salida del inventario");
        in_salidas = teclado.nextDouble();
        
        System.out.println("Ingrese el saldo del inventario");
        in_saldo = teclado.nextDouble();
        
        mi_inventario.setIn_entradas(in_entradas);
        mi_inventario.setIn_salidas(in_salidas);
        mi_inventario.setIn_saldo(in_saldo);
        String miRespuesta = mi_inventario_dao.AdicionarInventario(mi_inventario);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Adición exitosa");
        }else {
            System.out.println("Ocurrio un error " + miRespuesta);
        }
    }
}
