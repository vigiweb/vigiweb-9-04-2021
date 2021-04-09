/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.usuariosDAO;
import java.util.Scanner;
import modelo.usuarios;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       usuariosDAO mi_usuario_dao = new usuariosDAO();
       usuarios mi_usuario = new usuarios();
       
       Scanner teclado = new Scanner(System.in);
       
       String numero_documento = "";
       String nombre_usuario = "";
       String contraseña = "";
       int telefono;
       String direccion = "";
       String correo = "";
       String barrio = "";
       int tipo_usuario_id_tipo_usuario;
       int ciudad_id_ciudad;
       int tipo_genero_id_tipo_genero;
       int estado_usuario_id_estado_usuario;
       int tipo_documento_id_tipo_documento;
       
        System.out.println("Ingrese el numero de documento");
        numero_documento = teclado.nextLine();
        
        System.out.println("Ingrese el nombre del usuario");
        nombre_usuario = teclado.nextLine();
        
        System.out.println("Ingrese la contraseña del usuario");
        contraseña = teclado.nextLine();
        
        System.out.println("Ingrese la dirección del usuario");
        direccion = teclado.nextLine();
        
        System.out.println("Ingrese el correo del usuario");
        correo = teclado.nextLine();
        
        System.out.println("Ingrese el barrio del usuario");
        barrio = teclado.nextLine();
        
        System.out.println("Ingrese el teléfono del usuario");
        telefono = teclado.nextInt();
        
        System.out.println("Ingrese el ID tipo usuario");
        tipo_usuario_id_tipo_usuario = teclado.nextInt();
        
        System.out.println("Ingrese ID ciudad");
        ciudad_id_ciudad = teclado.nextInt();
        
        System.out.println("Ingrese el ID tipo genero");
        tipo_genero_id_tipo_genero = teclado.nextInt();
        
        System.out.println("Ingrese el ID estado usuario");
        estado_usuario_id_estado_usuario = teclado.nextInt();
        
        System.out.println("Ingrese el ID tipo documento");
        tipo_documento_id_tipo_documento = teclado.nextInt();
        
        mi_usuario.setNumero_documento(numero_documento);
        mi_usuario.setNombre_usuario(nombre_usuario);
        mi_usuario.setContrasena(contraseña);
        mi_usuario.setTelefono(telefono);
        mi_usuario.setDireccion(direccion);
        mi_usuario.setCorreo(correo);
        mi_usuario.setBarrio(barrio);
        mi_usuario.setTipo_usuario_id_tipo_usuario(tipo_usuario_id_tipo_usuario);
        mi_usuario.setCiudad_id_ciudad(ciudad_id_ciudad);
        mi_usuario.setTipo_genero_id_tipo_genero(tipo_genero_id_tipo_genero);
        mi_usuario.setEstado_usuario_id_estado_usuario(estado_usuario_id_estado_usuario);
        mi_usuario.setTipo_documento_id_tipo_documento(tipo_documento_id_tipo_documento);
        
                                                        
        
        String miRespuesta = mi_usuario_dao.AdicionarUsuario(mi_usuario);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Adición exitosa");
        }else {
            System.out.println("Ocurrio un error " + miRespuesta);
        
        } 
    }
    
}
