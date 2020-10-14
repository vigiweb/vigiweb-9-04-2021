/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.estadoUsuarioDAO;
import java.util.ArrayList;
import modelo.estado_usuario;

/**
 *
 * @author Famil
 */
public class pruebaConsultarListaEstadoUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoUsuarioDAO estado_usuario_dao = new estadoUsuarioDAO();
        ArrayList<estado_usuario> mi_estado_usuario = new ArrayList<estado_usuario>();
        mi_estado_usuario = estado_usuario_dao.ConsultarListadoEstadoUsuario(0, "");
        
        int size = mi_estado_usuario.size();
        System.out.println("<table border=\"1\"><tr><td>id_estado_usuario</td><td>descrip_estado</td> ");
        
        for(estado_usuario E: mi_estado_usuario){
            
            System.out.println("<tr>");
            System.out.println("<td>" + E.getId_estado_usuario() + "</td>");
            System.out.println("<td>" + E.getDescrip_estado() + "</td>");
            
            
            System.out.println("</tr>");
            
        }
    }
    
}
