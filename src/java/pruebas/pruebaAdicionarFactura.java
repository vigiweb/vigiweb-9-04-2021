/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.facturaDAO;
import java.util.Scanner;
import modelo.factura;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        facturaDAO mi_factura_dao = new facturaDAO();
        factura mi_factura = new factura();

        Scanner teclado = new Scanner(System.in);
        
        String fecha_factura = "";
        int usuarios_id_usuarios;

        System.out.println("Ingrese la fecha de la factura");
        fecha_factura = teclado.nextLine();

        System.out.println("Ingrese el ID del usuario");
        usuarios_id_usuarios = teclado.nextInt();
        
        mi_factura.setFecha_factura(fecha_factura);
        mi_factura.setUsuarios_id_usuarios(usuarios_id_usuarios);
        String miRespuesta = mi_factura_dao.AdicionarFactura(mi_factura);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");
        } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
