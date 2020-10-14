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
import modelo.ciudad;

//////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////
public class ciudadDAO {

    public String AdicionarCiudad(ciudad Ciudad) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "Insert ciudad (descrip_ciudad)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Ciudad.getDescrip_ciudad());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en AdicionarArticulo_articuloDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }

    //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////
    public String ActualizarCiudad(ciudad Ciudad) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update ciudad set id_ciudad=?, descrip_ciudad=? where id_ciudad=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Ciudad.getId_ciudad());
            sentencia.setString(2, Ciudad.getDescrip_ciudad());
            sentencia.setString(3, Ciudad.getId_ciudad());

            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarArticulo_articuloDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }

    //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////
    public ciudad ConsultarUsuario(int id_ciudad) {
        ciudad mi_ciudad = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_ciudad, descrip_ciudad from ciudad where id_ciudad =  " + id_ciudad;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_ciudad = new ciudad();
                mi_ciudad.setId_ciudad(rs.getString(1));
                mi_ciudad.setDescrip_ciudad(rs.getString(2));

            }

            return mi_ciudad;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarUsuario_ciudadDAO\n " + ex.getMessage());
        }
        return mi_ciudad;
    }

    //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////
    public ArrayList<ciudad> ConsultarListadoCiudad(String id_ciudad, String descrip_ciudad) {
        ArrayList<ciudad> mi_listado_ciudad = new ArrayList<ciudad>();
        ciudad mi_ciudad;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro: " + id_ciudad);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select id_ciudad,descrip_ciudad "
                    + " from ciudad "
                    + " where id_ciudad like '%" + id_ciudad + "%' "
                    + "  or (descrip_ciudad) like ('%" + descrip_ciudad + "%') ORDER BY id_ciudad;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_ciudad = new ciudad();
                mi_ciudad.setId_ciudad(rs.getString(1));
                mi_ciudad.setDescrip_ciudad(rs.getString(2));
                mi_listado_ciudad.add(mi_ciudad);
            }
            return mi_listado_ciudad;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarListadoCiudad_ciudadDAO\n " + ex.getMessage());
        }
        return mi_listado_ciudad;

    }
    //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

    public String EliminarCiudad(ciudad Ciudad) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = " delete from ciudad where id_ciudad = ? and descrip_ciudad = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Ciudad.getId_ciudad());
            sentencia.setString(2, Ciudad.getDescrip_ciudad());
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en EliminarCiudad_ciudadDAO" + ex.getMessage());
        }
        return miRespuesta;
    }
}
