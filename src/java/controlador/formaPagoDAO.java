/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.forma_pago;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Famil
 */

//////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////
public class formaPagoDAO {

    public String adicionarFormapago(forma_pago FormaPago) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into forma_pago (tipo_pago, referencia_pago)" + "values(?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, FormaPago.getTipo_pago());
            sentencia.setInt(2, FormaPago.getReferencia_Pago());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("ha ocurrido un error en adicionarforma_pago_FormapagoDAO/n" + ex.getMessage());
        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

    
    public String Actualizarforma_pago(forma_pago forma_pagos) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update forma_pago set id_forma_pago=?, tipo_pago=?, referencia_Pago=? where id_forma_pago=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, forma_pagos.getId_forma_pago());
            sentencia.setString(2, forma_pagos.getTipo_pago());
            sentencia.setInt(3, forma_pagos.getReferencia_Pago());
            sentencia.setInt(4, forma_pagos.getId_forma_pago());

            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en Actualizarforma_pagoDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////

     public forma_pago Consultarforma_pago(int id_forma_pago) {
        forma_pago forma_pagos = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_forma_pago, tipo_pago, referencia_Pago from forma_pago where id_forma_pago = " + id_forma_pago;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                forma_pagos = new forma_pago();
                
                forma_pagos.setId_forma_pago(rs.getInt(1));
                forma_pagos.setTipo_pago(rs.getString(2));
                forma_pagos.setReferencia_Pago(rs.getInt(3));
            }
            return forma_pagos;  
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en Consultarforma_pagosDAO\n " + ex.getMessage());
        }
        return forma_pagos;
    }
     
        //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////

     
     public ArrayList<forma_pago> Listarforma_pago(int id_forma_pago, String tipo_pago, int referencia_Pago ) {
        ArrayList<forma_pago>mi_lista_forma_pago = new ArrayList<forma_pago>();
        forma_pago forma_pagos ;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + id_forma_pago);
        try{
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = " select id_forma_pago,tipo_pago,referencia_Pago"
                    + " from forma_pago"
                    + " where id_forma_pago like '%" + id_forma_pago + "%' "
                    + "  or (tipo_pago) like ('%" + tipo_pago + "%') ORDER BY id_forma_pago;";
            
            ResultSet rs = sentencia.executeQuery(Query);
            
            while (rs.next()) {
                
                forma_pagos = new forma_pago();
                
                forma_pagos.setId_forma_pago(rs.getInt(1));
                forma_pagos.setTipo_pago(rs.getString(2));
                forma_pagos.setReferencia_Pago(rs.getInt(3));

                mi_lista_forma_pago.add(forma_pagos);
            }
            return mi_lista_forma_pago;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en Listarforma_pagosDAO\n " + ex.getMessage());
        }
        return mi_lista_forma_pago;
    }
     
      //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

      public String Eliminarforma_pago(forma_pago forma_pagos) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from forma_pago where id_forma_pago=? and tipo_pago=? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, forma_pagos.getId_forma_pago());
            sentencia.setString(2, forma_pagos.getTipo_pago());

            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en Eliminarforma_pagoDAO" + ex.getMessage());
        }
        return miRespuesta;
    }
}
