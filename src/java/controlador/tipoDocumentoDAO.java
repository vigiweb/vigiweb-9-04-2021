/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.tipo_documento;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Famil
 */
public class tipoDocumentoDAO {

    public String AdicionarTipoDocumento(tipo_documento TipoDocumento) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "Insert into tipo_documento (descrip)" + "values (?);";

            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, TipoDocumento.getDescrip());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarTipo_Documento_Tipo_DocumentoDAO\n" + ex.getMessage());

        }
        return miRespuesta;
    }

//////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

    public String actualizarTipoDocumento(tipo_documento TipoDocumento) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update tipo_documento set id_tipo_documento = ?, descrip = ? where id_tipo_documento=?";

            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, TipoDocumento.getId_tipo_documento());
            sentencia.setString(2, TipoDocumento.getDescrip());
            sentencia.setInt(3, TipoDocumento.getId_tipo_documento());

            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en actualizarTipoDocumento_tipoDocumentoDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    //////////////////////*METODO CONSULTAR*//////////////////////////////////
    public tipo_documento ConsultarTipoDocumento(int id_tipo_documento) {
        tipo_documento mi_tipo_documento = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_tipo_documento, descrip from tipo_documento where id_tipo_documento =  " + id_tipo_documento;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_tipo_documento = new tipo_documento();
                
                mi_tipo_documento.setId_tipo_documento(rs.getInt(1));
                mi_tipo_documento.setDescrip(rs.getString(2));

            }

            return mi_tipo_documento;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarTipoDocumento_tipoDocumentoDAO\n " + ex.getMessage());
        }

        return mi_tipo_documento;
    }

    ///////////////////////*METODO LISTAR CONSULTA*///////////////////////
    public ArrayList<tipo_documento> ConsultarListadoTipoDocumento (int id_tipo_documento, String descrip) {
        ArrayList<tipo_documento> mi_listado_tipo_documento = new ArrayList<tipo_documento>();
        tipo_documento mi_tipo_documento;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro: " + id_tipo_documento);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select id_tipo_documento,descrip "
                    + " from tipo_documento "
                    + " where id_tipo_documento like '%" + id_tipo_documento + "%' "
                    + "  or (descrip) like ('%" + descrip + "%') ORDER BY id_tipo_documento;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_tipo_documento = new tipo_documento();
                mi_tipo_documento.setId_tipo_documento(rs.getInt(1));
                mi_tipo_documento.setDescrip(rs.getString(2));
                mi_listado_tipo_documento.add(mi_tipo_documento);
            }
            return mi_listado_tipo_documento;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoTipoDocumento_tipoDocumentoDAO\n " + ex.getMessage());
        }
        return mi_listado_tipo_documento;
    }
    
        //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarTipoUsuario(tipo_documento tipoDocumento) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from tipo_documento where id_tipo_documento = ? and descrip = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, tipoDocumento.getId_tipo_documento());
            sentencia.setString(2, tipoDocumento.getDescrip());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarTipoUsuario_tipoUsuarioDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    

}
