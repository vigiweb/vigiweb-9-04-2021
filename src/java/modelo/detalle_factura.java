/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Famil
 */
public class detalle_factura {
    
    private int id_detalle_factura;
    private int cantidad;
    private double precio_articulo;
    private double iva_articulo;
    private double total_articulo;
    private double total_iva;
    private double descuento;
    private int factura_id_factura;
    private int articulo_id_articulo;

    public int getId_detalle_factura() {
        return id_detalle_factura;
    }

    public void setId_detalle_factura(int id_detalle_factura) {
        this.id_detalle_factura = id_detalle_factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_articulo() {
        return precio_articulo;
    }

    public void setPrecio_articulo(double precio_articulo) {
        this.precio_articulo = precio_articulo;
    }

    public double getIva_articulo() {
        return iva_articulo;
    }

    public void setIva_articulo(double iva_articulo) {
        this.iva_articulo = iva_articulo;
    }

    public double getTotal_articulo() {
        return total_articulo;
    }

    public void setTotal_articulo(double total_articulo) {
        this.total_articulo = total_articulo;
    }

    public double getTotal_iva() {
        return total_iva;
    }

    public void setTotal_iva(double total_iva) {
        this.total_iva = total_iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getFactura_id_factura() {
        return factura_id_factura;
    }

    public void setFactura_id_factura(int factura_id_factura) {
        this.factura_id_factura = factura_id_factura;
    }

    public int getArticulo_id_articulo() {
        return articulo_id_articulo;
    }

    public void setArticulo_id_articulo(int articulo_id_articulo) {
        this.articulo_id_articulo = articulo_id_articulo;
    }

    
}
