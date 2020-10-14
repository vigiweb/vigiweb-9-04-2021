/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.detalleFacturaDAO;
import modelo.detalle_factura;

public class pruebaConsultarDetalleFactura {

    public static void main(String[] args) {

        detalleFacturaDAO mi_detalle_factura_dao = new detalleFacturaDAO();
        detalle_factura mi_detalle_factura = mi_detalle_factura_dao.ConsultarDetalleFactura(1);

        if (mi_detalle_factura != null) {
            System.out.println("Detalle factura encontrado " + mi_detalle_factura.getId_detalle_factura() + " " + mi_detalle_factura.getTotal_articulo() + " ");
        } else {
            System.out.println("El detalle factura no fue encontrado");
        }
    }

}
