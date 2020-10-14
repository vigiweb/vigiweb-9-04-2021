/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import modelo.ciudad;
import controlador.ciudadDAO;
import java.util.ArrayList;
/**
 *
 * @author Famil
 */
public class pruebaEliminarCiudad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ciudadDAO ciudad_dao = new ciudadDAO();
        
        ArrayList<ciudad> mi_listado_ciudad = ciudad_dao.ConsultarListadoCiudad("2", "Bogota");
        for (ciudad C : mi_listado_ciudad) {
            System.out.println(" ID. " + C.getId_ciudad() + " Descripción : " + C.getDescrip_ciudad());
        }
        System.out.println("Se elimino");
        ciudad_dao.EliminarCiudad(mi_listado_ciudad.get(0));
        mi_listado_ciudad = ciudad_dao.ConsultarListadoCiudad("2", "Bogota");
        for (ciudad C : mi_listado_ciudad) {
            System.out.println(" ID. " + C.getId_ciudad() + " Descripción : " + C.getDescrip_ciudad());
        }
    }
    
}


