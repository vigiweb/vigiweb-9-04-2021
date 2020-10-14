/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.detalleMovimientoDAO;
import modelo.detalle_movimiento;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class pruebaEliminarDetalleMovimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        detalleMovimientoDAO mi_detalle_movimiento_dao = new detalleMovimientoDAO();
        
        ArrayList<detalle_movimiento> mi_listado_detalle_movimiento = mi_detalle_movimiento_dao.ConsultarListadoDetalleMovimiento(0, 0, 0);
        for (detalle_movimiento D : mi_listado_detalle_movimiento) {
            System.out.println(" ID. " + D.getId_detalle_movimiento() + " Precio : " + D.getPrecio_articulo());
        }
        System.out.println("Se elimino");
        mi_detalle_movimiento_dao.EliminarDetalleMovimiento(mi_listado_detalle_movimiento.get(0));
        mi_listado_detalle_movimiento = mi_detalle_movimiento_dao.ConsultarListadoDetalleMovimiento(0, 0, 0);
        for (detalle_movimiento D : mi_listado_detalle_movimiento) {
            System.out.println(" ID. " + D.getId_detalle_movimiento() + " Precio : " + D.getPrecio_articulo());
        }
    }
    
}
