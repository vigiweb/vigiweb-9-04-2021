package pruebas;

import controlador.proveedorDAO;
import java.util.Scanner;
import modelo.proveedor;

public class pruebaActualizarProveedor {

    public static void main(String[] args) {
        proveedorDAO miprovdao = new proveedorDAO();
       proveedor miprov = new proveedor();
       
       Scanner dato = new Scanner(System.in);
       
       int id_proveedor;
       String pr_nombre = "";
       String pr_tipo = "";
       int pr_telefono;
       String pr_direccion = "";
       String pr_correo = "";
       

       
        System.out.println("Digite el nuevo nombre:");
        pr_nombre = dato.nextLine();
       
        System.out.println("Digite el nuevo tipo de proveedor:");
        pr_tipo = dato.nextLine();

        System.out.println("Digite la nueva dirección:");
        pr_direccion = dato.nextLine();
       
        System.out.println("Digite el nuevo correo:");
        pr_correo = dato.nextLine();
        
        System.out.println("Digite el nuevo telefono:");
        pr_telefono = dato.nextInt();
        
        System.out.println("Digite el ID del proveedor");
        id_proveedor = dato.nextInt();
        
        miprov.setId_proveedor(id_proveedor);
        miprov.setPr_nombre(pr_nombre);
        miprov.setPr_tipo(pr_tipo);
        miprov.setPr_telefono(pr_telefono);
        miprov.setPr_direccion(pr_direccion);
        miprov.setPr_correo(pr_correo);
        miprov.setId_proveedor(id_proveedor);
        
        String miRespuesta = miprovdao.ActualizarProveedor(miprov);

        if (miRespuesta.length() == 0) {
            System.out.println("Actualización exitosa");
        } else {
            System.err.println("ocurrio error" + miRespuesta);
        }
    }
}
