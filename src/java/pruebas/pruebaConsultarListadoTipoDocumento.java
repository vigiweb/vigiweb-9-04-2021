/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.tipoDocumentoDAO;
import modelo.tipo_documento;
import java.util.ArrayList;

public class pruebaConsultarListadoTipoDocumento {

    
    public static void main(String[] args) {
    
        tipoDocumentoDAO tipo_documento_dao = new tipoDocumentoDAO();
        ArrayList<tipo_documento> mi_tipo_documento = new ArrayList<tipo_documento>();
        mi_tipo_documento = tipo_documento_dao.ConsultarListadoTipoDocumento(0, "");
        
        int size = mi_tipo_documento.size();
        System.out.println("<table border=\"1\"><tr><td>id_tipo_documento</td>descrip</td><td> ");
        
        for(tipo_documento D: mi_tipo_documento){
            
            System.out.println("<tr>");
            System.out.println("<td>" + D.getId_tipo_documento()+ "</td>");
            System.out.println("<td>" + D.getDescrip()+ "</td>");
            
            
            System.out.println("</tr>");
            
        }
    }
    
}
    