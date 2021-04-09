/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.consultar;


import controlador.estadoArticuloDAO;
import modelo.estado_articulo;

/**
 *
 * @author Famil
 */
public class pruebaConsultarEstadoArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        estadoArticuloDAO mi_estado_articulo_dao = new estadoArticuloDAO();
        estado_articulo mi_estado_articulo = mi_estado_articulo_dao.ConsultarEstadoArticulo("");

        if (mi_estado_articulo != null) {
            System.out.println("El estado del artículo fue encontrado " + mi_estado_articulo.getId_estado_articulo() + " " + mi_estado_articulo.getDescrip_estado());
        } else {
            System.out.println("El estado del artículo no fue encontrado");
        }
    }

}
