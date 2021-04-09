<%-- 
    Document   : articulos
    Created on : 11/02/2021, 06:24:32 PM
    Author     : Famil
--%>

<%@page import="modelo.articulo"%>
<%@page import="controlador.articuloDAO"%>
<%@page import="modelo.proveedor"%>
<%@page import="controlador.proveedorDAO"%>
<%@page import="modelo.estado_articulo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.estadoArticuloDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Ubuntu+Condensed&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="../css/bootstrap.css">
        <link rel="stylesheet" href="../css/usuarios.css">
        <link rel="stylesheet" href="../css/estilo.css">
        <link rel="stylesheet" href="../css/styleAll.css">
        <script src="../js/validarArticulo.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artículos</title>
    </head>
    <body style="background-image: url('../imagenes/ropaRosada (1).jpg')" onload="visualizaOculta('<%=request.getParameter("Vista")%>');">
        <% String buscando = request.getParameter("buscando");
            if (buscando == null) {
                buscando = "";
            }
        %>

        <!--MENU-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top">
            <a class="navbar-brand" href="#">Baby Runner</a>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <li class="nav-item active">
                        <a class="nav-link" href="./entradaAdministrador.jsp">Inicio</a>
                    </li>
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Registros Principales</a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="../vista/proveedores.jsp">Registrar Proveedores</a>
                            <a class="dropdown-item" href="../vista/usuarios.jsp">Registrar Usuarios</a> 
                            <a class="dropdown-item" href="../vista/articulos.jsp">Registrar Artículos</a>
                        </div>  
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Registros Secundarios</a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="../vista/ciudades.jsp">Registrar Ciudades</a>
                            <a class="dropdown-item" href="../vista/estadoarticulo.jsp">Registrar Estado Artículo</a> 
                            <a class="dropdown-item" href="../vista/estadousuario.jsp">Registrar Estado Usuario</a>
                            <a class="dropdown-item" href="../vista/formaPago.jsp">Registrar Forma de Pago</a>
                            <a class="dropdown-item" href="../vista/tipomov.jsp">Registrar Tipo Movimiento</a>
                            <a class="dropdown-item" href="../vista/tipousuario.jsp">Registrar Tipo Usuario</a>
                        </div>  
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Registros Anexos</a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="../vista/inventario.jsp">Registrar Inventario</a>
                            <a class="dropdown-item" href="../vista/factura.jsp">Registrar Facturas</a> 
                        </div>  
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <button class="btn btn-outline-danger my-2 my-sm-0" type="submit"><a href="../home.jsp" class="text-decoration-none" style="color: white">Salir</a></button>
                </form>
            </div>
        </nav>
        <!--MENU-->

        <!--NAV-->
        <div class="row justify-content-md-center div-nav-2">
            <div class="btn-group">
                <button type="button" class="btn btn-dark-1" data-toggle="dropdown"
                        aria-haspopup="true" aria-expanded="false"
                        onClick="visualizaOculta('Registrar')">
                    Registrar
                </button>
                <button type="button" class="btn btn-dark-1" data-toggle="dropdown"
                        aria-haspopup="true" aria-expanded="false"
                        onClick="visualizaOculta('Listado')">
                    Consultar
                </button>
            </div>
        </div>
        <!--NAV-->

        <!--FORMULARIO REGISTRAR-->
        <div id="Registrar" class="container bd-example d-none" style="background-color: white">
            <h1>Registrar artículos</h1>
            <form action="/vigiwebB/registrarArticulos" method="post" onsubmit="return validarArticulos()" >

                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Nombre del artículo:</h2>
                        <input type="text" name="nombre_articulo" class="form-control" placeholder="Digite el nombre del artículo" id="txt_nombre_articulo_Reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Referencia artículo:</h2>
                        <input type="number" name="referencia_articulo" class="form-control" placeholder="Digite la referencia del artículo" id="txt_referencia_articulo_reg">
                    </div>
                </div>

                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Precio:</h2>
                        <input type="number" name="precio_articulo" class="form-control" placeholder="Digite el precio del artículo" id="txt_precio_articulo_reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Cantidad:</h2>
                        <input type="number" name="cantidad_articulo" class="form-control" placeholder="Digite la cantidad del artículo" id="txt_cantidad_reg">
                    </div>

                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Iva:</h2>
                        <input type="number" name="iva_articulo" placeholder="Digite el IVA del artículo" class="form-control" id="txt_iva_reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Descripcion:</h2>
                        <input type="text" name="descripcion_articulo" class="form-control" placeholder="Digite la descripción del artículo" id="txt_descripcion_reg">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Estado:</h2>
                        <input type="number" name="estado_articulo_id_estado_articulo" class="form-control d-none" id="txt_estado_reg">
                        <%
                            estadoArticuloDAO estadoArticuloDao = new estadoArticuloDAO();
                            ArrayList<estado_articulo> miestadoArticulo = estadoArticuloDao.ConsultarListadoEstadoArticulo(' ', "");
                            out.println("<select class='form-control'id ='SelectEstado'>");
                            out.println("<option onclick='setEstado(\"" + "" + "\")'>" + "Seleccione el estado del artículo" + "</option>");

                            for (estado_articulo C : miestadoArticulo) {
                                out.println("<option onclick='setEstado(\"" + C.getId_estado_articulo() + "\")'>" + C.getDescrip_estado() + "</option>");
                            }
                            out.println("</select>");
                        %>
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Proveedor:</h2>
                        <input type="number" name="proveedor_id_proveedor" class="form-control d-none" id="txt_proveedor_reg">
                        <%
                            proveedorDAO proveedorDao = new proveedorDAO();
                            ArrayList<proveedor> miproveedor = proveedorDao.ListarProveedor("", "", "");
                            out.println("<select class='form-control'id ='SelectProveedor'>");
                            out.println("<option onclick='setProvedor(\"" + "" + "\")'>" + "Seleccione el proveedor del artículo" + "</option>");

                            for (proveedor C : miproveedor) {
                                out.println("<option onclick='setProvedor(\"" + C.getId_proveedor() + "\")'>" + C.getPr_nombre() + "</option>");
                            }
                            out.println("</select>");
                        %>
                    </div>
                </div>
                <div id="controlRegistro" class="bd-example d-none">
                    <input id="txt_bandera_reg" type="text" class="form-control" name="banderaRegistro">
                </div>
                <center><button type="submit" class="btn btn-ActReg">Registrar</button></center>
            </form>
        </div>
        <!--FORMULARIO REGISTRAR-->

        <!--FORMULARIO ACTUALIZAR-->
        <div id="Actualizar" class="container bd-example d-none" style="background-color: white">
            <h1>Actualizar artículos</h1>
            <form action="/vigiwebB/actualizarArticulos" method="post">
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Nombre del artículo:</h2>
                        <input type="text" name="nombre_articulo" class="form-control"  id="txt_nombre_articulo_Reg" value="<%=request.getParameter("Nombres")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Referencia artículo:</h2>
                        <input type="number" name="referencia_articulo" class="form-control" id="txt_referencia_articulo_reg" value="<%=request.getParameter("Referencia")%>">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Precio:</h2>
                        <input type="number" name="precio_articulo" class="form-control" id="txt_precio_articulo_reg" value="<%=request.getParameter("Precio")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Cantidad:</h2>
                        <input type="number" name="cantidad_articulo" class="form-control" id="txt_cantidad_reg" value="<%=request.getParameter("Cantidad")%>">
                    </div>

                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Iva:</h2>
                        <input type="number" name="iva_articulo" class="form-control" id="txt_iva_reg" value="<%=request.getParameter("Iva")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Descripcion:</h2>
                        <input type="text" name="descripcion_articulo" class="form-control" id="txt_descripcion_reg" value="<%=request.getParameter("Descripcion")%>">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Estado:</h2>
                        <input type="number" name="estado_articulo_id_estado_articulo" class="form-control" id="txt_estado_reg" value="<%=request.getParameter("Estado")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Proveedor:</h2>
                        <input type="number" name="proveedor_id_proveedor" class="form-control" id="txt_proveedor_reg" value="<%=request.getParameter("Proveedor")%>">
                    </div>
                </div>
                <center><button type="submit" class="btn btn-ActReg">Actualizar</button></center>
            </form>
        </div>
        <!--FORMULARIO ACTUALIZAR-->


        <!--FORMULARIO LISTAR-->
        <div id="Listado" class="contenedor2">
            <form action="/vigiwebB/GestionArticulos" method="post">
                <div class="row justify-content-md-center">
                    <div id="ControlRegistro" class="input-group">
                        <input id="txt_Id_Consultado" type="text" class="form-control input-search" name="IdConsultado" value="<%=buscando%>" autofocus="" placeholder="Ingresar Referencia o Nombre"/>
                        <button type="button" class="btn btn-arg" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onclick="realizarBusqueda()">Buscar</button>
                    </div>    
                    <br>
                    <div>
                        <h2 class="title-table">Listado Proveedores</h2>
                        <div id="Tabla_Proveedores"></div>
                        <%
                            articuloDAO articulodao = new articuloDAO();
                            ArrayList<articulo> articuloList = new ArrayList<articulo>();
                            articuloList = articulodao.ConsultarListadoArticulos(buscando, buscando);
                            out.println("<table class='table table-light table-striped table-hover table-borderless border-dark'><tr><td>Nombre</td><td>Referencia del artículo</td><td>Precio</td><td>Cantidad</td><td>IVA</td><td>Descripción</td><td>Estado del artículo</td><td>Proveedor</td><td>Actualizar</td><td>Eliminar</td>");

                            for (articulo A : articuloList) {

                                out.println("<tr>");
                                out.println("<td>" + A.getNombre_articulo() + "</td>");
                                out.println("<td>" + A.getReferencia_articulo() + "</td>");
                                out.println("<td>" + A.getPrecio_articulo() + "</td>");
                                out.println("<td>" + A.getCantidad_articulo() + "</td>");
                                out.println("<td>" + A.getIva_articulo() + "</td>");
                                out.println("<td>" + A.getDescripcion_articulo() + "</td>");
                                out.println("<td>" + A.getEstado_articulo_id_estado_articulo() + "</td>");
                                out.println("<td>" + A.getProveedor_id_proveedor() + "</td>");

                                out.println("<td>" + "<input type = 'submit' class='btn btn-secondary btn btn-login' value='Actualizar'name='Actualizar'onclick='SetIdConsulta(" + A.getReferencia_articulo() + ")'/>" + "</td>");
                                out.println("<td>" + "<input type = 'submit' class='btn btn-danger btn btn-login' value='Eliminar'name='Eliminar'onclick='SetIdConsulta(" + A.getReferencia_articulo() + ")'/>" + "</td>");
                                out.println("</tr>");
                            }
                            out.println("</table>");

                        %>

                    </div>

                </div>
            </form>
        </div>
        <!--FORMULARIO LISTAR-->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="../js/bootstrap.js"></script>
    </body>
</html>
