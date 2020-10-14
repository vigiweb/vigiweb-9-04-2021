/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.listar;

import controlador.detalleMovimientoDAO;
import java.util.ArrayList;
import modelo.detalle_movimiento;

/**
 *
 * @author Famil
 */
public class pruebaListarDetalleMovimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        detalleMovimientoDAO detalle_movimiento_dao = new detalleMovimientoDAO();
        ArrayList<detalle_movimiento> mi_detalle_movimiento = new ArrayList<detalle_movimiento>();
        mi_detalle_movimiento = detalle_movimiento_dao.ConsultarListadoDetalleMovimiento(0, 0, 0);

        int size = mi_detalle_movimiento.size();
        System.out.println("<table border=\"1\"><tr><td>id_detalle_movimiento</td><td>cantidad</td><td>precio_articulo</td><td>iva</td><td>total_articulo</td><td>articulo_id_articulo</td> ");

        for (detalle_movimiento D : mi_detalle_movimiento) {

            System.out.println("<tr>");
            System.out.println("<td>" + D.getId_detalle_movimiento() + "</td>");
            System.out.println("<td>" + D.getCantidad() + "</td>");
            System.out.println("<td>" + D.getPrecio_articulo() + "</td>");
            System.out.println("<td>" + D.getIva() + "</td>");
            System.out.println("<td>" + D.getTotal_articulo() + "</td>");
            System.out.println("<td>" + D.getArticulo_id_articulo() + "</td>");
            System.out.println("<td>" + D.getMovimientos_id_movimientos() + "</td>");

            System.out.println("</tr>");

        }
        System.out.println("</table>");
    }
}
