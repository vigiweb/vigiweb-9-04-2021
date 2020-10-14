
package Pruebas;

import modelo.tipo_genero;
import controlador.tipoGeneroDAO;

public class pruebaConsultarTipoGenero {

   
    public static void main(String[] args) {
     
        tipoGeneroDAO mi_tipo_genero_dao = new tipoGeneroDAO();
        tipo_genero mi_tipo_genero = mi_tipo_genero_dao.ConsultarTipoGenero(1);

        if (mi_tipo_genero != null) {
            System.out.println("Tipo genero encontrado " + mi_tipo_genero.getId_tipo_genero()+ " " + mi_tipo_genero.getDescrip_genero()+ " ");
        } else {
            System.out.println("El de genero no fue encontrado");
        }
    }
    
} 
    