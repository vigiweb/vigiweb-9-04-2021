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
public class pruebaEliminarUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        usuariosDAO usuario_dao = new usuariosDAO();
        
        ArrayList<usuarios> mi_listado_usuarios = usuario_dao.ConsultarListadoUusarios("587545487", "Carlos", "carlos@gmail.com");
        for (usuarios C : mi_listado_usuarios) {
            System.out.println(" Nombre : " + C.getId_usuarios() + " Id. " + C.getNombre_usuario());    
        }
        System.out.println("Se elimino");
        usuario_dao.EliminarUsuarios(mi_listado_usuarios.get(0));
        mi_listado_usuarios = usuario_dao.ConsultarListadoUusarios("587545487", "Carlos", "carlos@gmail.com");
        for (usuarios C : mi_listado_usuarios) {
            System.out.println(" Nombre : " + C.getId_usuarios() + " Id. " + C.getNombre_usuario());    
        }
    }
    
}
