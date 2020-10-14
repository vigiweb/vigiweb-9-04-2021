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
import modelo.inventario;

//////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////
public class inventarioDAO {

    public String AdicionarInventario(inventario Inventario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "Insert into inventario (in_entradas, in_salidas, in_saldo)" + "values (?, ?, ?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setDouble(1, Inventario.getIn_entradas());
            sentencia.setDouble(2, Inventario.getIn_salidas());
            sentencia.setDouble(3, Inventario.getIn_saldo());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarInventario_inventarioDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }

//////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////
    public String ActualizarInventario(inventario Inventario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update inventario set id_inventario=?, in_entradas=?, in_salidas=?, in_saldo=? where id_inventario=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, Inventario.getId_inventario());
            sentencia.setDouble(2, Inventario.getIn_entradas());
            sentencia.setDouble(3, Inventario.getIn_salidas());
            sentencia.setDouble(4, Inventario.getIn_saldo());
            sentencia.setInt(5, Inventario.getId_inventario());

            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ha ocurrido un error en ActualizarInventario_inventarioDAO\n " + ex.getMessage());
        }
        return miRespuesta;
    }

//////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////
    public inventario ConsultarInventario(int id_inventario) {
        inventario mi_inventario = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "Select id_inventario, in_entradas, in_salidas, in_saldo from inventario where id_inventario = " + id_inventario;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_inventario = new inventario();
                mi_inventario.setId_inventario(rs.getInt(1));
                mi_inventario.setIn_entradas(rs.getDouble(2));
                mi_inventario.setIn_salidas(rs.getDouble(3));
                mi_inventario.setIn_saldo(rs.getDouble(4));

            }

            return mi_inventario;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error en ConsultarInventario_inventarioDAO\n " + ex.getMessage());
        }
        return mi_inventario;
    }

    //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////
    public ArrayList<inventario> ConsultarListadoInventario(int id_inventario, int in_entradas, int in_salidas) {

        ArrayList<inventario> mi_lista_inventario = new ArrayList<inventario>();
        inventario mi_inventario;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + id_inventario);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_inventario,in_entradas,in_salidas,in_saldo "
                    + " from inventario"
                    + " where id_inventario like '%" + id_inventario + "%'"
                    + "  or (in_entradas) like ('%" + in_entradas + "%')"
                    + "  or (in_salidas) like ('%" + in_salidas + "%') ORDER BY id_inventario;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_inventario = new inventario();
                mi_inventario.setId_inventario(rs.getInt(1));
                mi_inventario.setIn_entradas(rs.getDouble(2));
                mi_inventario.setIn_salidas(rs.getDouble(3));
                mi_inventario.setIn_saldo(rs.getDouble(4));

                mi_lista_inventario.add(mi_inventario);

            }

            return mi_lista_inventario;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado en inventario" + "\n" + ex.getMessage());
            return mi_lista_inventario;

        }

    }

    //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////
    public String EliminarInventario(inventario Inventario) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from inventario where id_inventario = ?  ";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, Inventario.getId_inventario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en INVENTARIO_DAO.EliminarInventario" + ex.getMessage());
        }
        return miRespuesta;

    }

}
