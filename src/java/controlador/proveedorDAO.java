/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.Connection;
import modelo.proveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



/**
 *
 * @author Famil
 */

    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////


public class proveedorDAO {
    
    public String AdicionarProveedor(proveedor Proveedor) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "Insert into proveedor (pr_nombre, pr_tipo, pr_telefono, pr_direccion, pr_correo)" + "values (?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Proveedor.getPr_nombre());
            sentencia.setString(2, Proveedor.getPr_tipo());
            sentencia.setInt(3, Proveedor.getPr_telefono());
            sentencia.setString(4, Proveedor.getPr_direccion());
            sentencia.setString(5, Proveedor.getPr_correo());
            

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarProveedor_proveedorDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

     public String ActualizarProveedor (proveedor proveedors) { 

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update proveedor set id_proveedor=?, pr_nombre=?, pr_tipo=?, pr_telefono=?, pr_direccion=?, pr_correo=? where id_proveedor=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, proveedors.getId_proveedor());
            sentencia.setString(2, proveedors.getPr_nombre());
            sentencia.setString(3, proveedors.getPr_tipo());
            sentencia.setInt(4, proveedors.getPr_telefono());
            sentencia.setString(5, proveedors.getPr_direccion());
            sentencia.setString(6, proveedors.getPr_correo());
            
            sentencia.setInt(7, proveedors.getId_proveedor());
               
            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarProveedordao\n " + ex.getMessage());
        }
        return miRespuesta;
    }
     
     //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////

     public proveedor ConsultarProveedor(int id_proveedor) {
        proveedor proveedors = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_proveedor, pr_nombre, pr_tipo, pr_telefono, pr_direccion, pr_correo from proveedor where id_proveedor = " + id_proveedor;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                proveedors = new proveedor();
                
                proveedors.setId_proveedor(rs.getInt(1));
                proveedors.setPr_nombre(rs.getString(2));
                proveedors.setPr_tipo(rs.getString(3));
                proveedors.setPr_telefono(rs.getInt(4));
                proveedors.setPr_direccion(rs.getString(5));
                proveedors.setPr_correo(rs.getString(6));
            }
            return proveedors;  
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarProveedordao\n " + ex.getMessage());
        }
        return proveedors;
    }
     
        //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////

     public ArrayList<proveedor> ListarProveedor(int id_proveedor, String pr_nombre) {
       ArrayList<proveedor>lista_proveedor = new ArrayList<proveedor>();
        proveedor mi_proveedor;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + id_proveedor);
        try{
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = " select id_proveedor,pr_nombre,pr_tipo,pr_telefono,pr_direccion,pr_correo"
                    + " from proveedor"
                    + " where id_proveedor like '%" + id_proveedor + "%' "
                    + "  or (pr_nombre) like ('%" + pr_nombre + "%') ORDER BY id_proveedor;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                mi_proveedor = new proveedor();
                
                mi_proveedor.setId_proveedor(rs.getInt(1));
                mi_proveedor.setPr_nombre(rs.getString(2));
                mi_proveedor.setPr_tipo(rs.getString(3));
                mi_proveedor.setPr_telefono(rs.getInt(4));
                mi_proveedor.setPr_direccion(rs.getString(5));
                mi_proveedor.setPr_correo(rs.getString(6));

                lista_proveedor.add(mi_proveedor);
            }
            return lista_proveedor;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ListarProveedorDAO\n " + ex.getMessage());
        }
        return lista_proveedor;
    }
     
      //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

     public String EliminarProveedor (proveedor proveedors) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from proveedor where id_proveedor=? and pr_nombre=? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, proveedors.getId_proveedor());
            sentencia.setString(2, proveedors.getPr_nombre());

            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en EliminarProveedorDAO" + ex.getMessage());
        }
        return miRespuesta;
    }
    
}


