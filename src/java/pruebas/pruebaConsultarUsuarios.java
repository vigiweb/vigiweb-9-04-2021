/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.usuariosDAO;
import modelo.usuarios;

/**
 *
 * @author Famil
 */
public class pruebaConsultarUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        usuariosDAO mi_usuario_dao = new usuariosDAO();
        usuarios mi_usuario = mi_usuario_dao.ConsultarUsuario("1074958232");

        if (mi_usuario != null) {
            System.out.println("Usuario encontrado " + mi_usuario.getNumero_documento() + " " + mi_usuario.getNombre_usuario() + " ");
        } else {
            System.out.println("El usuario no fue encontrado");
        }

    }

}
