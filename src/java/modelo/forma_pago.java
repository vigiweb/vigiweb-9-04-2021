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
    private int referencia_Pago;

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

    public int getReferencia_Pago() {
        return referencia_Pago;
    }

    public void setReferencia_Pago(int referencia_Pago) {
        this.referencia_Pago = referencia_Pago;
    }
    
}
