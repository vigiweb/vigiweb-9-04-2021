<%-- 
    Document   : ciudades
    Created on : 16/02/2021, 03:30:10 PM
    Author     : Famil
--%>

<%@page import="modelo.ciudad"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.ciudadDAO"%>
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
        <script src="../js/validarCiudad.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ciudades</title>
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
        <div id="Registrar" class="bd-example d-none">
            <div class="container" style="background-color: white">
                <h1>Registrar Ciudad</h1>
                <form action="/vigiwebB/registrarCiudades" method="post" onsubmit="return validacionCiudad()" >
                    <div class="form-row" >
                        <div class="form-group col-md-12" >
                            <h2>Ciudad:</h2>
                            <input type="text" name="descrip_ciudad" class="form-control" placeholder="Digite la ciudad" id="txt_descrip_ciudad_Reg">
                        </div> 
                    </div>
                    <div id="ControlRegistro" class="bd-example d-none">
                        <input id="txt_Bandera_Reg" type="text" class="form-control" name="BanderaRegistro">
                    </div>
                    <center><button type="submit" class="btn btn-arg">Registrar</button></center>
                </form>
            </div>
        </div>
        <!--FORMULARIO REGISTRAR-->
        
        <!--FORMULARIO LISTAR-->
        <div id="Listado" class="bd-example contenedor2">
            <form action="/vigiwebB/GestionCiudades" method="post">
                <div class="row justify-content-md-center">
                    <div id="ControlRegistro" class="input-group">
                        <input id="txt_Id_Consultado" type="text" class="form-control input-search" name="IdConsultado" value="<%=buscando%>" autofocus="autofocus" placeholder="Ingresar nombre de la ciudad."/>
                        <button type="button" class="btn btn-arg" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onclick="realizarBusqueda()">Buscar</button>
                    </div>    
                    <div>
                        <h2 class="title-table">Listado Ciudades</h2>
                        <%
                            ciudadDAO ciudaddao = new ciudadDAO();
                            ArrayList<ciudad> ciudadList = new ArrayList<ciudad>();
                            ciudadList = ciudaddao.ConsultarListadoCiudad(buscando, buscando);
                            out.println("<table class='table table-light table-striped table-hover table-borderless border-dark'><thead class='thead-info'><tr><th>ID</th><th>Ciudad</th><th>Eliminar</th></tr></thead>");

                            for (ciudad C : ciudadList) {

                                out.println("<tr>");
                                out.println("<td>" + C.getId_ciudad() + "</td>");
                                out.println("<td>" + C.getDescrip_ciudad() + "</td>");

                                out.println("<td>" + "<input type = 'submit' class='btn btn-danger btn btn-login' value='Eliminar'name='Eliminar'onclick='SetIdConsulta(" + C.getId_ciudad() + ")'/>" + "</td>");
                                out.println("</tr>");
                            }
                            out.println("</table>");
                        %>
                    </div>
                </div>
            </form>
        </div>
        <!--FORMULARIO LISTAR-->
        <script src="../js/bootstrap.js"></script>
    </body>
</html>
