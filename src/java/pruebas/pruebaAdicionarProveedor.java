/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.proveedorDAO;
import java.util.Scanner;
import modelo.proveedor;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarProveedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       proveedorDAO mi_proveedor_dao = new proveedorDAO();
       proveedor mi_proveedor = new proveedor();
       
       Scanner teclado = new Scanner(System.in);
       
       String pr_nombre = "";
       String pr_tipo = "";
       int pr_telefono;
       String pr_direccion = "";
       String pr_correo = "";

       
        System.out.println("Ingrese el nombre del proveedor");
        pr_nombre = teclado.nextLine();
        
        System.out.println("Ingrese el tipo de proveedor");
        pr_tipo = teclado.nextLine();
        
        System.out.println("Ingrese la dirección del proveedor");
        pr_direccion = teclado.nextLine();
        
        System.out.println("Ingrese el correo del proveedor");
        pr_correo = teclado.nextLine();
        
        System.out.println("Ingrese el teléfono del proveedor");
        pr_telefono = teclado.nextInt();
        
       
        mi_proveedor.setPr_nombre(pr_nombre);
        mi_proveedor.setPr_tipo(pr_tipo);
        mi_proveedor.setPr_telefono(pr_telefono);
        mi_proveedor.setPr_direccion(pr_direccion);
        mi_proveedor.setPr_correo(pr_correo);
        String miRespuesta = mi_proveedor_dao.AdicionarProveedor(mi_proveedor);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Registro exitoso");
        }else {
            System.out.println("Ocurrio un error " + miRespuesta);
        } 
    } 
}
    

