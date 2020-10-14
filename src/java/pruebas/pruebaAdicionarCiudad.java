/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.ciudadDAO;
import modelo.ciudad;
import java.util.Scanner; 

/**
 *
 * @author Famil
 */
public class pruebaAdicionarCiudad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       ciudadDAO mi_ciudad_dao = new ciudadDAO();
       ciudad mi_ciudad= new ciudad();  
       
       Scanner teclado = new Scanner(System.in);
       
       String ciudad = "";
        
       System.out.println("Ingrese la ciudad");
       ciudad = teclado.next();
        
       mi_ciudad.setDescrip_ciudad(ciudad);
       String miRespuesta = mi_ciudad_dao.AdicionarCiudad(mi_ciudad);
    
        if (miRespuesta.length() == 0) {

            System.out.println("Adición exitosa");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }   
    } 
}

       
       
    
 
