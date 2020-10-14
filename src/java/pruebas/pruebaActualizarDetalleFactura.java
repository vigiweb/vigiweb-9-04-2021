/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.detalleFacturaDAO;
import modelo.detalle_factura;
import java.util.Scanner;


public class pruebaActualizarDetalleFactura {

    
    public static void main(String[] args) {
        
        detalleFacturaDAO mi_detalle_factura_dao = new detalleFacturaDAO();
        detalle_factura mi_detalle_factura = new detalle_factura();

        Scanner teclado = new Scanner(System.in);

        int id_detalle_factura;
        int cantidad;
        double precio_articulo;
        double iva_articulo;
        double total_articulo;
        double total_iva;
        double descuento;
        
        System.out.println("Digite la cantidad del artículo");
        cantidad = teclado.nextInt();

        System.out.println("Digite el precio del artículo");
        precio_articulo = teclado.nextDouble();

        System.out.println("Digite el Impuesto de Valor Agregado del artículo");
        iva_articulo = teclado.nextDouble();
        
        System.out.println("Digite el total del IVA");
        total_iva = teclado.nextDouble();
        
        System.out.println("Digite el descuento del artículo");
        descuento = teclado.nextDouble();

        System.out.println("Digite el total del artículo");
        total_articulo = teclado.nextDouble();
        
        System.out.println("Digite el id de la factura");
        id_detalle_factura = teclado.nextInt();
        
        mi_detalle_factura.setId_detalle_factura(id_detalle_factura);
        mi_detalle_factura.setCantidad(cantidad);
        mi_detalle_factura.setPrecio_articulo(precio_articulo);
        mi_detalle_factura.setIva_articulo(iva_articulo);
        mi_detalle_factura.setTotal_articulo(total_articulo);
        mi_detalle_factura.setTotal_iva(total_iva);
        mi_detalle_factura.setDescuento(descuento);
        
        mi_detalle_factura.setId_detalle_factura(id_detalle_factura);
        mi_detalle_factura.setFactura_id_factura(1);
        mi_detalle_factura.setArticulo_id_articulo(1);
        
        String miRespuesta = mi_detalle_factura_dao.actualizardetallefactura(mi_detalle_factura);
        
        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");
        } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }
    
    }
    
}
