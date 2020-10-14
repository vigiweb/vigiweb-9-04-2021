
package Pruebas;


import controlador.tipoUsuarioDAO;
import modelo.tipo_usuario;
import java.util.Scanner;

public class pruebaActualizarTipoUsuario {

    
    public static void main(String[] args) {
        
     tipoUsuarioDAO mi_tipo_usuario_dao = new tipoUsuarioDAO();
     tipo_usuario mi_tipo_usuario = new tipo_usuario();
        
        Scanner teclado = new Scanner(System.in);
        
        int id_tipo_usuario;
        String descp_usuario;
        
        System.out.println("Digite el tipo de usuario");
        descp_usuario = teclado.nextLine();
        
        System.out.println("Digite el ID del usuario");
        id_tipo_usuario= teclado.nextInt();
        
        mi_tipo_usuario.setId_tipo_usuario(id_tipo_usuario);
        mi_tipo_usuario.setDescp_usuario(descp_usuario);
        
        mi_tipo_usuario.setId_tipo_usuario(id_tipo_usuario);
        
        String miRespuesta = mi_tipo_usuario_dao.actualizarTipoUsuario(mi_tipo_usuario);
        
            if (miRespuesta.length() == 0) {

            System.out.println("Actualización exitosa");
            } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }
        
         
      }
    
}

