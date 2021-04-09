package pruebas;

import controlador.proveedorDAO;
import modelo.proveedor;

public class pruebaConsultarProveedor {

    public static void main(String[] args) {
        
        proveedorDAO miprovdao = new proveedorDAO();
        proveedor miprov = miprovdao.ConsultarProveedor("37625344");

        if (miprov != null) {
            System.out.println("El proveedor se ha encontrado: --> " + miprov.getId_proveedor() + " " + miprov.getPr_nombre()+ " " + miprov.getPr_tipo() + " " + miprov.getPr_telefono() + " " + miprov.getPr_direccion() + " " + miprov.getPr_correo());
        } else {
            System.out.println("El proveedor no fue encontrada");
        }
        
    }
    
}
