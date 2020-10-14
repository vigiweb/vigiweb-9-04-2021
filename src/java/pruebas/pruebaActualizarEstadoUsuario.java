/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.estadoUsuarioDAO;
import java.util.Scanner;
import modelo.estado_usuario;

/**
 *
 * @author Famil
 */
public class pruebaActualizarEstadoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        estadoUsuarioDAO mi_estado_usuario_dao = new estadoUsuarioDAO();
        estado_usuario mi_estado_usuario = new estado_usuario();

        Scanner teclado = new Scanner(System.in);

        int id_estado_usuario;
        String estado_usuario = "";

        System.out.println("Ingrese el estado del usuario");
        estado_usuario = teclado.nextLine();
        
        System.out.println("Ingrese el ID del estado del usuario");
        id_estado_usuario = teclado.nextInt();
        
        mi_estado_usuario.setId_estado_usuario(id_estado_usuario);
        mi_estado_usuario.setDescrip_estado(estado_usuario);
        
        mi_estado_usuario.setId_estado_usuario(id_estado_usuario);

        String respuesta = mi_estado_usuario_dao.ActualizarEstadoUsuario(mi_estado_usuario);

        if (respuesta.length() == 0) {

            System.out.println("Actualización exitosa");

        } else {

            System.out.println("Ocurrio un error" + respuesta);
        }
    }

}
