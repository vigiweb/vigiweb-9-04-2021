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
 * @author Famil
 */
public class pruebaAdicionarMovimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       movimientosDAO mi_movimientos_dao = new movimientosDAO();
       movimientos mi_movimientos = new movimientos();
       
       Scanner teclado = new Scanner(System.in);
       
       String fecha = "";
       int cantidad;
       double precio_total;
       int numero_documento;
       int forma_pago_id_forma_pago;
       int articulo_id_articulo;
       int tipo_mov_id_tipo_mov;
       int tipo_documento_contable_id_tipo_documento;
       
        System.out.println("Ingrese la fecha del movimiento");
        fecha = teclado.nextLine();
        
        System.out.println("Ingrese la cantidad del artículo");
        cantidad = teclado.nextInt();
        
        System.out.println("Ingrese el numero del documento");
        numero_documento = teclado.nextInt();
        
        System.out.println("Ingrese el id del artículo");
        articulo_id_articulo = teclado.nextInt();
        
        System.out.println("Ingrese el id de la forma de pago");
        forma_pago_id_forma_pago = teclado.nextInt();
        
        System.out.println("Ingrese el id del tipo de movimiento");
        tipo_mov_id_tipo_mov = teclado.nextInt();
        
        System.out.println("Ingrese el id del tipo de documento");
        tipo_documento_contable_id_tipo_documento = teclado.nextInt();
        
        System.out.println("Ingrese el precio total");
        precio_total = teclado.nextDouble();
        
        mi_movimientos.setFecha(fecha);
        mi_movimientos.setCantidad(cantidad);
        mi_movimientos.setPrecio_total(precio_total);
        mi_movimientos.setNumero_documento(numero_documento);
        mi_movimientos.setForma_pago_id_forma_pago(forma_pago_id_forma_pago);
        mi_movimientos.setArticulo_id_articulo(articulo_id_articulo);
        mi_movimientos.setTipo_mov_id_tipo_mov(tipo_mov_id_tipo_mov);
        mi_movimientos.setTipo_documento_contable_id_tipo_documento(tipo_documento_contable_id_tipo_documento);
        
        String miRespuesta = mi_movimientos_dao.adicionarMovimientos(mi_movimientos);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Registro exitoso");
        }else {
            System.out.println("Ocurrio un error " + miRespuesta);
        
        } 
    }
    }
    

