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
            String Query = "Insert into proveedor (pr_nombre, pr_identificacion, pr_tipo, pr_telefono, pr_direccion, pr_correo)" + "values (?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Proveedor.getPr_nombre());
            sentencia.setString(2, Proveedor.getPr_identificacion());
            sentencia.setString(3, Proveedor.getPr_tipo());
            sentencia.setInt(4, Proveedor.getPr_telefono());
            sentencia.setString(5, Proveedor.getPr_direccion());
            sentencia.setString(6, Proveedor.getPr_correo());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarProveedor_proveedorDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

     public String ActualizarProveedor (proveedor Proveedor) { 

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update proveedor set pr_nombre=?, pr_identificacion=?, pr_tipo=?, pr_telefono=?, pr_direccion=?, pr_correo=? where pr_identificacion=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Proveedor.getPr_nombre());
            sentencia.setString(2, Proveedor.getPr_identificacion());
            sentencia.setString(3, Proveedor.getPr_tipo());
            sentencia.setInt(4, Proveedor.getPr_telefono());
            sentencia.setString(5, Proveedor.getPr_direccion());
            sentencia.setString(6, Proveedor.getPr_correo());
            sentencia.setString(7, Proveedor.getPr_identificacion());

            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AtualizarUsuario_usuariosDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
     
     //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////

     public proveedor ConsultarProveedor(String pr_identificacion) {
        proveedor mi_proveedor = null;
    
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = "Select id_proveedor, pr_nombre, pr_identificacion, pr_tipo, pr_telefono, pr_direccion, pr_correo from proveedor where pr_identificacion = " + pr_identificacion;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()){
            
                mi_proveedor = new proveedor();
                mi_proveedor.setId_proveedor(rs.getInt(1));
                mi_proveedor.setPr_nombre(rs.getString(2));
                mi_proveedor.setPr_identificacion(rs.getString(3));
                mi_proveedor.setPr_tipo(rs.getString(4));
                mi_proveedor.setPr_telefono(rs.getInt(5));
                mi_proveedor.setPr_direccion(rs.getString(6));
                mi_proveedor.setPr_correo(rs.getString(7));
                
            }
   
         return mi_proveedor;            
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarProveedor_proveedorDAO\n " + ex.getMessage());
        }
        return mi_proveedor;
    }
     
        //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////

     public ArrayList<proveedor> ListarProveedor(String pr_nombre, String pr_identificacion, String pr_correo) {
       ArrayList<proveedor>mi_listado_provedores = new ArrayList<proveedor>();
        proveedor mi_proveedor;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + pr_identificacion);
        try{
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = " select id_proveedor,pr_nombre,pr_identificacion,pr_tipo,pr_telefono,pr_direccion,pr_correo "
                    + " from proveedor "
                    + " where pr_nombre like '%" + pr_nombre + "%' "
                    + "  or (pr_identificacion) like ('%" + pr_identificacion + "%') "
                    + "  or (pr_correo) like ('%" + pr_correo + "%') ORDER BY pr_identificacion;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                mi_proveedor = new proveedor();
                mi_proveedor.setId_proveedor(rs.getInt(1));
                mi_proveedor.setPr_nombre(rs.getString(2));
                mi_proveedor.setPr_identificacion(rs.getString(3));
                mi_proveedor.setPr_tipo(rs.getString(4));
                mi_proveedor.setPr_telefono(rs.getInt(5));
                mi_proveedor.setPr_direccion(rs.getString(6));
                mi_proveedor.setPr_correo(rs.getString(7));
                mi_listado_provedores.add(mi_proveedor);
            }
            return mi_listado_provedores;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ListarProveedor_proveedorDAO\n " + ex.getMessage());
        }
        return mi_listado_provedores;
    }
     
      //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarProveedor(proveedor Proveedor) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from proveedor where id_proveedor = ? and pr_identificacion = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, Proveedor.getId_proveedor());
            sentencia.setString(2, Proveedor.getPr_identificacion());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarProveedor_proveedorDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
  }


