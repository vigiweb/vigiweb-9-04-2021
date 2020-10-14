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
public class detalle_movimiento {
    private int id_detalle_movimiento;
    private int cantidad;
    private double precio_articulo;
    private double iva;
    private double total_articulo;
    private int articulo_id_articulo;
    private int movimientos_id_movimientos;

    public int getId_detalle_movimiento() {
        return id_detalle_movimiento;
    }

    public void setId_detalle_movimiento(int id_detalle_movimiento) {
        this.id_detalle_movimiento = id_detalle_movimiento;
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

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal_articulo() {
        return total_articulo;
    }

    public void setTotal_articulo(double total_articulo) {
        this.total_articulo = total_articulo;
    }

    public int getArticulo_id_articulo() {
        return articulo_id_articulo;
    }

    public void setArticulo_id_articulo(int articulo_id_articulo) {
        this.articulo_id_articulo = articulo_id_articulo;
    }

    public int getMovimientos_id_movimientos() {
        return movimientos_id_movimientos;
    }

    public void setMovimientos_id_movimientos(int movimientos_id_movimientos) {
        this.movimientos_id_movimientos = movimientos_id_movimientos;
    }

    
}
