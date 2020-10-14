

package Pruebas;


import modelo.tipo_documento;
import controlador.tipoDocumentoDAO;


public class pruebaConsultarTipoDocumento {

   
    public static void main(String[] args) {
     
        tipoDocumentoDAO mi_tipo_documento_dao = new tipoDocumentoDAO();
        tipo_documento mi_tipo_documento = mi_tipo_documento_dao.ConsultarTipoDocumento(1);

        if (mi_tipo_documento != null) {
            System.out.println("Tipo Documento encontrado " + mi_tipo_documento.getId_tipo_documento()+ " " + mi_tipo_documento.getDescrip()+ " ");
        } else {
            System.out.println("El tipo de documento no fue encontrado");
        }
    }
    
}
