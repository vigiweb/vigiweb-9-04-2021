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
public class articulo {
    
    private int id_articulo;
    private String nombre_articulo;
    private double precio_articulo;
    private int cantidad_articulo;
    private double iva_articulo;
    private String descripcion_articulo;
    private int inventario_id_inventario;
    private int estado_articulo_id_estado_articulo;
    private int proveedor_id_proveedor;

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public double getPrecio_articulo() {
        return precio_articulo;
    }

    public void setPrecio_articulo(double precio_articulo) {
        this.precio_articulo = precio_articulo;
    }

    public int getCantidad_articulo() {
        return cantidad_articulo;
    }

    public void setCantidad_articulo(int cantidad_articulo) {
        this.cantidad_articulo = cantidad_articulo;
    }

    public double getIva_articulo() {
        return iva_articulo;
    }

    public void setIva_articulo(double iva_articulo) {
        this.iva_articulo = iva_articulo;
    }

    public String getDescripcion_articulo() {
        return descripcion_articulo;
    }

    public void setDescripcion_articulo(String descripcion_articulo) {
        this.descripcion_articulo = descripcion_articulo;
    }

    public int getInventario_id_inventario() {
        return inventario_id_inventario;
    }

    public void setInventario_id_inventario(int inventario_id_inventario) {
        this.inventario_id_inventario = inventario_id_inventario;
    }

    public int getEstado_articulo_id_estado_articulo() {
        return estado_articulo_id_estado_articulo;
    }

    public void setEstado_articulo_id_estado_articulo(int estado_articulo_id_estado_articulo) {
        this.estado_articulo_id_estado_articulo = estado_articulo_id_estado_articulo;
    }

    public int getProveedor_id_proveedor() {
        return proveedor_id_proveedor;
    }

    public void setProveedor_id_proveedor(int proveedor_id_proveedor) {
        this.proveedor_id_proveedor = proveedor_id_proveedor;
    }

    
}
