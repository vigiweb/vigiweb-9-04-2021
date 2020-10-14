package pruebas;

import controlador.formaPagoDAO;
import modelo.forma_pago;

public class pruebaConsultarFormaPago {

    public static void main(String[] args) {
        
        formaPagoDAO mifopadao = new formaPagoDAO();
        forma_pago mifopa = mifopadao.Consultarforma_pago(1);

        if (mifopa != null) {
            System.out.println("La forma de pago se ha encontrado: --> " + mifopa.getId_forma_pago() + " " + mifopa.getTipo_pago()+ " " + mifopa.getReferencia_Pago());
        } else {
            System.out.println("La forma de pago no fue encontrada");
        }
        
    }
    
}
