/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.adicionar;

import controlador.estadoArticuloDAO;
import java.util.Scanner;
import modelo.estado_articulo;
/**
 *
 * @author Famil
 */
public class pruebaAdicionarEstadoArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoArticuloDAO mi_estado_articulo_dao = new estadoArticuloDAO();
        estado_articulo mi_estado_articulo = new estado_articulo();
        
        Scanner teclado = new Scanner (System.in);
        
        String estado_articulo = "";
        
        System.out.println("Ingrese el estado del artículo");
        estado_articulo = teclado.next();
        
        mi_estado_articulo.setDescrip_estado(estado_articulo);
        String miRespuesta = mi_estado_articulo_dao.AdicionarEstadoArticulo(mi_estado_articulo);
        
        if (miRespuesta.length() == 0){
            
            System.out.println("Adición exitosa");
        
        }else {
            
            System.out.println("Ocurrio un error" + miRespuesta);
        }
    }
    
}
