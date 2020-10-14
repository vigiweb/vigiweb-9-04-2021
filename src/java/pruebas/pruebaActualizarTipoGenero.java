/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.tipoGeneroDAO;
import modelo.tipo_genero;
import java.util.Scanner;

public class pruebaActualizarTipoGenero {

    public static void main(String[] args){
        
        tipoGeneroDAO mi_tipo_genero_dao = new tipoGeneroDAO();
        tipo_genero mi_tipo_genero = new tipo_genero();
        
        Scanner teclado = new Scanner(System.in);
        
        int id_tipo_genero;
        String descrip_genero;
        
        System.out.println("Digite el nombre del genero");
        descrip_genero = teclado.nextLine();
        
        System.out.println("Digite el ID del genero");
        id_tipo_genero = teclado.nextInt();
        
        mi_tipo_genero.setId_tipo_genero(id_tipo_genero);
        mi_tipo_genero.setDescrip_genero(descrip_genero);
        
        mi_tipo_genero.setId_tipo_genero(id_tipo_genero);
        
        String miRespuesta = mi_tipo_genero_dao.actualizarTipoGenero(mi_tipo_genero);
        
            if (miRespuesta.length() == 0) {

            System.out.println("Actualización exitosa");
            } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }
        
         
      }
    
}
        
      