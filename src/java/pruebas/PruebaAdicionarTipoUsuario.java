/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoUsuarioDAO;
import java.util.Scanner;
import modelo.tipo_usuario;

/**
 *
 * @author Famil
 */
public class PruebaAdicionarTipoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tipoUsuarioDAO mi_tipo_usuario_dao = new tipoUsuarioDAO();
        tipo_usuario mi_tipo_usuario = new tipo_usuario();
        
        Scanner teclado = new Scanner (System.in);
        
        String tipo_usuario = "";
        
        System.out.println("Por favor ingrese el tipo de usuario");
        tipo_usuario = teclado.next();
        
        mi_tipo_usuario.setDescp_usuario(tipo_usuario);
        String miRespuesta = mi_tipo_usuario_dao.AdicionarTipoUsuario(mi_tipo_usuario);
        
        if (miRespuesta.length() == 0){
            
            System.out.println("Registro exitoso");
        } else {
            
            System.out.println("Ocurrio un error" + miRespuesta);
        }
    } 
}
