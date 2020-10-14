package pruebas;

import controlador.formaPagoDAO;
import java.util.ArrayList;
import modelo.forma_pago;

public class pruebaEliminarFormaPago {

    public static void main(String[] args) {
        
        formaPagoDAO fopaDAO = new formaPagoDAO();
        
        ArrayList<forma_pago> mi_lista_fopa = fopaDAO.Listarforma_pago(0, "", 0);
        for (forma_pago I : mi_lista_fopa) {
            System.out.println("Código: " + I.getId_forma_pago() + " tipo de pago: " + I.getTipo_pago());
        }
        System.out.println("Se eliminó");
        fopaDAO.Eliminarforma_pago(mi_lista_fopa.get(0));
        mi_lista_fopa = fopaDAO.Listarforma_pago(0, "", 0);
        for (forma_pago I : mi_lista_fopa) {
            System.out.println("Código: " + I.getId_forma_pago() + " Saldo: " + I.getTipo_pago());
        }
    }
    
}
