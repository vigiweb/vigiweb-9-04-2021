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
import modelo.tipo_documento_contable;

/**
 *
 * @author Famil
 */

    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////

public class tipoDocumentoContableDAO {
    
    public String adicionarTipodocumentoContable(tipo_documento_contable  TipoDocumentoContable){
   
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try { 
            String Query = "insert into tipo_documento_contable (codigo, descrip)" + "values(?,?);";
            sentencia=nuevaCon.prepareStatement(Query);
             
            sentencia.setString(1, TipoDocumentoContable.getCodigo());
            sentencia.setString(2, TipoDocumentoContable.getDescrip());
            
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en adicionarTipo_documento_contable_Tipo_documentoDAO/n" + ex.getMessage());
        }
            return miRespuesta;
        }
    
//////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

    public String actualizarTipoDocumentoContable(tipo_documento_contable  TipoDocumentoContable) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update tipo_documento_contable set id_tipo_documento = ?, codigo = ?, descrip = ? where id_tipo_documento =?";

            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, TipoDocumentoContable.getId_tipo_documento());
            sentencia.setString(2, TipoDocumentoContable.getCodigo());
            sentencia.setString(3, TipoDocumentoContable.getDescrip());
            sentencia.setInt(4, TipoDocumentoContable.getId_tipo_documento());


            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en actualizarTipoDocumentoContable_tipoDocumentoContableDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }

   

    //////////////////////*METODO CONSULTAR*//////////////////////////////////
    public tipo_documento_contable ConsultarTipoDocumentoContable(int id_tipo_documento) {
        tipo_documento_contable mi_tipo_documento_contable = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_tipo_documento, descrip, codigo from tipo_documento_contable where id_tipo_documento =  " + id_tipo_documento;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_tipo_documento_contable = new tipo_documento_contable();
                
                mi_tipo_documento_contable.setId_tipo_documento(rs.getInt(1));
                mi_tipo_documento_contable.setDescrip(rs.getString(2));
                mi_tipo_documento_contable.setCodigo(rs.getString(3));


            }

            return mi_tipo_documento_contable;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarTipoDocumentoContable_tipoDocumentoDAO\n " + ex.getMessage());
        }

        return mi_tipo_documento_contable;
    }

    ///////////////////////*METODO LISTAR CONSULTA*///////////////////////
    public ArrayList<tipo_documento_contable> ConsultarListadoTipoDocumentoContable (int id_tipo_documento, String codigo) {
        ArrayList<tipo_documento_contable> mi_listado_tipo_documento_contable = new ArrayList<tipo_documento_contable>();
        tipo_documento_contable mi_tipo_documento_contable;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro: " + id_tipo_documento);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select id_tipo_documento,descrip,codigo "
                    + " from tipo_documento_contable "
                    + " where id_tipo_documento like '%" + id_tipo_documento + "%' "
                    + "  or (codigo) like ('%" + codigo + "%') ORDER BY id_tipo_documento;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_tipo_documento_contable = new tipo_documento_contable();
                mi_tipo_documento_contable.setId_tipo_documento(rs.getInt(1));
                mi_tipo_documento_contable.setDescrip(rs.getString(2));
                mi_tipo_documento_contable.setCodigo(rs.getString(3));

                mi_listado_tipo_documento_contable.add(mi_tipo_documento_contable);
            }
            return mi_listado_tipo_documento_contable;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoTipoDocumentoContable_tipoDocumentoDAO\n " + ex.getMessage());
        }
        return mi_listado_tipo_documento_contable;
    }
    
        //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarTipoDocumentoContable (tipo_documento_contable tipoDocumentoContable) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from tipo_usuario where id_tipo_documento = ? and codigo = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, tipoDocumentoContable.getId_tipo_documento());
            sentencia.setString(2, tipoDocumentoContable.getCodigo());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarTipoDocumentoContable_tipoDocumentoContableDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
}
