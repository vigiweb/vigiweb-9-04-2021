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
import modelo.estado_articulo;

/**
 *
 * @author Famil
 */

    //////////////////////////////*MÉTODO ADICIONAR*//////////////////////////////////////

public class estadoArticuloDAO {


        public String AdicionarEstadoArticulo(estado_articulo estadoArticulo) {

            String miRespuesta;
            conexion miConexion = new conexion();
            Connection nuevaCon;
            nuevaCon = miConexion.getConn();

            PreparedStatement sentencia;
            try {
                String Query = "Insert estado_articulo (descrip_estado)" + "values (?);";
                sentencia = nuevaCon.prepareStatement(Query);
                sentencia.setString(1, estadoArticulo.getDescrip_estado());
                sentencia.execute();
                miRespuesta = "";

            } catch (Exception ex) {
                miRespuesta = ex.getMessage();
                System.out.println("Ha ocurrido un error en AdicionarEstadoArticulo_estadoArticuloDAO\n" + ex.getMessage());
            }
            return miRespuesta;
        }

        //////////////////////////////*MÉTODO ACTUALIZAR*//////////////////////////////////////
        public String ActualizarEstadoArticulo(estado_articulo estadoArticulo) {

            String miRespuesta;
            conexion miConexion = new conexion();
            Connection nuevaCon;
            nuevaCon = miConexion.getConn();

            PreparedStatement sentencia;
            try {
                String Query = "update estado_articulo set id_estado_articulo=?, descrip_estado=? where id_estado_articulo=?";
                sentencia = nuevaCon.prepareStatement(Query);

                sentencia.setInt(1, estadoArticulo.getId_estado_articulo());
                sentencia.setString(2, estadoArticulo.getDescrip_estado());
                sentencia.setInt(3, estadoArticulo.getId_estado_articulo());

                sentencia.executeUpdate();
                miRespuesta = "";

            } catch (Exception ex) {
                miRespuesta = ex.getMessage();
                System.out.println("Ha ocurrido un error en ActualizarEstadoArticulo_estadoArticuloDAO\n" + ex.getMessage());
            }
            return miRespuesta;
        }

        //////////////////////////////*MÉTODO CONSULTAR*//////////////////////////////////////
        public estado_articulo ConsultarEstadoArticulo(String id_estado_articulo) {
            estado_articulo mi_estado_articulo = null;

            conexion miConexion = new conexion();
            Connection nuevaCon;
            nuevaCon = miConexion.getConn();

            try {

                Statement sentencia = nuevaCon.createStatement();

                String Query = "Select id_estado_articulo, descrip_estado from estado_articulo where id_estado_articulo =  " + id_estado_articulo;
                ResultSet rs = sentencia.executeQuery(Query);
                while (rs.next()) {

                    mi_estado_articulo = new estado_articulo();
                    mi_estado_articulo.setId_estado_articulo(rs.getInt(1));
                    mi_estado_articulo.setDescrip_estado(rs.getString(2));

                }

                return mi_estado_articulo;
            } catch (Exception ex) {
                System.out.println("Ha ocurrido un error en ConsultarUsuario_ciudadDAO\n " + ex.getMessage());
            }
            return mi_estado_articulo;
        }

        //////////////////////////////*MÉTODO LISTAR CONSULTA*//////////////////////////////////////
        public ArrayList<estado_articulo> ConsultarListadoEstadoArticulo(int id_estado_articulo, String descrip_estado) {
            ArrayList<estado_articulo> mi_listado_estado_articulo = new ArrayList<estado_articulo>();
            estado_articulo mi_estado_articulo;

            conexion miConexion = new conexion();
            Connection nuevaCon;
            nuevaCon = miConexion.getConn();

            System.out.println("Buscando parametro: " + id_estado_articulo);
            try {
                Statement sentencia = nuevaCon.createStatement();

                String Query = " select id_estado_articulo,descrip_estado "
                        + " from estado_articulo "
                        + " where id_estado_articulo like '%" + id_estado_articulo + "%' "
                        + "  or (descrip_estado) like ('%" + descrip_estado + "%') ORDER BY id_estado_articulo;";
                ResultSet rs = sentencia.executeQuery(Query);
                while (rs.next()) {

                    mi_estado_articulo = new estado_articulo();
                    mi_estado_articulo.setId_estado_articulo(rs.getInt(1));
                    mi_estado_articulo.setDescrip_estado(rs.getString(2));
                    mi_listado_estado_articulo.add(mi_estado_articulo);
                }
                return mi_listado_estado_articulo;
            } catch (Exception ex) {
                System.out.println("Ha ocurrido un error en ConsultarListadoEstadoArticulo_estadoArticuloDAO\n " + ex.getMessage());
            }
            return mi_listado_estado_articulo;

        }
        //////////////////////////////*MÉTODO ELIMINAR*//////////////////////////////////////

        public String EliminarEstadoArticulo(estado_articulo estadoArticulo) {

            String miRespuesta;
            conexion miConexion = new conexion();
            Connection nuevaCon;
            nuevaCon = miConexion.getConn();

            PreparedStatement sentencia;
            try {
                String Query = " delete from estado_articulo where id_estado_articulo = ? and descrip_estado = ? ;";
                sentencia = nuevaCon.prepareStatement(Query);
                sentencia.setInt(1, estadoArticulo.getId_estado_articulo());
                sentencia.setString(2, estadoArticulo.getDescrip_estado());
                sentencia.execute();
                miRespuesta = "";
            } catch (Exception ex) {
                miRespuesta = ex.getMessage();
                System.out.println("Ocurrio un error en EliminarEstadoArticulo_estadoArticuloDAO" + ex.getMessage());
            }
            return miRespuesta;
        }

    }

