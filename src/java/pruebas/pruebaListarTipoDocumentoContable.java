/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.listar;

import controlador.tipoDocumentoContableDAO;
import java.util.ArrayList;
import modelo.tipo_documento_contable;

/**
 *
 * @author Famil
 */
public class pruebaListarTipoDocumentoContable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tipoDocumentoContableDAO tipo_documento_contable_dao = new tipoDocumentoContableDAO();
        ArrayList<tipo_documento_contable> mi_tipo_documento_contable = new ArrayList<tipo_documento_contable>();
        mi_tipo_documento_contable = tipo_documento_contable_dao.ConsultarListadoTipoDocumentoContable(0, "");

        int size = mi_tipo_documento_contable.size();
        System.out.println("<table border=\"1\"><tr><td>id_cat_mat_prim</td><td>descrip</td> ");

        for (tipo_documento_contable C : mi_tipo_documento_contable) {

            System.out.println("<tr>");
            System.out.println("<td>" + C.getId_tipo_documento() + "</td>");
            System.out.println("<td>" + C.getCodigo() + "</td>");
            System.out.println("<td>" + C.getDescrip() + "</td>");

            System.out.println("</tr>");

        }
    }
    
}
