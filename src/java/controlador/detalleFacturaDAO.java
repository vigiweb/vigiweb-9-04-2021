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
import modelo.detalle_factura;
/**
 *
 * @author Famil
 */
public class detalleFacturaDAO {
    
    public String AdicionarDetalleFactura(detalle_factura DetalleFactura) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "Insert into detalle_factura (cantidad, precio_articulo, iva_articulo, total_articulo, total_iva, descuento, factura_id_factura, articulo_id_articulo)" + "values (?,?,?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, DetalleFactura.getCantidad());
            sentencia.setDouble(2, DetalleFactura.getPrecio_articulo());
            sentencia.setDouble(3, DetalleFactura.getIva_articulo());
            sentencia.setDouble(4, DetalleFactura.getTotal_articulo());
            sentencia.setDouble(5, DetalleFactura.getTotal_iva());
            sentencia.setDouble(6, DetalleFactura.getDescuento());
            sentencia.setInt(7, DetalleFactura.getFactura_id_factura());
            sentencia.setInt(8, DetalleFactura.getArticulo_id_articulo());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarDetalleFactura_detalleFacturaDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }

    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////
    public String actualizardetallefactura(detalle_factura DetalleFactura) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update detalle_factura set id_detalle_factura = ?, cantidad = ?, precio_articulo = ?, iva_articulo=?, total_articulo=?, total_iva=?, descuento=?, factura_id_factura=?, articulo_id_articulo=? where id_detalle_factura = ?";

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, DetalleFactura.getId_detalle_factura());
            sentencia.setInt(2, DetalleFactura.getCantidad());
            sentencia.setDouble(3, DetalleFactura.getPrecio_articulo());
            sentencia.setDouble(4, DetalleFactura.getIva_articulo());
            sentencia.setDouble(5, DetalleFactura.getTotal_articulo());
            sentencia.setDouble(6, DetalleFactura.getTotal_iva());
            sentencia.setDouble(7, DetalleFactura.getDescuento());
            sentencia.setInt(8, DetalleFactura.getFactura_id_factura());
            sentencia.setInt(9, DetalleFactura.getArticulo_id_articulo());
            sentencia.setInt(10, DetalleFactura.getId_detalle_factura());


            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error al actualizar detalle_factura\n" + ex.getMessage());

        }
        return miRespuesta;
    }

    //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////
    public detalle_factura ConsultarDetalleFactura(int id_detalle_factura) {
        detalle_factura mi_detalle_factura = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_detalle_factura, cantidad, precio_articulo, iva_articulo, total_articulo, total_iva, descuento, factura_id_factura, articulo_id_articulo from detalle_factura where id_detalle_factura =  " + id_detalle_factura;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                mi_detalle_factura = new detalle_factura();
                mi_detalle_factura.setId_detalle_factura(rs.getInt(1));
                mi_detalle_factura.setCantidad(rs.getInt(2));
                mi_detalle_factura.setPrecio_articulo(rs.getDouble(3));
                mi_detalle_factura.setIva_articulo(rs.getDouble(4));
                mi_detalle_factura.setTotal_articulo(rs.getDouble(5));
                mi_detalle_factura.setTotal_iva(rs.getDouble(6));
                mi_detalle_factura.setDescuento(rs.getDouble(7));
                mi_detalle_factura.setFactura_id_factura(rs.getInt(8));
                mi_detalle_factura.setArticulo_id_articulo(rs.getInt(9));

            }

            return mi_detalle_factura;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarDetalleFactura_detalleFacturaDAO\n " + ex.getMessage());
        }

        return mi_detalle_factura;
    }

    //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////
    public ArrayList<detalle_factura> ConsultarListadoDetalleFactura(int id_detalle_factura, int cantidad) {

        ArrayList<detalle_factura> mi_lista_detalle_factura = new ArrayList<detalle_factura>();
        detalle_factura mi_detalle_factura;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro: " + id_detalle_factura);

        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query = " select id_detalle_factura,cantidad,precio_articulo,iva_articulo, total_articulo,total_iva,descuento,factura_id_factura,articulo_id_articulo"
                    + " from detalle_factura "
                    + " where id_detalle_factura like '%" + id_detalle_factura + "%' "
                    + " or (cantidad) like ('%" + cantidad + "%') ORDER BY id_detalle_factura; ";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                mi_detalle_factura = new detalle_factura();

                mi_detalle_factura.setId_detalle_factura(rs.getInt(1));
                mi_detalle_factura.setCantidad(rs.getInt(2));
                mi_detalle_factura.setPrecio_articulo(rs.getInt(3));
                mi_detalle_factura.setIva_articulo(rs.getInt(4));
                mi_detalle_factura.setTotal_articulo(rs.getInt(5));
                mi_detalle_factura.setTotal_iva(rs.getInt(6));
                mi_detalle_factura.setDescuento(rs.getInt(7));
                mi_detalle_factura.setFactura_id_factura(rs.getInt(8));
                mi_detalle_factura.setArticulo_id_articulo(rs.getInt(9));

                mi_lista_detalle_factura.add(mi_detalle_factura);

            }
            return mi_lista_detalle_factura;

        } catch (Exception ex) {
            System.out.println("Error en la consulta de detalle_movimiento " + ex.getMessage());
        }
        return mi_lista_detalle_factura;
    }
    
        //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarDetalleFactura (detalle_factura detalleFactura) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from detalle_factura where id_detalle_factura = ? and cantidad = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setInt(1, detalleFactura.getId_detalle_factura());
            sentencia.setInt(2, detalleFactura.getCantidad());
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarDetalleFactura_detalleFacturaDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
    
}
