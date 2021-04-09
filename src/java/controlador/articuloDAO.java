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
import modelo.articulo;
import java.util.ArrayList;


    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////


public class articuloDAO {

    public String AdicionarArticulo(articulo Articulo) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "Insert into articulo (nombre_articulo, referencia_articulo, precio_articulo, cantidad_articulo, iva_articulo, descripcion_articulo, estado_articulo_id_estado_articulo, proveedor_id_proveedor)" + "values (?,?,?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Articulo.getNombre_articulo());
            sentencia.setString(2, Articulo.getReferencia_articulo());
            sentencia.setDouble(3, Articulo.getPrecio_articulo());
            sentencia.setInt(4, Articulo.getCantidad_articulo());
            sentencia.setDouble(5, Articulo.getIva_articulo());
            sentencia.setString(6, Articulo.getDescripcion_articulo());
            sentencia.setInt(7, Articulo.getEstado_articulo_id_estado_articulo());
            sentencia.setInt(8, Articulo.getProveedor_id_proveedor());



            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarArticulo_articuloDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }

    
//////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////

    public String ActualizarArticulo(articulo Articulo) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update articulo set nombre_articulo=?, referencia_articulo=?, precio_articulo=?, cantidad_articulo=?, iva_articulo=?, descripcion_articulo=?, estado_articulo_id_estado_articulo = ?, proveedor_id_proveedor=? where referencia_articulo=?";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setString(1, Articulo.getNombre_articulo());
            sentencia.setString(2, Articulo.getReferencia_articulo());
            sentencia.setDouble(3, Articulo.getPrecio_articulo());
            sentencia.setInt(4, Articulo.getCantidad_articulo());
            sentencia.setDouble(5, Articulo.getIva_articulo());
            sentencia.setString(6, Articulo.getDescripcion_articulo());
            sentencia.setInt(7, Articulo.getEstado_articulo_id_estado_articulo());
            sentencia.setInt(8, Articulo.getProveedor_id_proveedor());

            sentencia.setString(10, Articulo.getReferencia_articulo());

            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarArticulo_articuloDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
    
    
//////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////

   public articulo ConsultarArticulo (String referencia_articulo) {
    articulo miarticulo = null;
    
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = "Select nombre_articulo, referencia_articulo, precio_articulo, cantidad_articulo, iva_articulo, descripcion_articulo, estado_articulo_id_estado_articulo, proveedor_id_proveedor from articulo where referencia_articulo = " + referencia_articulo;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()){
            
                miarticulo = new articulo();
                miarticulo.setNombre_articulo(rs.getString(1));
                miarticulo.setReferencia_articulo(rs.getString(2));
                miarticulo.setPrecio_articulo(rs.getDouble(3));
                miarticulo.setCantidad_articulo(rs.getInt(4));
                miarticulo.setIva_articulo(rs.getDouble(5));
                miarticulo.setDescripcion_articulo(rs.getString(6));
                miarticulo.setEstado_articulo_id_estado_articulo(rs.getInt(7));
                miarticulo.setProveedor_id_proveedor(rs.getInt(8));

                
            }


         return miarticulo;            
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarArticulo_articuloDAO\n " + ex.getMessage());
        }
        return miarticulo;
    } 

   
   //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////

    public ArrayList<articulo> ConsultarListadoArticulos(String nombre_articulo, String referencia_articulo) {
        ArrayList<articulo>mi_listado_articulos = new ArrayList<articulo>();
        articulo mi_articulo;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        System.out.println("Buscando parametro: " + referencia_articulo);
        
        try{
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = " select nombre_articulo,referencia_articulo,precio_articulo,cantidad_articulo,iva_articulo,descripcion_articulo,estado_articulo_id_estado_articulo,proveedor_id_proveedor "
                    + " from articulo "
                    + " where referencia_articulo like '%" + referencia_articulo + "%' "
                    + "  or (nombre_articulo) like ('%" + nombre_articulo + "%') ORDER BY referencia_articulo;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                mi_articulo = new articulo();
                mi_articulo.setNombre_articulo(rs.getString(1));
                mi_articulo.setReferencia_articulo(rs.getString(2));
                mi_articulo.setPrecio_articulo(rs.getDouble(3));
                mi_articulo.setCantidad_articulo(rs.getInt(4));
                mi_articulo.setIva_articulo(rs.getDouble(5));
                mi_articulo.setDescripcion_articulo(rs.getString(6));
                mi_articulo.setEstado_articulo_id_estado_articulo(rs.getInt(7));
                mi_articulo.setProveedor_id_proveedor(rs.getInt(8));

                mi_listado_articulos.add(mi_articulo);
            }
            return mi_listado_articulos;
        }catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoArticulos_articuloDAO\n " + ex.getMessage());
        }
        return mi_listado_articulos;
    }
    
    
    //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarArticulo (articulo Articulo ) {
        
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = " delete from articulo where nombre_articulo=? and referencia_articulo=? ";
            sentencia = nuevaCon.prepareStatement(Query);
            
            sentencia.setString(1, Articulo.getNombre_articulo());
            sentencia.setString(2, Articulo.getReferencia_articulo());
            
            sentencia.execute();
            miRespuesta = "";
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en EliminarArticulo_articuloDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }
}
