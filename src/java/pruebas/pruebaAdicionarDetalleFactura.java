/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.detalleFacturaDAO;
import java.util.Scanner;
import modelo.detalle_factura;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarDetalleFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        detalleFacturaDAO mi_detalle_factura_dao = new detalleFacturaDAO();
        detalle_factura mi_detalle_factura = new detalle_factura();

        Scanner teclado = new Scanner(System.in);

        int cantidad;
        double precio_articulo;
        double iva_articulo;
        double total_articulo;
        double total_iva;
        double descuento;
        int factura_id_factura;
        int articulo_id_articulo;

        System.out.println("Digite la cantidad del artículo");
        cantidad = teclado.nextInt();

        System.out.println("Digite el ID de la factura");
        factura_id_factura = teclado.nextInt();

        System.out.println("Digite el ID del artículo");
        articulo_id_articulo = teclado.nextInt();

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

        
        mi_detalle_factura.setCantidad(cantidad);
        mi_detalle_factura.setPrecio_articulo(precio_articulo);
        mi_detalle_factura.setIva_articulo(iva_articulo);
        mi_detalle_factura.setTotal_articulo(total_articulo);
        mi_detalle_factura.setTotal_iva(total_iva);
        mi_detalle_factura.setDescuento(descuento);
        mi_detalle_factura.setFactura_id_factura(factura_id_factura);
        mi_detalle_factura.setArticulo_id_articulo(articulo_id_articulo);
        String miRespuesta = mi_detalle_factura_dao.AdicionarDetalleFactura(mi_detalle_factura);
        

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");
        } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }
    }

}
