package pruebas;

import controlador.facturaDAO;
import modelo.factura;

public class pruebaConsultarFactura {

    public static void main(String[] args) {
        
        facturaDAO mifacdao = new facturaDAO();
        factura mifac = mifacdao.ConsultarFactura(1);

        if (mifac != null) {
            System.out.println("La factura se ha encontrado: --> " + mifac.getId_factura() + " " + mifac.getFecha_factura()+ " " + mifac.getUsuarios_id_usuarios());
        } else {
            System.out.println("La factura no fue encontrada");
        }
        
    }
    
}
