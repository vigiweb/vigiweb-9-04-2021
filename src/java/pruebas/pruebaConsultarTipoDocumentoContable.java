/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.consultar;

import controlador.tipoDocumentoContableDAO;
import modelo.tipo_documento_contable;

/**
 *
 * @author Famil
 */
public class pruebaConsultarTipoDocumentoContable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tipoDocumentoContableDAO mi_tipo_documento_contable_dao = new tipoDocumentoContableDAO();
        tipo_documento_contable mi_tipo_documento_contable = mi_tipo_documento_contable_dao.ConsultarTipoDocumentoContable(1);

        if (mi_tipo_documento_contable != null) {
            System.out.println("Tipo documento contable encontrado " + mi_tipo_documento_contable.getId_tipo_documento() + " " + mi_tipo_documento_contable.getDescrip() + " " + mi_tipo_documento_contable.getCodigo());
        } else {
            System.out.println("El documento contable no fue encontrado");
        }
    }
    
}
