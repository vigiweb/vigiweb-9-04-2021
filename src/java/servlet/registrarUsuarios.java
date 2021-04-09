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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuarios;

/**
 *
 * @author Famil
 */
@WebServlet(name = "registrarUsuarios", urlPatterns = {"/registrarUsuarios"})
public class registrarUsuarios extends HttpServlet {

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

        String numero_documento = request.getParameter("numero_documento");
        String nombre_usuario = request.getParameter("nombre_usuario");
        String contraseña = request.getParameter("contrasena");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String barrio = request.getParameter("barrio");
        String telefono = request.getParameter("telefono");
        String estado_usuario_id_estado_usuario = request.getParameter("estado_usuario_id_estado_usuario");
        String tipo_usuario_id_tipo_usuario = request.getParameter("tipo_usuario_id_tipo_usuario");
        String tipo_documento_id_tipo_documento = request.getParameter("tipo_documento_id_tipo_documento");
        String tipo_genero_id_tipo_genero = request.getParameter("tipo_genero_id_tipo_genero");
        String ciudad_id_ciudad = request.getParameter("ciudad_id_ciudad");
        String BanderaEstado = request.getParameter("banderaRegistro");

        int Telefono = Integer.parseInt(telefono);
        int EstadoUsuario = Integer.parseInt(estado_usuario_id_estado_usuario);
        int TipoUsuario = Integer.parseInt(tipo_usuario_id_tipo_usuario);
        int TipoDocumento = Integer.parseInt(tipo_documento_id_tipo_documento);
        int TipoGenero = Integer.parseInt(tipo_genero_id_tipo_genero);
        int Ciudad = Integer.parseInt(ciudad_id_ciudad);

        usuariosDAO mi_usuarios_dao = new usuariosDAO();
        usuarios mi_usuarios = new usuarios();

        mi_usuarios.setNumero_documento(numero_documento);
        mi_usuarios.setNombre_usuario(nombre_usuario);
        mi_usuarios.setContrasena(contraseña);
        mi_usuarios.setDireccion(direccion);
        mi_usuarios.setCorreo(correo);
        mi_usuarios.setBarrio(barrio);
        mi_usuarios.setTelefono(Telefono);
        mi_usuarios.setEstado_usuario_id_estado_usuario(EstadoUsuario);
        mi_usuarios.setTipo_usuario_id_tipo_usuario(TipoUsuario);
        mi_usuarios.setTipo_documento_id_tipo_documento(TipoDocumento);
        mi_usuarios.setTipo_genero_id_tipo_genero(TipoGenero);
        mi_usuarios.setCiudad_id_ciudad(Ciudad);
        
        System.out.println("El valor es " + BanderaEstado);
        if (BanderaEstado.equals("Correcto")) {
            String respuestaRegistrada = mi_usuarios_dao.AdicionarUsuario(mi_usuarios);
            System.out.println("Res " + respuestaRegistrada);
            System.out.println("Res " + respuestaRegistrada.length());
            if (respuestaRegistrada.length() == 0) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Usuario Registrado con éxito." + "');");
                out.println("window.location.href = '/vigiwebB/vista/usuarios.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                //out.println("alert('" + respuestaRegistrada + "');");
                out.println("alert('" + "Error encontrado: " + respuestaRegistrada.replace("'", "") + "');");
                out.println("window.history.back();");
                out.println("</script>");

            }
        } else {
            System.out.println("El valor no es correcto " + BanderaEstado);
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
