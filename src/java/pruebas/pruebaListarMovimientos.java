/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.movimientosDAO;
import java.util.ArrayList;
import modelo.movimientos;

/**
 *
 * @author diego
 */
public class pruebaListarMovimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        movimientosDAO mi_movimientos_dao = new movimientosDAO();
        ArrayList<movimientos> mi_movimientos = new ArrayList<movimientos>();
        mi_movimientos = mi_movimientos_dao.ConsultarListadoMovimientos(0,"");

        int size = mi_movimientos.size();
        System.out.println("<table border=\"1\"><tr><td>id_movimientos</td><td>fecha</td><td>cantidad</td><td>precio_total</td><td>tipo_movimiento</td><td>numero_documento</td><td>articulo_id_articulo</td><td>forma_pago_id_forma_pago</td><td>detalle_movimiento_id_detalle_movimiento</td><td>tipo_documento_id_tipo_documento</td>");

        for (movimientos M : mi_movimientos) {

            System.out.println("<tr>");
            System.out.println("<td>" + M.getId_movimientos() + "</td>");
            System.out.println("<td>" + M.getFecha() + "</td>");
            System.out.println("<td>" + M.getCantidad() + "</td>");
            System.out.println("<td>" + M.getPrecio_total() + "</td>");
            System.out.println("<td>" + M.getNumero_documento() + "</td>");
            System.out.println("<td>" + M.getForma_pago_id_forma_pago() + "</td>");
            System.out.println("<td>" + M.getArticulo_id_articulo() + "</td>");
            System.out.println("<td>" + M.getTipo_mov_id_tipo_mov() + "</td>");
            System.out.println("<td>" + M.getTipo_documento_contable_id_tipo_documento() + "</td>");

            System.out.println("</tr>");

        }

    }
}
