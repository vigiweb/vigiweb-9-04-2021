/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.articuloDAO;
import modelo.articulo;

/**
 *
 * @author Famil
 */
public class pruebaConsultarArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        articuloDAO miarticuloDAO = new articuloDAO();
        articulo miarticulo = miarticuloDAO.ConsultarArticulo(1);

        if (miarticulo != null) {
            System.out.println("Artículo encontrado " + miarticulo.getId_articulo() + " " + miarticulo.getNombre_articulo() + " " + miarticulo.getDescripcion_articulo());
        } else {
            System.out.println("El artículo no fue encontrado");
        }
    }
    
}
