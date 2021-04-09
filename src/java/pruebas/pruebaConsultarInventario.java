/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.inventarioDAO;
import modelo.inventario;

/**
 *
 * @author Famil
 */
public class pruebaConsultarInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       inventarioDAO mi_inventario_dao = new inventarioDAO();
       inventario mi_inventario = mi_inventario_dao.ConsultarInventario("1");

        if (mi_inventario != null) {
            System.out.println("Inventario encontrado " + mi_inventario.getId_inventario() + " " + mi_inventario.getIn_saldo() + " ");
        } else {
            System.out.println("El inventario no fue encontrado");
        } 

    }
    
}
