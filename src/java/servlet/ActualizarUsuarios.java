/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.usuariosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuarios;

/**
 *
 * @author Famil
 */
public class ActualizarUsuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        /* TODO output your page here. You may use following sample code. */

        String numero_documento = request.getParameter("numero_documento");
        String nombre_usuario = request.getParameter("nombre_usuario");
        String contrasena = request.getParameter("contrasena");
        String barrio = request.getParameter("barrio");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String ciudad_id_ciudad = request.getParameter("ciudad_id_ciudad");
        String tipo_usuario_id_tipo_usuario = request.getParameter("tipo_usuario_id_tipo_usuario");
        String tipo_documento_id_tipo_documento = request.getParameter("tipo_documento_id_tipo_documento");
        String tipo_genero_id_tipo_genero = request.getParameter("tipo_genero_id_tipo_genero");
        String estado_usuario_id_estado_usuario = request.getParameter("estado_usuario_id_estado_usuario");

        int Telefono = Integer.parseInt(telefono);
        int EstadoUsuario = Integer.parseInt(estado_usuario_id_estado_usuario);
        int TipoUsuario = Integer.parseInt(tipo_usuario_id_tipo_usuario);
        int TipoDocumento = Integer.parseInt(tipo_documento_id_tipo_documento);
        int TipoGenero = Integer.parseInt(tipo_genero_id_tipo_genero);
        int Ciudad = Integer.parseInt(ciudad_id_ciudad);

        usuarios miUsuarios = new usuarios();
        usuariosDAO miUsuariosDao = new usuariosDAO();

        miUsuarios.setNumero_documento(numero_documento);
        miUsuarios.setNombre_usuario(nombre_usuario);
        miUsuarios.setContrasena(contrasena);
        miUsuarios.setBarrio(barrio);
        miUsuarios.setDireccion(direccion);
        miUsuarios.setCorreo(correo);
        miUsuarios.setTelefono(Telefono);
        miUsuarios.setCiudad_id_ciudad(EstadoUsuario);
        miUsuarios.setTipo_usuario_id_tipo_usuario(TipoUsuario);
        miUsuarios.setTipo_documento_id_tipo_documento(TipoDocumento);
        miUsuarios.setTipo_genero_id_tipo_genero(TipoGenero);
        miUsuarios.setEstado_usuario_id_estado_usuario(Ciudad);
        
        System.out.println("Número de documento " + numero_documento);
        String respuestaRegistrada = miUsuariosDao.AtualizarUsuario(miUsuarios);
        if(respuestaRegistrada.length() == 0) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+"Actualización Realizada."+"');");
            out.println("window.location.href = '/vigiwebB/vista/usuarios.jsp';");
            out.println("</script>");
        } else {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+"No se ha podido relizar la actualizacion."+"\n"+respuestaRegistrada +"');");
            out.println("</script>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
