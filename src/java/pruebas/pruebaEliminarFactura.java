package pruebas;

import controlador.facturaDAO;
import java.util.ArrayList;
import modelo.factura;

public class pruebaEliminarFactura {

    public static void main(String[] args) {
        
        facturaDAO facDAO = new facturaDAO();
        
        ArrayList<factura> mi_lista_factura = facDAO.Listarfactura(0, "", 0);
        for (factura I : mi_lista_factura) {
            System.out.println("Código: " + I.getId_factura() + " Fecha: " + I.getFecha_factura());
        }
        System.out.println("Se eliminó");
        facDAO.Eliminarfactura(mi_lista_factura.get(0));
        mi_lista_factura = facDAO.Listarfactura(0, "", 0);
        for (factura I : mi_lista_factura) {
            System.out.println("Código: " + I.getId_factura() + " Saldo: " + I.getFecha_factura());
        }
    }
    
}
