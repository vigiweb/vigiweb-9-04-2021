/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.tipoDocumentoDAO;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import modelo.tipo_documento;
import java.util.Scanner;

public class pruebaActualizarTipoDocumento {

    
    public static void main(String[] args) {
        
       tipoDocumentoDAO mi_tipo_documento_dao = new tipoDocumentoDAO();
       tipo_documento mi_tipo_documento = new tipo_documento();
        
        Scanner teclado = new Scanner(System.in); 
        
        int id_tipo_documento;
        String descrip;
        
        System.out.println("Digite el nombre del documento");
        descrip = teclado.nextLine();
        
        System.out.println("Digite el ID del documento");
        id_tipo_documento = teclado.nextInt();
        
        mi_tipo_documento.setId_tipo_documento(id_tipo_documento);
        mi_tipo_documento.setDescrip(descrip);
  
        mi_tipo_documento.setId_tipo_documento(id_tipo_documento);
        
        String miRespuesta = mi_tipo_documento_dao.actualizarTipoDocumento(mi_tipo_documento);
        
            if (miRespuesta.length() == 0) {

            System.out.println("Actualización exitosa");
            } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }
        
         
      }
    
}
