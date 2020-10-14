/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.usuariosDAO;
import java.util.ArrayList;
import modelo.usuarios;

/**
 *
 * @author Famil
 */
public class pruebaConsultarListaUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        usuariosDAO usuario_dao = new usuariosDAO();
        ArrayList<usuarios> mi_usuario = new ArrayList<usuarios>();
        mi_usuario = usuario_dao.ConsultarListadoUusarios("", "", "");

        int size = mi_usuario.size();
        System.out.println("<table border=\"1\"><tr><td>id_usuarios</td><td>numero_documento</td><td>nombre_usuario</td><td>contraseña</td><td>telefono</td><td>direccion</td> "
                + " <td>correo</td><td>barrio</td><td>tipo_usuario_id_tipo_usuario</td><td>ciudad_id_ciudad</td><td>tipo_genero_id_tipo_genero</td><td>estado_usuario_id_estado_usuario</td> "
                + " <td>tipo_documento_id_tipo_documento</td> ");

        for (usuarios U : mi_usuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_usuarios() + "</td>");
            System.out.println("<td>" + U.getNumero_documento() + "</td>");
            System.out.println("<td>" + U.getNombre_usuario() + "</td>");
            System.out.println("<td>" + U.getContraseña() + "</td>");
            System.out.println("<td>" + U.getTelefono() + "</td>");
            System.out.println("<td>" + U.getDireccion() + "</td>");
            System.out.println("<td>" + U.getCorreo() + "</td>");
            System.out.println("<td>" + U.getBarrio() + "</td>");
            System.out.println("<td>" + U.getEstado_usuario_id_estado_usuario() + "</td>");
            System.out.println("<td>" + U.getTipo_usuario_id_tipo_usuario() + "</td>");
            System.out.println("<td>" + U.getTipo_documento_id_tipo_documento() + "</td>");
            System.out.println("<td>" + U.getTipo_genero_id_tipo_genero() + "</td>");
            System.out.println("<td>" + U.getCiudad_id_ciudad() + "</td>");

            System.out.println("</tr>");

        }

    }

}
