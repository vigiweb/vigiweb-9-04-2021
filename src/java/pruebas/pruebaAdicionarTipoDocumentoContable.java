/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoDocumentoContableDAO;
import java.util.Scanner;
import modelo.tipo_documento_contable;

/**
 *
 * @author Famil
 */
public class pruebaAdicionarTipoDocumentoContable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       tipoDocumentoContableDAO mi_tipo_documento_contable_dao = new tipoDocumentoContableDAO();
       tipo_documento_contable mi_tipo_documento_contable = new tipo_documento_contable();
       
       Scanner teclado = new Scanner(System.in);
       
       String codigo = "";
       String descrip;

       
        System.out.println("Ingrese el código del tipo documento contable");
        codigo = teclado.nextLine();
        
        System.out.println("Ingrese el documento contable");
        descrip = teclado.nextLine();
        
        mi_tipo_documento_contable.setCodigo(codigo);
        mi_tipo_documento_contable.setDescrip(descrip);
        String miRespuesta = mi_tipo_documento_contable_dao.adicionarTipodocumentoContable(mi_tipo_documento_contable);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Registro exitoso");
        }else {
            System.out.println("Ocurrio un error " + miRespuesta);
        
        } 
    }

    }
    

