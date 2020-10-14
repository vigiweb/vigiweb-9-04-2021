/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.movimientos;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Famil
 */
public class movimientosDAO {
    
    
        //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////

    
    public String adicionarMovimientos(movimientos Movimientos) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into movimientos (fecha, cantidad, precio_total, numero_documento, forma_pago_id_forma_pago, articulo_id_articulo, tipo_mov_id_tipo_mov, tipo_documento_contable_id_tipo_documento)" + "values(?,?,?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Movimientos.getFecha());
            sentencia.setInt(2, Movimientos.getCantidad());
            sentencia.setDouble(3, Movimientos.getPrecio_total());
            sentencia.setInt(4, Movimientos.getNumero_documento());
            sentencia.setInt(5, Movimientos.getForma_pago_id_forma_pago());
            sentencia.setInt(6, Movimientos.getArticulo_id_articulo());
            sentencia.setInt (7, Movimientos.getTipo_mov_id_tipo_mov());
            sentencia.setInt (8, Movimientos.getTipo_documento_contable_id_tipo_documento());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("ha ocurrido un error en adicionarMovimientos_MovimientosDAO/n" + ex.getMessage());
        }
        return miRespuesta;
    }
    
    
    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////
    

   public String ActualizarMovimientos(movimientos Movimientos) {
       

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update movimientos set id_movimientos=?, fecha=?, cantidad=?, precio_total=?, numero_documento=?, forma_pago_id_forma_pago=?, articulo_id_articulo=?, tipo_mov_id_tipo_mov =?, tipo_documento_contable_id_tipo_documento=? where id_movimientos=?";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt (1, Movimientos.getId_movimientos());
            sentencia.setString(2, Movimientos.getFecha());
            sentencia.setInt(3, Movimientos.getCantidad());
            sentencia.setDouble(4, Movimientos.getPrecio_total());
            sentencia.setInt(5, Movimientos.getNumero_documento());
            sentencia.setInt(6, Movimientos.getForma_pago_id_forma_pago());
            sentencia.setInt(7, Movimientos.getArticulo_id_articulo());
            sentencia.setInt (8, Movimientos.getTipo_mov_id_tipo_mov());
            sentencia.setInt (9, Movimientos.getTipo_documento_contable_id_tipo_documento());
            sentencia.setInt (10, Movimientos.getId_movimientos());
            
            sentencia.executeUpdate();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarMovimientos_movimientosDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    } 
    
   //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////

   
   public  movimientos ConsultarMovimientos (int id_movimientos) {
     movimientos  mi_movimientos = null;
    
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = "Select id_movimientos, fecha, cantidad, precio_total, numero_documento, forma_pago_id_forma_pago, articulo_id_articulo, tipo_mov_id_tipo_mov, tipo_documento_contable_id_tipo_documento from movimientos where id_movimientos = " + id_movimientos;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()){
            
                 mi_movimientos = new  movimientos();
                 mi_movimientos.setId_movimientos(rs.getInt(1));
                 mi_movimientos.setFecha(rs.getString(2));
                 mi_movimientos.setCantidad(rs.getInt(3));
                 mi_movimientos.setPrecio_total(rs.getDouble(4));
                 mi_movimientos.setNumero_documento(rs.getInt(5));
                 mi_movimientos.setForma_pago_id_forma_pago(rs.getInt(6));
                 mi_movimientos.setArticulo_id_articulo(rs.getInt(7));
                 mi_movimientos.setTipo_mov_id_tipo_mov(rs.getInt(8));
                 mi_movimientos.setTipo_documento_contable_id_tipo_documento(rs.getInt(9));
                
            }


         return  mi_movimientos;            
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarOrdenCompta_ordenCompraDAO\n " + ex.getMessage());
        }
        return  mi_movimientos;
   }
   
      //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////

   public ArrayList<movimientos> ConsultarListadoMovimientos(int id_movimientos, String fecha) {
        ArrayList<movimientos>mi_listado_movimientos = new ArrayList<movimientos>();
        movimientos mi_movimientos;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + id_movimientos);
        try{
            Statement sentencia = nuevaCon.createStatement();
                       
            String Query = " select id_movimientos,fecha,cantidad,precio_total,numero_documento,forma_pago_id_forma_pago,articulo_id_articulo,tipo_mov_id_tipo_mov,tipo_documento_contable_id_tipo_documento "
                    + " from movimientos "
                    + " where id_movimientos like '%" + id_movimientos + "%' "
                    + "  or (fecha) like ('%" + fecha + "%') ORDER BY id_movimientos;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                 mi_movimientos = new  movimientos();
                 mi_movimientos.setId_movimientos(rs.getInt(1));
                 mi_movimientos.setFecha(rs.getString(2));
                 mi_movimientos.setCantidad(rs.getInt(3));
                 mi_movimientos.setPrecio_total(rs.getDouble(4));
                 mi_movimientos.setNumero_documento(rs.getInt(5));
                 mi_movimientos.setForma_pago_id_forma_pago(rs.getInt(6));
                 mi_movimientos.setArticulo_id_articulo(rs.getInt(7));
                 mi_movimientos.setTipo_mov_id_tipo_mov(rs.getInt(8));
                 mi_movimientos.setTipo_documento_contable_id_tipo_documento(rs.getInt(9));
                 
                 mi_listado_movimientos.add(mi_movimientos);
            }
            return mi_listado_movimientos;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoMovimientos_movimientosDAO\n " + ex.getMessage());
        }
        return mi_listado_movimientos;
    }
   
        //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarMovimientos (movimientos Movimientos) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from tipo_usuario where id_movimientos = ? and fecha = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, Movimientos.getId_movimientos());
            sentencia.setString(2, Movimientos.getFecha());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarMovimientos_movimientosDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
   
}
   
   

