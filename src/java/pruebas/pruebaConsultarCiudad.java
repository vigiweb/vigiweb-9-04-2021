/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.ciudadDAO;
import modelo.ciudad;

/**
 *
 * @author Famil
 */
public class pruebaConsultarCiudad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ciudadDAO mi_ciudad_dao = new ciudadDAO();
        ciudad mi_ciudad = mi_ciudad_dao.ConsultarUsuario("");

        if (mi_ciudad != null) {
            System.out.println("Ciudad encontrada " + mi_ciudad.getId_ciudad() + " " + mi_ciudad.getDescrip_ciudad() + " ");
        } else {
            System.out.println("La ciudad no fue encontrada");
        }
    }
    
}
