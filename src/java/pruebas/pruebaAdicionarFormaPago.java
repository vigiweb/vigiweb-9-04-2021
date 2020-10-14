/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.formaPagoDAO;
import java.util.Scanner;
import modelo.forma_pago;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarFormaPago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       formaPagoDAO mi_forma_pago_dao = new formaPagoDAO();
       forma_pago mi_forma_pago = new forma_pago();
       
       Scanner teclado = new Scanner(System.in);
       
       String tipo_pago = "";
       int referencia_Pago;
       
        System.out.println("Ingrese la forma de pago");
        tipo_pago = teclado.nextLine();
        
        System.out.println("Ingrese la referenicia de pago");
        referencia_Pago = teclado.nextInt();
        
        
        
        mi_forma_pago.setTipo_pago(tipo_pago);
        mi_forma_pago.setReferencia_Pago(referencia_Pago);
        String miRespuesta = mi_forma_pago_dao.adicionarFormapago(mi_forma_pago);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Registro exitoso");
        }else {
            System.out.println("Ocurrio un error " + miRespuesta);
        
        } 
    }
    
}
