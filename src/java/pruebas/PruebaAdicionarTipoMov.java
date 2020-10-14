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
 * @author Famil
 */
public class PruebaAdicionarTipoMov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tipoMovDAO mi_tipo_mov_dao = new tipoMovDAO();
        tipo_mov mi_tipo_mov = new tipo_mov();
        
        Scanner teclado = new Scanner(System.in);
        
        String tipo_mov = "";
        
        System.out.println("Por favor ingrese el tipo de movimiento que se realizó");
        tipo_mov = teclado.next();
        
        mi_tipo_mov.setM_descrip(tipo_mov);
        String miRespuesta = mi_tipo_mov_dao.AdicionarMovimiento(mi_tipo_mov);
        
        if (miRespuesta.length() == 0){
            
            System.out.println("Registro exitoso");
            
        } else {
            
            System.out.println("Ocurrio un error" + miRespuesta);
        }
    }
}
