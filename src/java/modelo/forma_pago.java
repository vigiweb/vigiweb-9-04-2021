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
public class forma_pago {
    
    private int  id_forma_pago;
    private String tipo_pago;
    private String referencia_pago;

    public int getId_forma_pago() {
        return id_forma_pago;
    }

    public void setId_forma_pago(int id_forma_pago) {
        this.id_forma_pago = id_forma_pago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getReferencia_pago() {
        return referencia_pago;
    }

    public void setReferencia_pago(String referencia_pago) {
        this.referencia_pago = referencia_pago;
    }

    
    
}
