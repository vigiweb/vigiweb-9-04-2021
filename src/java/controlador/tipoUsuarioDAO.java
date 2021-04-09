/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.tipo_usuario;

/**
 *
 * @author Famil
 */

    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////


public class tipoUsuarioDAO {
    
    public String AdicionarTipoUsuario (tipo_usuario TipoUsuario) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "Insert into tipo_usuario (descp_usuario)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, TipoUsuario.getDescp_usuario());
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarTipoUsuario_tipoUsuarioDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }
    
//////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////
    
     public String actualizarTipoUsuario (tipo_usuario TipoUsuario) {
                
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        
          try { 
          String Query = "update tipo_usuario set id_tipo_usuario = ?, descp_usuario = ? where id_tipo_usuario=?";
          
          sentencia = nuevaCon.prepareStatement(Query);
          
          sentencia.setInt(1, TipoUsuario.getId_tipo_usuario());
          sentencia.setString(2, TipoUsuario.getDescp_usuario());
          sentencia.setInt(3, TipoUsuario.getId_tipo_usuario());

          sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarArticulo_articuloDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
     
          //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////
     
     public tipo_usuario ConsultarTipoUsuario(String id_tipo_usuario) {
           tipo_usuario mi_tipo_usuario = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_tipo_usuario, descp_usuario from tipo_usuario where id_tipo_usuario =  " + id_tipo_usuario;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_tipo_usuario = new tipo_usuario();
                
                mi_tipo_usuario.setId_tipo_usuario(rs.getInt(1));
                mi_tipo_usuario.setDescp_usuario(rs.getString(2));
    
             }

            return mi_tipo_usuario;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarTipoUsuario_tipoUsuarioDAO\n " + ex.getMessage());
        }
            
        return mi_tipo_usuario;
     }
     
         //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////
    public ArrayList<tipo_usuario> ConsultarListadoTipoUsuario(int id_tipo_usuario, String descp_usuario) {
        ArrayList<tipo_usuario> mi_listado_tipo_usuario = new ArrayList<tipo_usuario>();
        tipo_usuario mi_tipo_usuario;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro: " + id_tipo_usuario);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select id_tipo_usuario,descp_usuario "
                    + " from tipo_usuario "
                    + " where id_tipo_usuario like '%" + id_tipo_usuario + "%' "
                    + "  or (descp_usuario) like ('%" + descp_usuario + "%') ORDER BY id_tipo_usuario;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_tipo_usuario = new tipo_usuario();
                mi_tipo_usuario.setId_tipo_usuario(rs.getInt(1));
                mi_tipo_usuario.setDescp_usuario(rs.getString(2));
                mi_listado_tipo_usuario.add(mi_tipo_usuario);
            }
            return mi_listado_tipo_usuario;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoTipoUsuario_tipoUsuarioDAO\n " + ex.getMessage());
        }
        return mi_listado_tipo_usuario;

    }
    
    //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarTipoUsuario(tipo_usuario tipoUsuario) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from tipo_usuario where id_tipo_usuario = ? and descp_usuario = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, tipoUsuario.getId_tipo_usuario());
            sentencia.setString(2, tipoUsuario.getDescp_usuario());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarTipoUsuario_tipoUsuarioDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
}
