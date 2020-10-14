/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.listar;

import controlador.tipoUsuarioDAO;
import java.util.ArrayList;
import modelo.tipo_usuario;

/**
 *
 * @author Famil
 */
public class pruebaListarTipoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        tipoUsuarioDAO tipo_usuario_dao = new tipoUsuarioDAO();
        ArrayList<tipo_usuario> mi_tipo_usuario = new ArrayList<tipo_usuario>();
        mi_tipo_usuario = tipo_usuario_dao.ConsultarListadoTipoUsuario(0, "");

        int size = mi_tipo_usuario.size();
        System.out.println("<table border=\"1\"><tr><td>id_tipo_usuario</td><td>descp_usuario</td> ");

        for (tipo_usuario C : mi_tipo_usuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + C.getId_tipo_usuario() + "</td>");
            System.out.println("<td>" + C.getDescp_usuario() + "</td>");

            System.out.println("</tr>");

        }
    }
    
}
