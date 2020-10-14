package pruebas;

import controlador.formaPagoDAO;
import java.util.Scanner;
import modelo.forma_pago;

public class pruebaActualizarFormaPago {

    public static void main(String[] args) {
        formaPagoDAO mifopadao = new formaPagoDAO();
        forma_pago mifopa = new forma_pago();

        Scanner dato = new Scanner(System.in);

        int id_forma_pago;
        String tipo_pago = "";
        int referencia_Pago;

        System.out.println("Digite el tipo de pago");
        tipo_pago = dato.next();

        System.out.println("Digite la referencia monetaria");
        referencia_Pago = dato.nextInt();

        System.out.println("Digite el ID de la forma de pago");
        id_forma_pago = dato.nextInt();

        mifopa.setId_forma_pago(id_forma_pago);
        mifopa.setTipo_pago(tipo_pago);
        mifopa.setReferencia_Pago(referencia_Pago);

        mifopa.setId_forma_pago(id_forma_pago);

        String miRespuesta = mifopadao.Actualizarforma_pago(mifopa);

        if (miRespuesta.length() == 0) {
            System.out.println("Actualización exitosa");
        } else {
            System.err.println("ocurrio error" + miRespuesta);
        }
    }
}
