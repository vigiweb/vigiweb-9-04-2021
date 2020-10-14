/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoMovDAO;
import java.util.Scanner;
import modelo.tipo_mov;

/**
 *
 * @author diego
 */
public class pruebaActualizarTipoMov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tipoMovDAO mi_tipo_mov_dao = new tipoMovDAO();
        tipo_mov mi_tipo_mov = new tipo_mov();
       
       Scanner teclado = new Scanner(System.in);
       
       int  id_tipo_mov;
       String tipo_mov = "";
        
        
        System.out.println("Ingrese el movimiento");
        tipo_mov = teclado.nextLine();

        System.out.println("Ingrese el ID del movimiento");
        id_tipo_mov = teclado.nextInt();
        
        mi_tipo_mov.setId_tipo_mov(id_tipo_mov);
        mi_tipo_mov.setM_descrip(tipo_mov);
        
        mi_tipo_mov.setId_tipo_mov(id_tipo_mov);

        String respuesta = mi_tipo_mov_dao.ActualizarMovimiento(mi_tipo_mov);
        
        if (respuesta.length() == 0) {
            
            System.out.println("Resgistro actualizado correctamente");
        }else {
            System.out.println("Ocurrio un error " + respuesta);
        
        }
    }
    
}
    
    

