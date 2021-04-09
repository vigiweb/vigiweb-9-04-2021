/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.articuloDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.articulo;

/**
 *
 * @author Famil
 */
@WebServlet(name = "registrarArticulos", urlPatterns = {"/registrarArticulos"})
public class registrarArticulos extends HttpServlet {

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

        String nombre_articulo = request.getParameter("nombre_articulo");
        String referencia_articulo = request.getParameter("referencia_articulo");
        String precio_articulo = request.getParameter("precio_articulo");
        String cantidad_articulo = request.getParameter("cantidad_articulo");
        String iva_articulo = request.getParameter("iva_articulo");
        String descripcion_articulo = request.getParameter("descripcion_articulo");
        String estado_articulo_id_estado_articulo = request.getParameter("estado_articulo_id_estado_articulo");
        String proveedor_id_proveedor = request.getParameter("proveedor_id_proveedor");
        String BanderaEstado = request.getParameter("banderaRegistro");

        int Precio = Integer.parseInt(precio_articulo);
        int Cantidad = Integer.parseInt(cantidad_articulo);
        int Iva = Integer.parseInt(iva_articulo);
        int Estado = Integer.parseInt(estado_articulo_id_estado_articulo);
        int Proveedor = Integer.parseInt(proveedor_id_proveedor);

        articuloDAO mi_articulo_dao = new articuloDAO();
        articulo mi_articulo = new articulo();

        mi_articulo.setNombre_articulo(nombre_articulo);
        mi_articulo.setReferencia_articulo(referencia_articulo);
        mi_articulo.setPrecio_articulo(Precio);
        mi_articulo.setCantidad_articulo(Cantidad);
        mi_articulo.setIva_articulo(Iva);
        mi_articulo.setDescripcion_articulo(descripcion_articulo);
        mi_articulo.setEstado_articulo_id_estado_articulo(Estado);
        mi_articulo.setProveedor_id_proveedor(Proveedor);

        System.out.println("El valor es " + BanderaEstado);
        if (BanderaEstado.equals("Correcto")) {
            String respuestaRegistrada = mi_articulo_dao.AdicionarArticulo(mi_articulo);
            System.out.println("Res " + respuestaRegistrada);
            System.out.println("Res " + respuestaRegistrada.length());
            if (respuestaRegistrada.length() == 0) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Artículo Registrado con éxito." + "');");
                out.println("window.location.href = '/vigiwebB/vista/articulos.jsp';");
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
