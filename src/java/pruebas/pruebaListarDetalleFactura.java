/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.listar;

import controlador.detalleFacturaDAO;
import java.util.ArrayList;
import modelo.detalle_factura;

/**
 *
 * @author Famil
 */
public class pruebaListarDetalleFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        detalleFacturaDAO detalle_factura_dao = new detalleFacturaDAO();
        ArrayList<detalle_factura> mi_detalle_factura = new ArrayList<detalle_factura>();

        mi_detalle_factura = detalle_factura_dao.ConsultarListadoDetalleFactura(0, 0);

        int size = mi_detalle_factura.size();
        System.out.println("<table border=\"1\")><br><td>id_detalle_factura</td><td>cantidad</td><td>precio_articulo</td><td>iva_articulo</td><td>total_articulo</td><td>total_iva</td><td>descuento</td><td>factura_id_factura</td><td>articulo_id_articulo</td>");

        for (detalle_factura U : mi_detalle_factura) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_detalle_factura() + "</td>");
            System.out.println("<td>" + U.getCantidad() + "</td>");
            System.out.println("<td>" + U.getPrecio_articulo() + "</td>");
            System.out.println("<td>" + U.getIva_articulo() + "</td>");
            System.out.println("<td>" + U.getTotal_articulo() + "</td>");
            System.out.println("<td>" + U.getTotal_iva() + "</td>");
            System.out.println("<td>" + U.getDescuento() + "</td>");
            System.out.println("<td>" + U.getFactura_id_factura() + "</td>");
            System.out.println("<td>" + U.getArticulo_id_articulo() + "</td>");

            System.out.println("<tr>");
        }
        System.out.println("</table>");
    }
}
