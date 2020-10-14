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
import modelo.detalle_movimiento;
/**
 *
 * @author Famil
 */
public class detalleMovimientoDAO {
    
    public String AdicionarDetalleMovimiento(detalle_movimiento DetalleMovimiento) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "Insert into detalle_movimiento (cantidad, precio_articulo, iva, total_articulo, articulo_id_articulo, movimientos_id_movimientos)" + "values (?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, DetalleMovimiento.getCantidad());
            sentencia.setDouble(2, DetalleMovimiento.getPrecio_articulo());
            sentencia.setDouble(3, DetalleMovimiento.getIva());
            sentencia.setDouble(4, DetalleMovimiento.getTotal_articulo());
            sentencia.setInt(5, DetalleMovimiento.getArticulo_id_articulo());
            sentencia.setInt(6, DetalleMovimiento.getMovimientos_id_movimientos());


            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarDetalleMovimiento_detalleMovimientoDAO\n " + ex.getMessage());

        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////


    public String actualizardetallemovimiento(detalle_movimiento DetalleMovimiento) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update detalle_movimiento set id_detalle_movimiento = ?, cantidad = ?, precio_articulo = ?, iva = ?, total_articulo = ?, articulo_id_articulo = ?, movimientos_id_movimientos=? where id_detalle_movimiento = ?";

            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, DetalleMovimiento.getId_detalle_movimiento());
            sentencia.setInt(2, DetalleMovimiento.getCantidad());
            sentencia.setDouble(3, DetalleMovimiento.getPrecio_articulo());
            sentencia.setDouble(4, DetalleMovimiento.getIva());
            sentencia.setDouble(5, DetalleMovimiento.getTotal_articulo());
            sentencia.setInt(6, DetalleMovimiento.getArticulo_id_articulo());
            sentencia.setInt(7, DetalleMovimiento.getMovimientos_id_movimientos());
            sentencia.setInt(8, DetalleMovimiento.getId_detalle_movimiento());


            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en actualizardetallemovimiento_detalleMovimientoDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
    //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////


    public detalle_movimiento ConsultarDetalleMovimiento(int id_detalle_movimiento) {
        detalle_movimiento mi_detalle_movimiento = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_detalle_movimiento, cantidad, precio_articulo, iva, total_articulo, articulo_id_articulo, movimientos_id_movimientos from detalle_movimiento where id_detalle_movimiento =  " + id_detalle_movimiento;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_detalle_movimiento = new detalle_movimiento();
                mi_detalle_movimiento.setId_detalle_movimiento(rs.getInt(1));
                mi_detalle_movimiento.setCantidad(rs.getInt(2));
                mi_detalle_movimiento.setPrecio_articulo(rs.getDouble(3));
                mi_detalle_movimiento.setIva(rs.getDouble(4));
                mi_detalle_movimiento.setTotal_articulo(rs.getDouble(5));
                mi_detalle_movimiento.setArticulo_id_articulo(rs.getInt(6));
                mi_detalle_movimiento.setMovimientos_id_movimientos(rs.getInt(7));


            }

            return mi_detalle_movimiento;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarDetalleMovimiento_detalleMovimientoDAO\n " + ex.getMessage());
        }
        return mi_detalle_movimiento;
    }
    
       //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////


    public ArrayList<detalle_movimiento> ConsultarListadoDetalleMovimiento(int id_detalle_movimiento, int cantidad, double precio_articulo) {

        ArrayList<detalle_movimiento> mi_lista_detalle_movimiento = new ArrayList<detalle_movimiento>();
        detalle_movimiento mi_detalle_movimiento;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + id_detalle_movimiento);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = " select id_detalle_movimiento,cantidad,precio_articulo,iva,total_articulo,articulo_id_articulo,movimientos_id_movimientos "
                    + " from detalle_movimiento "
                    + " where id_detalle_movimiento like '%" + id_detalle_movimiento + "%' "
                    + "  or (cantidad) like ('%" + cantidad + "%')"
                    + "  or (precio_articulo) like ('%" + precio_articulo + "%') ORDER BY id_detalle_movimiento;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_detalle_movimiento = new detalle_movimiento();
                mi_detalle_movimiento.setId_detalle_movimiento(rs.getInt(1));
                mi_detalle_movimiento.setCantidad(rs.getInt(2));
                mi_detalle_movimiento.setPrecio_articulo(rs.getDouble(3));
                mi_detalle_movimiento.setIva(rs.getDouble(4));
                mi_detalle_movimiento.setTotal_articulo(rs.getDouble(5));
                mi_detalle_movimiento.setArticulo_id_articulo(rs.getInt(6));
                mi_detalle_movimiento.setMovimientos_id_movimientos(rs.getInt(7));

                mi_lista_detalle_movimiento.add(mi_detalle_movimiento);

            }

            return mi_lista_detalle_movimiento;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado en ConsultarListadoDetalleMovimiento" + "\n" + ex.getMessage());
            return mi_lista_detalle_movimiento;

        }

    }
    
     //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////


    public String EliminarDetalleMovimiento(detalle_movimiento DetalleMovimiento) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = " delete from detalle_movimiento where id_detalle_movimiento = ? and precio_articulo = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, DetalleMovimiento.getCantidad());
            sentencia.setDouble(2, DetalleMovimiento.getPrecio_articulo());
            sentencia.setDouble(3, DetalleMovimiento.getIva());
            sentencia.setDouble(4, DetalleMovimiento.getTotal_articulo());
            sentencia.setInt(5, DetalleMovimiento.getArticulo_id_articulo());
            sentencia.setInt(6, DetalleMovimiento.getMovimientos_id_movimientos());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en EliminarCiudad_ciudadDAO" + ex.getMessage());
        }
        return miRespuesta;
    }

    
}
