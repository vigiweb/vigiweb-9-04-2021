/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.Statement;
import modelo.tipo_mov;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Famil
 */
    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////


public class tipoMovDAO {
    
    public String AdicionarMovimiento(tipo_mov TipoMov) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "Insert into tipo_mov (m_descrip)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, TipoMov.getM_descrip());
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarMovimiento_tipoMovDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

    
     public String ActualizarMovimiento (tipo_mov TipoMov) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update tipo_mov set id_tipo_mov=?, m_descrip=? where id_tipo_mov=?";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, TipoMov.getId_tipo_mov());
            sentencia.setString(2, TipoMov.getM_descrip());
            sentencia.setInt(3, TipoMov.getId_tipo_mov());

            sentencia.executeUpdate();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarMovimiento_tipoMovDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
     
     //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////

     
     public tipo_mov Consultartipomov (int id_tipo_mov) {
    tipo_mov mi_tipo_mov = null;
    
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = "Select id_tipo_mov, m_descrip from tipo_mov where id_tipo_mov = " + id_tipo_mov;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()){
            
                mi_tipo_mov = new tipo_mov();
                mi_tipo_mov.setId_tipo_mov(rs.getInt(1));
                mi_tipo_mov.setM_descrip(rs.getString(2));
                
            }


         return mi_tipo_mov;            
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en Consultartipomov_tipoMovDAO\n " + ex.getMessage());
        }
        return mi_tipo_mov;
   }
     
      //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////

    
     public ArrayList<tipo_mov> ConsultarListadoTipoMov(int id_tipo_mov, String m_descrip) {
        ArrayList<tipo_mov> mi_listado_tipo_mov = new ArrayList<tipo_mov>();
        tipo_mov mi_tipo_mov;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + id_tipo_mov);
        try{
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = " select id_tipo_mov,m_descrip "
                    + " from tipo_mov "
                    + " where id_tipo_mov like '%" + id_tipo_mov + "%' "
                    + "  or (m_descrip) like ('%" + m_descrip + "%') ORDER BY id_tipo_mov;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                mi_tipo_mov = new tipo_mov();
                mi_tipo_mov.setId_tipo_mov(rs.getInt(1));
                mi_tipo_mov.setM_descrip(rs.getString(2));
                mi_listado_tipo_mov.add(mi_tipo_mov);
                
                
            }
            return mi_listado_tipo_mov;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoTipoMov_tipoMovDAO\n " + ex.getMessage());
        }
        return mi_listado_tipo_mov;
    }
     
     //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarTipoMov(tipo_mov TipoMov) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from tipo_mov where id_tipo_mov = ? and m_descrip = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, TipoMov.getId_tipo_mov());
            sentencia.setString(2, TipoMov.getM_descrip());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarTipoMov_tipoMovDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
}


    
    
      