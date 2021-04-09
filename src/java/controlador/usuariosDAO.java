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
import modelo.usuarios;
import java.util.ArrayList;

    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////

public class usuariosDAO {
    
    public String AdicionarUsuario (usuarios Usuarios) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "Insert into usuarios (numero_documento, nombre_usuario, contraseña, telefono, direccion, correo, barrio, tipo_usuario_id_tipo_usuario, ciudad_id_ciudad, tipo_genero_id_tipo_genero, estado_usuario_id_estado_usuario, tipo_documento_id_tipo_documento)" + "values (?,?,?,?,?,?,?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Usuarios.getNumero_documento());
            sentencia.setString(2, Usuarios.getNombre_usuario());
            sentencia.setString(3, Usuarios.getContrasena());
            sentencia.setInt(4, Usuarios.getTelefono());
            sentencia.setString(5, Usuarios.getDireccion());
            sentencia.setString(6, Usuarios.getCorreo());
            sentencia.setString(7, Usuarios.getBarrio());
            sentencia.setInt(8, Usuarios.getTipo_usuario_id_tipo_usuario());
            sentencia.setInt(9, Usuarios.getCiudad_id_ciudad());
            sentencia.setInt(10, Usuarios.getTipo_genero_id_tipo_genero());
            sentencia.setInt(11, Usuarios.getEstado_usuario_id_estado_usuario());
            sentencia.setInt(12, Usuarios.getTipo_documento_id_tipo_documento());


            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarUsuario_usuariosDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    


//////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

    
public String AtualizarUsuario (usuarios Usuarios) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update usuarios set numero_documento=?, nombre_usuario=?, contraseña=?, telefono=?, direccion=?, correo=?, barrio=?, estado_usuario_id_estado_usuario=?, tipo_usuario_id_tipo_usuario=?, tipo_documento_id_tipo_documento=?, tipo_genero_id_tipo_genero=?, ciudad_id_ciudad=? where numero_documento=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Usuarios.getNumero_documento());
            sentencia.setString(2, Usuarios.getNombre_usuario());
            sentencia.setString(3, Usuarios.getContrasena());
            sentencia.setInt(4, Usuarios.getTelefono());
            sentencia.setString(5, Usuarios.getDireccion());
            sentencia.setString(6, Usuarios.getCorreo());
            sentencia.setString(7, Usuarios.getBarrio());
            sentencia.setInt(8, Usuarios.getEstado_usuario_id_estado_usuario());
            sentencia.setInt(9, Usuarios.getTipo_usuario_id_tipo_usuario());
            sentencia.setInt(10, Usuarios.getTipo_documento_id_tipo_documento());
            sentencia.setInt(11, Usuarios.getTipo_genero_id_tipo_genero());
            sentencia.setInt(12, Usuarios.getCiudad_id_ciudad());
            sentencia.setString (13, Usuarios.getNumero_documento());


            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AtualizarUsuario_usuariosDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }


//////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////


    public usuarios ConsultarUsuario (String numero_documento) {
    usuarios mi_usuario = null;
    
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = "Select id_usuarios, numero_documento, nombre_usuario, contraseña, telefono, direccion, correo, barrio, tipo_usuario_id_tipo_usuario, ciudad_id_ciudad, tipo_genero_id_tipo_genero, estado_usuario_id_estado_usuario, tipo_documento_id_tipo_documento from usuarios where numero_documento = " + numero_documento;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()){
            
                mi_usuario = new usuarios();
                mi_usuario.setId_usuarios(rs.getInt(1));
                mi_usuario.setNumero_documento(rs.getString(2));
                mi_usuario.setNombre_usuario(rs.getString(3));
                mi_usuario.setContrasena(rs.getString(4));
                mi_usuario.setTelefono (rs.getInt(5));
                mi_usuario.setDireccion(rs.getString(6));
                mi_usuario.setCorreo(rs.getString(7));
                mi_usuario.setBarrio (rs.getString(8));
                mi_usuario.setTipo_usuario_id_tipo_usuario(rs.getInt(9));
                mi_usuario.setCiudad_id_ciudad(rs.getInt(10));
                mi_usuario.setTipo_genero_id_tipo_genero(rs.getInt(11));
                mi_usuario.setEstado_usuario_id_estado_usuario(rs.getInt(12));
                mi_usuario.setTipo_documento_id_tipo_documento(rs.getInt(13));
                
            }
            
         return mi_usuario;            
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarUsuario_usuariosDAO\n " + ex.getMessage());
        }
        return mi_usuario;
    }
    
    
   //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////
 
    public ArrayList<usuarios> ConsultarListadoUusarios(String numero_documento, String nombre_usuario, String correo) {
        ArrayList<usuarios>mi_listado_usuarios = new ArrayList<usuarios>();
        usuarios mi_usuario;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + numero_documento);
        try{
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = " select id_usuarios,numero_documento,nombre_usuario,contraseña,telefono,direccion,correo,barrio,estado_usuario_id_estado_usuario,tipo_usuario_id_tipo_usuario,tipo_documento_id_tipo_documento,tipo_genero_id_tipo_genero,ciudad_id_ciudad "
                    + " from usuarios "
                    + " where numero_documento like '%" + numero_documento + "%' "
                    + "  or (nombre_usuario) like ('%" + nombre_usuario + "%') "
                    + "  or (correo) like ('%" + correo + "%') ORDER BY numero_documento;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                mi_usuario = new usuarios();
                mi_usuario.setId_usuarios(rs.getInt(1));
                mi_usuario.setNumero_documento(rs.getString(2));
                mi_usuario.setNombre_usuario(rs.getString(3));
                mi_usuario.setContrasena(rs.getString(4));
                mi_usuario.setTelefono (rs.getInt(5));
                mi_usuario.setDireccion(rs.getString(6));
                mi_usuario.setCorreo(rs.getString(7));
                mi_usuario.setBarrio (rs.getString(8));
                mi_usuario.setEstado_usuario_id_estado_usuario(rs.getInt(9));
                mi_usuario.setTipo_usuario_id_tipo_usuario(rs.getInt(10));
                mi_usuario.setTipo_documento_id_tipo_documento(rs.getInt(11));
                mi_usuario.setTipo_genero_id_tipo_genero(rs.getInt(12));
                mi_usuario.setCiudad_id_ciudad(rs.getInt(13));
                mi_listado_usuarios.add(mi_usuario);
            }
            return mi_listado_usuarios;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoUusarios_usuariosDAO\n " + ex.getMessage());
        }
        return mi_listado_usuarios;
    }
 
    
 //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarUsuarios(usuarios Usuarios) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from usuarios where id_usuarios = ? and numero_documento = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, Usuarios.getId_usuarios());
            sentencia.setString(2, Usuarios.getNumero_documento());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarUsuarios_usuariosDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
  }


