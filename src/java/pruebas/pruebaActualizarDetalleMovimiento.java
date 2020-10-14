/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.detalleMovimientoDAO;
import modelo.detalle_movimiento;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class pruebaActualizarDetalleMovimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       detalleMovimientoDAO mi_detalle_movimiento_dao = new detalleMovimientoDAO();
       detalle_movimiento mi_detalle_movimiento = new detalle_movimiento();

        Scanner teclado = new Scanner(System.in);
        
        int id_detalle_movimiento;
        int cantidad;
        double precio_articulo;
        double iva;
        double total_articulo;

        System.out.println("Digite la cantidad");
        cantidad = teclado.nextInt();
        
        System.out.println("Digite el precio del artículo");
        precio_articulo = teclado.nextDouble();

        System.out.println("Digite el IVA");
        iva = teclado.nextDouble();

        System.out.println("Digite el total del artículo");
        total_articulo = teclado.nextDouble();
                
        System.out.println("Digite el id detalle movimiento");
        id_detalle_movimiento = teclado.nextInt();

        mi_detalle_movimiento.setId_detalle_movimiento(id_detalle_movimiento);
        
        mi_detalle_movimiento.setCantidad(cantidad);
        mi_detalle_movimiento.setPrecio_articulo(precio_articulo);
        mi_detalle_movimiento.setIva(iva);
        mi_detalle_movimiento.setTotal_articulo(total_articulo);
        
        mi_detalle_movimiento.setId_detalle_movimiento(id_detalle_movimiento);
        
        mi_detalle_movimiento.setMovimientos_id_movimientos(1);
        mi_detalle_movimiento.setArticulo_id_articulo(1);
        
        String miRespuesta = mi_detalle_movimiento_dao.actualizardetallemovimiento(mi_detalle_movimiento);
        
        if (miRespuesta.length() == 0) {

            System.out.println("Actualización exitosa");
        } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }
        
         
      }
    
}
