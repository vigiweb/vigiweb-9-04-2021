package pruebas;

import controlador.facturaDAO;
import java.util.ArrayList;
import modelo.factura;

public class pruebaConsultarListaFactura {

    public static void main(String[] args) {
        
        facturaDAO facdao = new facturaDAO();
        ArrayList<factura> mi_fac = new ArrayList<factura>();
        mi_fac = facdao.Listarfactura(0, "", 0);
        
        int size = mi_fac.size();
        System.out.println("<table border=\"1\"><tr><td>id_factura</td><td>fechafactura</td><td>usuarios_id_usuarios</td>");
        
        for(factura I: mi_fac){
            
            System.out.println("<tr>");
            System.out.println("<td>" + I.getId_factura()+ "</td>");
            System.out.println("<td>" + I.getFecha_factura()+ "</td>");
            System.out.println("<td>" + I.getUsuarios_id_usuarios() + "</td>");
            
            System.out.println("</tr>");
            
        }
        
    }
    
}
