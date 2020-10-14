/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.factura;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Famil
 */

    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////


public class facturaDAO {

    public String AdicionarFactura(factura Factura) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "Insert into factura (fecha_factura, usuarios_id_usuarios)" + "values (?,?);";

            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Factura.getFecha_factura());
            sentencia.setInt(2, Factura.getUsuarios_id_usuarios());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarDetalle_Produccion_Detalle_ProduccionDAO\n" + ex.getMessage());

        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

    public String ActualizarFactura (factura Factura) { 

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update factura set id_factura=?, fecha_factura=?, usuarios_id_usuarios=?  where id_factura=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, Factura.getId_factura());
            sentencia.setString(2, Factura.getFecha_factura());
            sentencia.setInt(3, Factura.getUsuarios_id_usuarios());
            sentencia.setDouble(4, Factura.getId_factura());
               
            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarFacturasDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////

     public factura ConsultarFactura(int id_factura) {
        factura Factura = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_factura, fecha_factura, usuarios_id_usuarios from factura where id_factura = " + id_factura;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                Factura = new factura();
                
                Factura.setId_factura(rs.getInt(1));
                Factura.setFecha_factura(rs.getString(2));
                Factura.setUsuarios_id_usuarios(rs.getInt(3));
            }
            return Factura;  
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarProducto_producto_dao\n " + ex.getMessage());
        }
        return Factura;
    }
     
        //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////

     public ArrayList<factura> Listarfactura(int id_factura, String fecha_factura, int usuarios_id_usuarios ) {
       ArrayList<factura>lista_factura = new ArrayList<factura>();
        factura mi_factura;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + id_factura);
        try{
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = " select id_factura,fecha_factura,usuarios_id_usuarios"
                    + " from factura "
                    + " where id_factura like '%" + id_factura + "%' "
                    + "  or (fecha_factura) like ('%" + fecha_factura + "%') ORDER BY id_factura;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                mi_factura = new factura();
                
                mi_factura.setId_factura(rs.getInt(1));
                mi_factura.setFecha_factura(rs.getString(2));
                mi_factura.setUsuarios_id_usuarios(rs.getInt(3));

                lista_factura.add(mi_factura);
            }
            return lista_factura;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ListarfacturaDAO\n " + ex.getMessage());
        }
        return lista_factura;
    }

      //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

     public String Eliminarfactura (factura facturas) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from factura where id_factura=? and fecha_factura=? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, facturas.getId_factura());
            sentencia.setString(2, facturas.getFecha_factura());

            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en EliminarfacturaDAO" + ex.getMessage());
        }
        return miRespuesta;
    }
}
