package pruebas;

import controlador.proveedorDAO;
import java.util.ArrayList;
import modelo.proveedor;

public class pruebaConsultarListaProveedor {

    public static void main(String[] args) {
        
        proveedorDAO provdao = new proveedorDAO();
        ArrayList<proveedor> mi_prov = new ArrayList<proveedor>();
        mi_prov = provdao.ListarProveedor(0, "");
        
        int size = mi_prov.size();
        System.out.println("<table border=\"1\"><tr><td>idproveedor</td><td>pr_nombre</td><td>pr_tipo</td><td>pr_telefono</td><td>pr_direccion</td><td>pr_correo</td>");
        
        for(proveedor I: mi_prov){
            
            System.out.println("<tr>");
            System.out.println("<td>" + I.getId_proveedor()+ "</td>");
            System.out.println("<td>" + I.getPr_nombre() + "</td>");
            System.out.println("<td>" + I.getPr_tipo() + "</td>");
            System.out.println("<td>" + I.getPr_telefono() + "</td>");
            System.out.println("<td>" + I.getPr_direccion() + "</td>");
            System.out.println("<td>" + I.getPr_correo() + "</td>");
            
            System.out.println("</tr>");
            
        }
        
    }
    
}
