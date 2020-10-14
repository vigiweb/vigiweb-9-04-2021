/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoDocumentoDAO;
import java.util.Scanner;
import modelo.tipo_documento;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarTipoDocumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        tipoDocumentoDAO mi_tipo_documento_dao = new tipoDocumentoDAO();
        tipo_documento mi_tipo_documento = new tipo_documento();

        Scanner teclado = new Scanner(System.in);
        
       String descrip = "";


        System.out.println("Ingrese el tipo de documento");
        descrip = teclado.nextLine();

        
        mi_tipo_documento.setDescrip(descrip);
        String miRespuesta = mi_tipo_documento_dao.AdicionarTipoDocumento(mi_tipo_documento);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");
        } else {
            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
