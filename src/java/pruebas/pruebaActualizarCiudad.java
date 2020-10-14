/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.ciudadDAO;
import java.util.Scanner;
import modelo.ciudad;

/**
 *
 * @author Famil
 */
public class pruebaActualizarCiudad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ciudadDAO mi_ciudad_dao = new ciudadDAO();
        ciudad mi_ciudad = new ciudad();

        Scanner teclado = new Scanner(System.in);
        
        String id_ciudad = "";
        String ciudad = "";

        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = teclado.nextLine();
        
        System.out.println("Ingrese el ID de la ciudad");
        id_ciudad= teclado.nextLine();
        
        mi_ciudad.setId_ciudad(id_ciudad);
        mi_ciudad.setDescrip_ciudad(ciudad);
        
        mi_ciudad.setId_ciudad(id_ciudad);

        String respuesta = mi_ciudad_dao.ActualizarCiudad(mi_ciudad);

        if (respuesta.length() == 0) {

            System.out.println("Actualización exitosa");

        } else {

            System.out.println("Ocurrio un error" + respuesta);

        }
    }
}
