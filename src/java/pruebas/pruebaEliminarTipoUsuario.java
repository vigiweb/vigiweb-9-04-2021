/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.tipoUsuarioDAO;
import modelo.tipo_usuario;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class pruebaEliminarTipoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      tipoUsuarioDAO mi_tipo_usuario_dao = new tipoUsuarioDAO();
        
        ArrayList<tipo_usuario> mi_listado_tipo_usuario = mi_tipo_usuario_dao.ConsultarListadoTipoUsuario(0, "");
        for (tipo_usuario D : mi_listado_tipo_usuario) {
            System.out.println(" ID. " + D.getId_tipo_usuario()+ " Precio : " + D.getDescp_usuario());
        }
        System.out.println("Se elimino");
        mi_tipo_usuario_dao.EliminarTipoUsuario(mi_listado_tipo_usuario.get(0));
        mi_listado_tipo_usuario = mi_tipo_usuario_dao.ConsultarListadoTipoUsuario(0, "");
        for (tipo_usuario D : mi_listado_tipo_usuario) {
            System.out.println(" ID. " + D.getId_tipo_usuario()+ " Precio : " + D.getDescp_usuario());
        }
    }
    
}
    