/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import modelo.estado_usuario;
import controlador.estadoUsuarioDAO;
import java.util.ArrayList;

/**
 *
 * @author Famil
 */
public class pruebaEliminarEstadoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoUsuarioDAO estado_usuario_dao = new estadoUsuarioDAO();
        
        ArrayList<estado_usuario> mi_listado_estado_usuario = estado_usuario_dao.ConsultarListadoEstadoUsuario(1, "Activo");
        for (estado_usuario E : mi_listado_estado_usuario) {
            System.out.println(" ID. " + E.getId_estado_usuario() + " Descripción : " + E.getDescrip_estado());
        }
        System.out.println("Se elimino");
        estado_usuario_dao.EliminarEstadoUsuario(mi_listado_estado_usuario.get(0));
        mi_listado_estado_usuario = estado_usuario_dao.ConsultarListadoEstadoUsuario(1, "Activo");
        for (estado_usuario E : mi_listado_estado_usuario) {
            System.out.println(" ID. " + E.getId_estado_usuario() + " Descripción : " + E.getDescrip_estado());
        }
    }
    
}
