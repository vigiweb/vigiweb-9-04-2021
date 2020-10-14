/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.actualizar;

import controlador.tipoDocumentoContableDAO;
import java.util.Scanner;
import modelo.tipo_documento_contable;

/**
 *
 * @author Famil
 */
public class pruebaActualizarTipoDocumentoContable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        tipoDocumentoContableDAO mitipo_documento_contable_dao = new tipoDocumentoContableDAO();
        tipo_documento_contable mitipo_documento_contable = new tipo_documento_contable();

        Scanner dato = new Scanner(System.in);

        int id_tipo_documento;
        String codigo = "";
        String descrip = "";

        System.out.println("Digite el códico del tipo documento contable");
        codigo = dato.nextLine();

        System.out.println("Digite el nombre del tipo documento contable");
        descrip = dato.nextLine();

        System.out.println("Digite el id del tipo documento contable");
        id_tipo_documento = dato.nextInt();

        mitipo_documento_contable.setId_tipo_documento(id_tipo_documento);
        mitipo_documento_contable.setCodigo(codigo);
        mitipo_documento_contable.setDescrip(descrip);

        mitipo_documento_contable.setId_tipo_documento(id_tipo_documento);

        String miRespuesta = mitipo_documento_contable_dao.actualizarTipoDocumentoContable(mitipo_documento_contable);

        if (miRespuesta.length() == 0) {
            System.out.println("Actualización exitosa");
        } else {
            System.err.println("ocurrio error" + miRespuesta);
        }
    }

}
