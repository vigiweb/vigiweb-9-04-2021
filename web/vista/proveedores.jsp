
<%@page import="modelo.proveedor"%>
<%@page import="controlador.proveedorDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Ubuntu+Condensed&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="../css/bootstrap.css">
        <link rel="stylesheet" href="../css/usuarios.css">
        <link rel="stylesheet" href="../css/estilo.css">
        <link rel="stylesheet" href="../css/styleAll.css">
        <script src="../js/validarProveedores.js"></script>
        <script src="../js/visualizaOculta.js"></script>
        
        <title>Proveedores</title>
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
       <div id="Registrar" class="container d-none" style="background-color: white">
            <h1>Registrar proveedores</h1>
            <form action="/vigiwebB/registrarProveedores" method="post" onsubmit="return validarProveedores()" >

                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Nombre:</h2>
                        <input type="text" name="pr_nombre" class="form-control" placeholder="Ingrese el nombre del proveedor" id="txt_pr_nombre_Reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Tipo:</h2>
                        <input type="text" name="pr_tipo" class="form-control" placeholder="Ingrese el tipo de proveedor" id="txt_pr_tipo_reg">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Número telefónico:</h2>
                        <input type="text" name="pr_telefono" class="form-control" placeholder="Ingrese el telefono del proveedor" id="txt_pr_telefono_reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Dirección:</h2>
                        <input type="text" name="pr_direccion" class="form-control" placeholder="Ingrese la dirección del proveedor" id="txt_pr_direccion_reg">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Correo electrónico:</h2>
                        <input type="text" name="pr_correo" class="form-control" placeholder="Ingrese el correo del proveedor" id="txt_pr_correo_reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Número de Identificación:</h2>
                        <input type="text" name="pr_identificacion" class="form-control" placeholder="Ingrese la identificación del proveedor" id="txt_pr_identificacion_reg">
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
       <div id="Actualizar" class="container d-none" style="background-color: white">
            <h1>Actualizar proveedores</h1>
            <form action="/vigiwebB/actualizarProveedores" method="post">
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Nombre:</h2>
                        <input type="text" name="pr_nombre" class="form-control" id="txt_pr_nombre_Reg" value="<%=request.getParameter("Nombres")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Tipo:</h2>
                        <input type="text" name="pr_tipo" class="form-control" id="txt_pr_tipo_reg" value="<%=request.getParameter("Tipo")%>">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Número telefónico:</h2>
                        <input type="text" name="pr_telefono" class="form-control" id="txt_pr_telefono_reg" value="<%=request.getParameter("Telefono")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Dirección:</h2>
                        <input type="text" name="pr_direccion" class="form-control" id="txt_pr_direccion_reg" value="<%=request.getParameter("Direccion")%>">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Correo electrónico:</h2>
                        <input type="text" name="pr_correo" class="form-control" id="txt_pr_correo_reg" value="<%=request.getParameter("Correo")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Número de identificación:</h2>
                        <input type="text" name="pr_identificacion" class="form-control" id="txt_pr_identificacion_reg" value="<%=request.getParameter("Identificacion")%>">
                    </div>
                </div>
                <center><button type="submit" class="btn btn-ActReg">Actualizar</button></center>
            </form>
        </div>
        <!--FORMULARIO ACTUALIZAR-->

        <!--FORMULARIO LISTAR-->
        <div id="Listado" class="contenedor2">
            <form action="/vigiwebB/GestionProveedores" method="post">
                <div class="row justify-content-md-center">
                        <div id="ControlRegistro" class="input-group">
                            <input id="txt_Id_Consultado" type="text" class="form-control input-search" name="IdConsultado" value="<%=buscando%>" autofocus="" placeholder="Ingresar Número de identificación, Nombres o Apellidos"/>
                            <button type="button" class="btn btn-arg" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onclick="realizarBusqueda()">Buscar</button>
                        </div>    
                            <br>
                        <div>
                            <h2 class="title-table">Listado Proveedores</h2>
                            <div id="Tabla_Proveedores"></div>
                            <%
                                proveedorDAO proveedordao = new proveedorDAO();
                                ArrayList<proveedor> proveedorList = new ArrayList<proveedor>();
                                proveedorList = proveedordao.ListarProveedor(buscando, buscando, buscando);
                                out.println("<table class='table table-light table-striped table-hover table-borderless border-dark'><tr><td>Nombre</td><td>Número de identificación</td><td>Tipo de proveedor</td><td>Telefono</td><td>Dirección</td><td>Correo</td><td>Actualizar</td><td>Eliminar</td>");

                                for (proveedor P : proveedorList) {

                                    out.println("<tr>");
                                    out.println("<td>" + P.getPr_nombre()+ "</td>");
                                    out.println("<td>" + P.getPr_identificacion()+ "</td>");
                                    out.println("<td>" + P.getPr_tipo()+ "</td>");
                                    out.println("<td>" + P.getPr_telefono()+ "</td>");
                                    out.println("<td>" + P.getPr_direccion()+ "</td>");
                                    out.println("<td>" + P.getPr_correo()+ "</td>");

                                    out.println("<td>" + "<input type = 'submit' class='btn btn-secondary btn btn-login' value='Actualizar'name='Actualizar'onclick='SetIdConsulta(" + P.getPr_identificacion()+ ")'/>" + "</td>");
                                    out.println("<td>" + "<input type = 'submit' class='btn btn-danger btn btn-login' value='Eliminar'name='Eliminar'onclick='SetIdConsulta(" + P.getPr_identificacion()+ ")'/>" + "</td>");
                                    out.println("</tr>");
                                }
                                out.println("</table>");
                                
                            %>

                        </div>
      
                </div>
            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="../js/bootstrap.js"></script>
    </body>
</html>
