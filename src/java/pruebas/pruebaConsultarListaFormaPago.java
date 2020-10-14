package pruebas;

import controlador.formaPagoDAO;
import java.util.ArrayList;
import modelo.forma_pago;

public class pruebaConsultarListaFormaPago{

    public static void main(String[] args) {
        
        formaPagoDAO fopadao = new formaPagoDAO();
        ArrayList<forma_pago> mi_fopa = new ArrayList<forma_pago>();
        mi_fopa = fopadao.Listarforma_pago(0, "", 0);
        
        int size = mi_fopa.size();
        System.out.println("<table border=\"1\"><tr><td>id_forma_pago</td><td>tipo_pago</td><td>referencia_Pago</td>");
        
        for(forma_pago I: mi_fopa){
            
            System.out.println("<tr>");
            System.out.println("<td>" + I.getId_forma_pago()+ "</td>");
            System.out.println("<td>" + I.getTipo_pago() + "</td>");
            System.out.println("<td>" + I.getReferencia_Pago() + "</td>");
            
            System.out.println("</tr>");
            
        }
        
    }
    
}
