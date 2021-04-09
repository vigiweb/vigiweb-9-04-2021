package pruebas;

import controlador.proveedorDAO;
import java.util.Scanner;
import modelo.proveedor;

public class pruebaActualizarProveedor {

    public static void main(String[] args) {
        proveedorDAO miprovdao = new proveedorDAO();
       proveedor miprov = new proveedor();
       
       Scanner dato = new Scanner(System.in);
       
       String pr_nombre = "";
       String pr_identificacion = "";
       String pr_tipo = "";
       int pr_telefono;
       String pr_direccion = "";
       String pr_correo = "";
       

       
        System.out.println("Digite el nuevo nombre:");
        pr_nombre = dato.nextLine();
        
        System.out.println("Ingrese la identificación del proveedor");
        pr_identificacion = dato.nextLine();
       
        System.out.println("Digite el nuevo tipo de proveedor:");
        pr_tipo = dato.nextLine();

        System.out.println("Digite la nueva dirección:");
        pr_direccion = dato.nextLine();
       
        System.out.println("Digite el nuevo correo:");
        pr_correo = dato.nextLine();
        
        System.out.println("Digite el nuevo telefono:");
        pr_telefono = dato.nextInt();
        
        
        miprov.setPr_identificacion(pr_identificacion);
        miprov.setPr_nombre(pr_nombre);
        miprov.setPr_tipo(pr_tipo);
        miprov.setPr_telefono(pr_telefono);
        miprov.setPr_direccion(pr_direccion);
        miprov.setPr_correo(pr_correo);
        miprov.setPr_identificacion(pr_identificacion);
        
        String miRespuesta = miprovdao.ActualizarProveedor(miprov);

        if (miRespuesta.length() == 0) {
            System.out.println("Actualización exitosa");
        } else {
            System.err.println("ocurrio error" + miRespuesta);
        }
    }
}
