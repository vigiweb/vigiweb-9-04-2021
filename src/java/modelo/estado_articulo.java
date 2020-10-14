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
public class estado_articulo {
    
    private int id_estado_articulo;
    private String descrip_estado;

    public int getId_estado_articulo() {
        return id_estado_articulo;
    }

    public void setId_estado_articulo(int id_estado_articulo) {
        this.id_estado_articulo = id_estado_articulo;
    }

    public String getDescrip_estado() {
        return descrip_estado;
    }

    public void setDescrip_estado(String descrip_estado) {
        this.descrip_estado = descrip_estado;
    }
}
