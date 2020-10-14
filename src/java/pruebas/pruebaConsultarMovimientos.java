/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.movimientosDAO;
import modelo.movimientos;

/**
 *
 * @author diego
 */
public class pruebaConsultarMovimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         movimientosDAO mi_movimientos_dao = new movimientosDAO();
        movimientos mi_movimientos = mi_movimientos_dao.ConsultarMovimientos(2);

        if (mi_movimientos != null) {
            System.out.println("El movimiento fue encontrado " + mi_movimientos.getId_movimientos() + " " + mi_movimientos.getNumero_documento()+ " ");
        } else {
            System.out.println("El movimiento no fue encontrado");
        }
    }
    
}
