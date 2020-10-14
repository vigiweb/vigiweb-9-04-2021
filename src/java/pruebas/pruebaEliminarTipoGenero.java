/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.tipoGeneroDAO;
import modelo.tipo_genero;
import java.util.ArrayList;

public class pruebaEliminarTipoGenero {

   
    public static void main(String[] args) {
      tipoGeneroDAO mi_tipo_genero_dao = new tipoGeneroDAO();
        
        ArrayList<tipo_genero> mi_listado_tipo_genero = mi_tipo_genero_dao.ConsultarListadoTipoGenero(0, "");
        for (tipo_genero D : mi_listado_tipo_genero) {
            System.out.println(" ID. " + D.getId_tipo_genero()+ " Precio : " + D.getDescrip_genero());
        }
        System.out.println("Se elimino");
        mi_tipo_genero_dao.EliminarTipoUsuario(mi_listado_tipo_genero.get(0));
        mi_listado_tipo_genero = mi_tipo_genero_dao.ConsultarListadoTipoGenero(0, "");
        for (tipo_genero D : mi_listado_tipo_genero) {
            System.out.println(" ID. " + D.getId_tipo_genero()+ " Precio : " + D.getDescrip_genero());
        }
    }
    
}
  