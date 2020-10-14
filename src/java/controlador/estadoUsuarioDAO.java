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
import modelo.estado_usuario;

    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////

public class estadoUsuarioDAO {

    public String AdicionarEstadoUsuario(estado_usuario EstadoUsuario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "Insert estado_usuario (descrip_estado)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, EstadoUsuario.getDescrip_estado());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en Adicionar estadoUsuarioDAO\n " + ex.getMessage());
        }

        return miRespuesta;
    }

    
//////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////
    
    public String ActualizarEstadoUsuario(estado_usuario EstadoUsuario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update estado_usuario set id_estado_usuario=?, descrip_estado=? where id_estado_usuario=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, EstadoUsuario.getId_estado_usuario());
            sentencia.setString(2, EstadoUsuario.getDescrip_estado());
            sentencia.setInt(3, EstadoUsuario.getId_estado_usuario());

            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarEstadoUsuarioDAO\n " + ex.getMessage());
        }

        return miRespuesta;
    }
    

///////////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////
    
    public estado_usuario ConsultarEstadoUsuario(int id_estado_usuario) {
        estado_usuario mi_estado_usuario = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_estado_usuario, descrip_estado from estado_usuario where id_estado_usuario = " + id_estado_usuario;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_estado_usuario = new estado_usuario();
                mi_estado_usuario.setId_estado_usuario(rs.getInt(1));
                mi_estado_usuario.setDescrip_estado(rs.getString(2));

            }

            return mi_estado_usuario;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarEstadoUsuario_estadoUsuarioDAO\n " + ex.getMessage());
        }
        return mi_estado_usuario;
    }
    

   //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////
 
    public ArrayList<estado_usuario> ConsultarListadoEstadoUsuario (int id_estado_usuario, String descrip_estado) {
        ArrayList<estado_usuario>mi_listado_estado_usuario = new ArrayList<estado_usuario>();
        estado_usuario mi_estado_usuario;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + id_estado_usuario);
        try{
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = " select id_estado_usuario,descrip_estado "
                    + " from estado_usuario "
                    + " where id_estado_usuario like '%" + id_estado_usuario + "%' "
                    + "  or (descrip_estado) like ('%" + descrip_estado + "%') ORDER BY id_estado_usuario;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                mi_estado_usuario = new estado_usuario();
                mi_estado_usuario.setId_estado_usuario(rs.getInt(1));
                mi_estado_usuario.setDescrip_estado(rs.getString(2));
                mi_listado_estado_usuario.add(mi_estado_usuario);
            }
            return mi_listado_estado_usuario;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoCategoriaMateriaPrima_cat_mat_primDAO\n " + ex.getMessage());
        }
        return mi_listado_estado_usuario;
    }

        //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarEstadoUsuario (estado_usuario EstadoUsuario) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from estado_usuario where id_estado_usuario = ? and descrip_estado = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, EstadoUsuario.getId_estado_usuario());
            sentencia.setString(2, EstadoUsuario.getDescrip_estado());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en EliminarEstadoUsuario_estado_usuarioDAO" + ex.getMessage());
        }
        return miRespuesta;
    }

}
