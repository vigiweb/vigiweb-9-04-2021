/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.movimientosDAO;
import java.util.Scanner;
import modelo.movimientos;

/**
 *
 * @author diego
 */
public class pruebaActualizarMovimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
           movimientosDAO mi_movimientos_dao = new movimientosDAO();
           movimientos mi_movimientos = new movimientos();
       
       Scanner teclado = new Scanner(System.in);
       
       int id_movimientos;
       String fecha = "";
       int cantidad;
       double precio_total;
       int numero_documento;
    
        System.out.println("Ingrese la fecha del movimiento");
        fecha = teclado.nextLine();
        
        System.out.println("Ingrese el ID del movimiento");
        id_movimientos = teclado.nextInt();
        
        System.out.println("Ingrese el numero del documento");
        numero_documento = teclado.nextInt();
   
        System.out.println("Ingrese la cantidad del artículo");
        cantidad = teclado.nextInt();

        System.out.println("Ingrese el precio total");
        precio_total = teclado.nextDouble();

        mi_movimientos.setId_movimientos(id_movimientos);
        mi_movimientos.setFecha(fecha);
        mi_movimientos.setCantidad(cantidad);
        mi_movimientos.setPrecio_total(precio_total);
        mi_movimientos.setNumero_documento(numero_documento);
        
        mi_movimientos.setId_movimientos(id_movimientos);
        
        mi_movimientos.setForma_pago_id_forma_pago(1);
        mi_movimientos.setArticulo_id_articulo(1);
        mi_movimientos.setTipo_mov_id_tipo_mov(1);
        mi_movimientos.setTipo_documento_contable_id_tipo_documento(1);
        
        
        String respuesta = mi_movimientos_dao.ActualizarMovimientos(mi_movimientos);
        
        
        if (respuesta.length() == 0) {
            
            System.out.println("Resgistro actualizado correctamente");
        }else {
            System.out.println("Ocurrio un error " + respuesta);
        
        }
    }
}
