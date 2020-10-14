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
public class pruebaActualizarUsuarios {

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
       String correo = "";
       String direccion = "";
       String barrio = "";
        
        System.out.println("Ingrese el numero de documento del usuario");
        numero_documento = teclado.nextLine();
        
        System.out.println("Ingrese el nombre del usuario");
        nombre_usuario = teclado.nextLine();
        
        System.out.println("Ingrese la contraseña del usuario");
        contraseña = teclado.nextLine();
        
        System.out.println("Ingrese la dirección del usuario");
        direccion = teclado.nextLine();
        
        System.out.println("Ingrese el barrio del usuario");
        barrio = teclado.nextLine();
        
        System.out.println("Ingrese el correo del usuario");
        correo = teclado.nextLine();
        
        System.out.println("Ingrese el teléfono del usuario");
        telefono = teclado.nextInt();
       
        mi_usuario.setNumero_documento(numero_documento);
        mi_usuario.setNombre_usuario(nombre_usuario);
        mi_usuario.setContraseña(contraseña);
        mi_usuario.setTelefono(telefono);
        mi_usuario.setCorreo(correo);
        mi_usuario.setDireccion(direccion);
        mi_usuario.setBarrio(barrio);
        
        mi_usuario.setNumero_documento(numero_documento);
        
        mi_usuario.setEstado_usuario_id_estado_usuario(1);
        mi_usuario.setTipo_usuario_id_tipo_usuario(1);
        mi_usuario.setTipo_documento_id_tipo_documento(1);
        mi_usuario.setTipo_genero_id_tipo_genero(1);
        mi_usuario.setCiudad_id_ciudad(1);
        
        String respuesta = mi_usuario_dao.AtualizarUsuario(mi_usuario);
        
        if (respuesta.length() == 0) {
            
            System.out.println("Actualización exitosa");
        }else {
            System.out.println("Ocurrio un error " + respuesta);
        
        } 
    } 
}
