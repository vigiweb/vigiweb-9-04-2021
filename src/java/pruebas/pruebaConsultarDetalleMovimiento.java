


package Pruebas;

import controlador.detalleMovimientoDAO;
import modelo.detalle_movimiento;


public class pruebaConsultarDetalleMovimiento {

    
    public static void main(String[] args) {
        
        detalleMovimientoDAO mi_detalle_movimiento_dao = new detalleMovimientoDAO();
        detalle_movimiento mi_detalle_movimiento = mi_detalle_movimiento_dao.ConsultarDetalleMovimiento(1);

        if (mi_detalle_movimiento != null) {
            System.out.println("Detalle movimiento encontrado " + mi_detalle_movimiento.getId_detalle_movimiento() + " " + mi_detalle_movimiento.getTotal_articulo() + " ");
        } else {
            System.out.println("El detalle movimiento no fue encontrado");
        }
    }
    
}
