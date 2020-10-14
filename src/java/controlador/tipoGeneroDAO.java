/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.tipo_genero;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Famil
 */

    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////

public class tipoGeneroDAO {
    
    public String AdicionarGenero (tipo_genero TipoGenero) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "Insert into tipo_genero (descrip_genero)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString (1, TipoGenero.getDescrip_genero());
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurido un error en Adicionar tipoGeneroDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }  
    
     /*METODO ACTUALIZAR*/

       public String actualizarTipoGenero (tipo_genero TipoGenero) {
                
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        
          try { 
          String Query = "update tipo_genero set id_tipo_genero = ?, descrip_genero = ? where id_tipo_genero =?";
          
          sentencia = nuevaCon.prepareStatement(Query);
          
          sentencia.setInt(1, TipoGenero.getId_tipo_genero());
          sentencia.setString(2, TipoGenero.getDescrip_genero());
          sentencia.setInt(3, TipoGenero.getId_tipo_genero());

            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en actualizarTipoGenero_tipoGeneroDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    //////////////////////*METODO CONSULTAR*//////////////////////////////////////
       
       public tipo_genero ConsultarTipoGenero(int id_tipo_genero) {
              tipo_genero mi_tipo_genero = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_tipo_genero, descrip_genero from tipo_genero where id_tipo_genero =  " + id_tipo_genero;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_tipo_genero = new tipo_genero();
                
                mi_tipo_genero.setId_tipo_genero(rs.getInt(1));
                mi_tipo_genero.setDescrip_genero(rs.getString(2));
                
    
             }

            return mi_tipo_genero;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarTipoGenero_tipoGeneroDAO\n " + ex.getMessage());
        }
            
        return mi_tipo_genero;
     }
        //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////
    public ArrayList<tipo_genero> ConsultarListadoTipoGenero(int id_tipo_genero, String descrip_genero) {
        ArrayList<tipo_genero> mi_listado_tipo_genero = new ArrayList<tipo_genero>();
        tipo_genero mi_tipo_genero;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro: " + id_tipo_genero);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select id_tipo_genero,descrip_genero "
                    + " from tipo_genero "
                    + " where id_tipo_genero like '%" + id_tipo_genero + "%' "
                    + "  or (descrip_genero) like ('%" + descrip_genero + "%') ORDER BY id_tipo_genero;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_tipo_genero = new tipo_genero();
                mi_tipo_genero.setId_tipo_genero(rs.getInt(1));
                mi_tipo_genero.setDescrip_genero(rs.getString(2));
                mi_listado_tipo_genero.add(mi_tipo_genero);
            }
            return mi_listado_tipo_genero;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoTipoGenero_tipoGeneroDAO\n " + ex.getMessage());
        }
        return mi_listado_tipo_genero;

    }
    
        //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarTipoUsuario(tipo_genero tipoGenero) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from tipo_genero where id_tipo_genero = ? and descrip_genero = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, tipoGenero.getId_tipo_genero());
            sentencia.setString(2, tipoGenero.getDescrip_genero());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarTipoUsuario_tipoGeneroDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
}
