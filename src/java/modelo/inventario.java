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
public class inventario {
    
    private int id_inventario;
    private double in_entradas;
    private double in_salidas;
    private double in_saldo;

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public double getIn_entradas() {
        return in_entradas;
    }

    public void setIn_entradas(double in_entradas) {
        this.in_entradas = in_entradas;
    }

    public double getIn_salidas() {
        return in_salidas;
    }

    public void setIn_salidas(double in_salidas) {
        this.in_salidas = in_salidas;
    }

    public double getIn_saldo() {
        return in_saldo;
    }

    public void setIn_saldo(double in_saldo) {
        this.in_saldo = in_saldo;
    }

    
    
}
