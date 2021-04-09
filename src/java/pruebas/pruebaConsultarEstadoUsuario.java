/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.estadoUsuarioDAO;
import modelo.estado_usuario;
/**
 *
 * @author Famil
 */
public class pruebaConsultarEstadoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoUsuarioDAO mi_estado_usuario_dao = new estadoUsuarioDAO();
        estado_usuario mi_estado_usuario = mi_estado_usuario_dao.ConsultarEstadoUsuario("");

        if (mi_estado_usuario != null) {
            System.out.println("El estado del usuario fue encontrado " + mi_estado_usuario.getId_estado_usuario() + " " + mi_estado_usuario.getDescrip_estado() + " ");
        } else {
            System.out.println("El estado del usuario no fue encontrado");
        }
    }
    
}
