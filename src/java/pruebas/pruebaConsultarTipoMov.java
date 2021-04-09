/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoMovDAO;
import modelo.tipo_mov;

/**
 *
 * @author diego
 */
public class pruebaConsultarTipoMov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      tipoMovDAO mi_tipo_mov_dao = new tipoMovDAO();
      tipo_mov mi_tipo_mov = mi_tipo_mov_dao.Consultartipomov("");

        if (mi_tipo_mov != null) {
            System.out.println("El tipo de movimiento fue encontrado " + mi_tipo_mov.getId_tipo_mov() + " " + mi_tipo_mov.getM_descrip()+ " ");
        } else {
            System.out.println("El tipo de movimiento no fue encontrado");
        }

    
    }
    
}
    
    

