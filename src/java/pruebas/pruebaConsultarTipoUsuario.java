/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.consultar;

import controlador.tipoUsuarioDAO;
import modelo.tipo_usuario;

/**
 *
 * @author Famil
 */
public class pruebaConsultarTipoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        tipoUsuarioDAO mi_tipo_usuario_dao = new tipoUsuarioDAO();
        tipo_usuario mi_tipo_usuario = mi_tipo_usuario_dao.ConsultarTipoUsuario("");

        if (mi_tipo_usuario != null) {
            System.out.println("Tipo Usuario encontrado " + mi_tipo_usuario.getId_tipo_usuario() + " " + mi_tipo_usuario.getDescp_usuario());
        } else {
            System.out.println("El tipo Usuario no fue encontrado");
        }
    }
}
