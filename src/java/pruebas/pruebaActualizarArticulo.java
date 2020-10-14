/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.articuloDAO;
import java.util.Scanner;
import modelo.articulo;

/**
 *
 * @author Famil
 */
public class pruebaActualizarArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        articuloDAO miarticuloDAO = new articuloDAO();
        articulo miarticulo = new articulo();

        Scanner teclado = new Scanner(System.in);

        int id_articulo;
        String nombre_articulo = "";
        double precio_articulo;
        int cantidad_articulo;
        double iva_articulo;
        String descripcion_articulo = "";
        
        System.out.println("Ingrese el nombre del artículo");
        nombre_articulo = teclado.nextLine();

        System.out.println("Ingrese la descripción del artículo");
        descripcion_articulo = teclado.nextLine();


        System.out.println("Ingrese el precio del artículo");
        precio_articulo = teclado.nextDouble();

        System.out.println("Ingrese el IVA del artículo");
        iva_articulo = teclado.nextDouble();
        
        System.out.println("Ingrese la cantidad del artículo");
        cantidad_articulo = teclado.nextInt();

        System.out.println("Ingrese el ID del artículo");
        id_articulo = teclado.nextInt();

        miarticulo.setId_articulo(id_articulo);
        miarticulo.setNombre_articulo(nombre_articulo);
        miarticulo.setPrecio_articulo(precio_articulo);
        miarticulo.setCantidad_articulo(cantidad_articulo);
        miarticulo.setIva_articulo(iva_articulo);
        miarticulo.setDescripcion_articulo(descripcion_articulo);

        miarticulo.setId_articulo(id_articulo);

        miarticulo.setInventario_id_inventario(1);
        miarticulo.setEstado_articulo_id_estado_articulo(1);
        miarticulo.setProveedor_id_proveedor(1);


        String respuesta = miarticuloDAO.ActualizarArticulo(miarticulo);

        if (respuesta.length() == 0) {

            System.out.println("Actualización exitosa");
        } else {
            System.out.println("Ocurrio un error " + respuesta);

        }
    }
}
