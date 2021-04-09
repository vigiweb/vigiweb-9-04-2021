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
public class proveedor {
    
    private int  id_proveedor;
    private String pr_nombre;
    private String pr_identificacion;
    private String pr_tipo;
    private int pr_telefono;
    private String pr_direccion;
    private String pr_correo;

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getPr_nombre() {
        return pr_nombre;
    }

    public void setPr_nombre(String pr_nombre) {
        this.pr_nombre = pr_nombre;
    }

    public String getPr_identificacion() {
        return pr_identificacion;
    }

    public void setPr_identificacion(String pr_identificacion) {
        this.pr_identificacion = pr_identificacion;
    }

    public String getPr_tipo() {
        return pr_tipo;
    }

    public void setPr_tipo(String pr_tipo) {
        this.pr_tipo = pr_tipo;
    }

    public int getPr_telefono() {
        return pr_telefono;
    }

    public void setPr_telefono(int pr_telefono) {
        this.pr_telefono = pr_telefono;
    }

    public String getPr_direccion() {
        return pr_direccion;
    }

    public void setPr_direccion(String pr_direccion) {
        this.pr_direccion = pr_direccion;
    }

    public String getPr_correo() {
        return pr_correo;
    }

    public void setPr_correo(String pr_correo) {
        this.pr_correo = pr_correo;
    }

}
