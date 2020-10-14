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
public class movimientos {
    
    private int id_movimientos;
    private String fecha;
    private int  cantidad;
    private double  precio_total;
    private int  numero_documento;
    private int forma_pago_id_forma_pago;
    private int articulo_id_articulo;
    private int tipo_mov_id_tipo_mov;
    private int tipo_documento_contable_id_tipo_documento;

    public int getId_movimientos() {
        return id_movimientos;
    }

    public void setId_movimientos(int id_movimientos) {
        this.id_movimientos = id_movimientos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public int getForma_pago_id_forma_pago() {
        return forma_pago_id_forma_pago;
    }

    public void setForma_pago_id_forma_pago(int forma_pago_id_forma_pago) {
        this.forma_pago_id_forma_pago = forma_pago_id_forma_pago;
    }

    public int getArticulo_id_articulo() {
        return articulo_id_articulo;
    }

    public void setArticulo_id_articulo(int articulo_id_articulo) {
        this.articulo_id_articulo = articulo_id_articulo;
    }

    public int getTipo_mov_id_tipo_mov() {
        return tipo_mov_id_tipo_mov;
    }

    public void setTipo_mov_id_tipo_mov(int tipo_mov_id_tipo_mov) {
        this.tipo_mov_id_tipo_mov = tipo_mov_id_tipo_mov;
    }

    public int getTipo_documento_contable_id_tipo_documento() {
        return tipo_documento_contable_id_tipo_documento;
    }

    public void setTipo_documento_contable_id_tipo_documento(int tipo_documento_contable_id_tipo_documento) {
        this.tipo_documento_contable_id_tipo_documento = tipo_documento_contable_id_tipo_documento;
    }

    
}
