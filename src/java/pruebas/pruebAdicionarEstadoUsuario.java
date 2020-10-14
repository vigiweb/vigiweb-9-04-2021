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
public class pruebAdicionarEstadoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoUsuarioDAO mi_estado_usuario_dao = new estadoUsuarioDAO();
        estado_usuario mi_estado_usuario = new estado_usuario();
        
        Scanner teclado = new Scanner (System.in);
        
        String estado_usuario = "";
        
        System.out.println("Ingrese el estado del usuario");
        estado_usuario = teclado.next();
        
        mi_estado_usuario.setDescrip_estado(estado_usuario);
        String miRespuesta = mi_estado_usuario_dao.AdicionarEstadoUsuario(mi_estado_usuario);
        
        if (miRespuesta.length() == 0){
            
            System.out.println("Adición exitosa");
        
        }else {
            
            System.out.println("Ocurrio un error" + miRespuesta);
        }
    }
}
