/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.detalleMovimientoDAO;
import java.util.Scanner;
import modelo.detalle_movimiento;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarDetalleMovimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        detalleMovimientoDAO mi_detalle_movimiento_dao = new detalleMovimientoDAO();
        detalle_movimiento mi_detalle_movimiento = new detalle_movimiento();

        Scanner teclado = new Scanner(System.in);
        
       int cantidad;
       double precio_articulo;
       double iva;
       double total_articulo;
       int articulo_id_articulo;
       int movimientos_id_movimientos;

        System.out.println("Digite la cantidad del movimiento");
        cantidad = teclado.nextInt();

        System.out.println("Digite el ID del artículo");
        articulo_id_articulo = teclado.nextInt();
        
        System.out.println("Digite el ID del movimiento");
        movimientos_id_movimientos = teclado.nextInt();
        
        System.out.println("Digite el precio del artículo");
        precio_articulo = teclado.nextDouble();

        System.out.println("Digite el IVA del movimiento");
        iva = teclado.nextDouble();

        System.out.println("Digite el total del artículo");
        total_articulo = teclado.nextDouble();
        
        mi_detalle_movimiento.setCantidad(cantidad);
        mi_detalle_movimiento.setPrecio_articulo(precio_articulo);
        mi_detalle_movimiento.setIva(iva);
        mi_detalle_movimiento.setTotal_articulo(total_articulo);
        mi_detalle_movimiento.setArticulo_id_articulo(articulo_id_articulo);
        mi_detalle_movimiento.setMovimientos_id_movimientos(movimientos_id_movimientos);

        String miRespuesta = mi_detalle_movimiento_dao.AdicionarDetalleMovimiento(mi_detalle_movimiento);
        
        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");
        } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }
    }

}
