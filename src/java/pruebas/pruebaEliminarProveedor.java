package pruebas;

import controlador.proveedorDAO;
import java.util.ArrayList;
import modelo.proveedor;

public class pruebaEliminarProveedor {

    public static void main(String[] args) {
        
        proveedorDAO provDAO = new proveedorDAO();
        
        ArrayList<proveedor> mi_lista_prov = provDAO.ListarProveedor("Juan Soles", "545878", "juan@gmail.com");
        for (proveedor I : mi_lista_prov) {
            System.out.println("Código: " + I.getPr_identificacion() + " Nombre: " + I.getPr_nombre());
        }
        System.out.println("Se eliminó");
        provDAO.EliminarProveedor(mi_lista_prov.get(0));
        mi_lista_prov = provDAO.ListarProveedor("Juan Soles", "545878", "juan@gmail.com");
        for (proveedor I : mi_lista_prov) {
            System.out.println("Código: " + I.getPr_identificacion() + " Nombre: " + I.getPr_nombre());
        }
    }
    
}
