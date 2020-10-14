package pruebas;

import controlador.facturaDAO;
import java.util.Scanner;
import modelo.factura;

public class pruebaActualizarFactura {

    public static void main(String[] args) {
        
       facturaDAO mifacdao = new facturaDAO();
       factura mifac = new factura();
       
       Scanner dato = new Scanner(System.in);
       
       int id_factura;
       String fechafactura = "";
    
        System.out.println("Digite el id de la factura para ser actualizada");
        id_factura = dato.nextInt();
       
        System.out.println("Digite la fecha");
        fechafactura = dato.next();
        
        mifac.setId_factura(id_factura);
        mifac.setFecha_factura(fechafactura);
        
        mifac.setId_factura(id_factura);
        mifac.setUsuarios_id_usuarios(1);
        
        String miRespuesta = mifacdao.ActualizarFactura(mifac);

        if (miRespuesta.length() == 0) {
            System.out.println("Actualización exitosa");
        } else {
            System.err.println("ocurrio error" + miRespuesta);
        }
    }
}
