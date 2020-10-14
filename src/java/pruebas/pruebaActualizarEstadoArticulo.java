/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.actualizar;
import controlador.estadoArticuloDAO;
import java.util.Scanner;
import modelo.estado_articulo;
/**
 *
 * @author Famil
 */
public class pruebaActualizarEstadoArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoArticuloDAO mi_estado_articulo_dao = new estadoArticuloDAO();
        estado_articulo mi_estado_articulo = new estado_articulo();

        Scanner teclado = new Scanner(System.in);

        int id_estado_articulo;
        String descrip_estado = "";

        System.out.println("Ingrese el estado del artículo");
        descrip_estado = teclado.nextLine();
        
        System.out.println("Ingrese el ID del estado del artículo");
        id_estado_articulo = teclado.nextInt();
        
        mi_estado_articulo.setId_estado_articulo(id_estado_articulo);
        mi_estado_articulo.setDescrip_estado(descrip_estado);
        
        mi_estado_articulo.setId_estado_articulo(id_estado_articulo);

        String respuesta = mi_estado_articulo_dao.ActualizarEstadoArticulo(mi_estado_articulo);

        if (respuesta.length() == 0) {

            System.out.println("Actualización exitosa");

        } else {

            System.out.println("Ocurrio un error" + respuesta);
        }
    }
    
}
