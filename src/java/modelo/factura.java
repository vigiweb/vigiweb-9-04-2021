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
public class factura {
    
    private int id_factura;
    private String fecha_factura;
    private int usuarios_id_usuarios;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public int getUsuarios_id_usuarios() {
        return usuarios_id_usuarios;
    }

    public void setUsuarios_id_usuarios(int usuarios_id_usuarios) {
        this.usuarios_id_usuarios = usuarios_id_usuarios;
    }

    
    
}
