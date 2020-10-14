/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoGeneroDAO;
import java.util.Scanner;
import modelo.tipo_genero;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarTipoGenero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tipoGeneroDAO mi_tipo_genero_dao = new tipoGeneroDAO();
        tipo_genero mi_tipo_genero = new tipo_genero();
        
        Scanner teclado = new Scanner (System.in);
        
        String tipo_genero = "";
        
        System.out.println("Por favor ingrese el tipo de genero");
        tipo_genero = teclado.next();
        
        mi_tipo_genero.setDescrip_genero(tipo_genero);
        String miRespuesta = mi_tipo_genero_dao.AdicionarGenero(mi_tipo_genero);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Registro exitoso");
            
        } else {
            
            System.out.println("Ocurrio un error" + miRespuesta);
            
        }
    }    
}
