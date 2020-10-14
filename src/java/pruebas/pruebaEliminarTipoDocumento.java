/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.tipoDocumentoDAO;
import modelo.tipo_documento;
import java.util.ArrayList;

public class pruebaEliminarTipoDocumento {

    
    public static void main(String[] args) {
      tipoDocumentoDAO mi_tipo_documento_dao = new tipoDocumentoDAO();
        
        ArrayList<tipo_documento> mi_listado_tipo_documento = mi_tipo_documento_dao.ConsultarListadoTipoDocumento(0, "");
        for (tipo_documento D : mi_listado_tipo_documento) {
            System.out.println(" ID. " + D.getId_tipo_documento()+ " Precio : " + D.getDescrip());
        }
        System.out.println("Se elimino");
        mi_tipo_documento_dao.EliminarTipoUsuario(mi_listado_tipo_documento.get(0));
        mi_listado_tipo_documento = mi_tipo_documento_dao.ConsultarListadoTipoDocumento(0, "");
        for (tipo_documento D : mi_listado_tipo_documento) {
            System.out.println(" ID. " + D.getId_tipo_documento()+ " Precio : " + D.getDescrip());
        }
    }
    
}
  