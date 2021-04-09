
<%@page import="modelo.estado_usuario"%>
<%@page import="controlador.estadoUsuarioDAO"%>
<%@page import="modelo.tipo_genero"%>
<%@page import="controlador.tipoGeneroDAO"%>
<%@page import="controlador.tipoDocumentoDAO"%>
<%@page import="modelo.tipo_documento"%>
<%@page import="modelo.tipo_documento"%>
<%@page import="modelo.ciudad"%>
<%@page import="controlador.ciudadDAO"%>
<%@page import="modelo.tipo_usuario"%>
<%@page import="controlador.tipoUsuarioDAO"%>
<%@page import="controlador.usuariosDAO"%>
<%@page import="modelo.usuarios"%>
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
        <script src="../js/visualizaOculta.js"></script>
        <script src="../js/validarUsuarios.js"></script>
        <script src="../js/validarBoton.js"></script>

        <title>Usuarios</title>
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
            <h1>Registrar usuarios</h1>
            <form action="/vigiwebB/registrarUsuarios" method="post" onsubmit="return validarUsuarios()" >

                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Número de identificación:</h2>
                        <input type="number" name="numero_documento" class="form-control" placeholder="Digite su número de identificación"  id="txt_numero_documento_Reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Nombre:</h2>
                        <input type="text" name="nombre_usuario" class="form-control" placeholder="Digite su nombre" id="txt_nombre_usuario_reg">
                    </div>
                </div>

                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Contraseña:</h2>
                        <input type="password" name="contrasena" class="form-control" placeholder="Digite su contraseña" id="txt_contraseña_reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Barrio:</h2>
                        <input type="text" name="barrio" class="form-control" placeholder="Digite su barrio" id="txt_barrio_reg">
                    </div>

                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Dirección:</h2>
                        <input type="text" name="direccion" class="form-control" placeholder="Digite su dirección" id="txt_direccion_reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Correo electrónico:</h2>
                        <input type="text" name="correo" class="form-control" placeholder="Digite su correo" id="txt_correo_reg">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Número telefónico:</h2>
                        <input type="number" name="telefono" class="form-control" placeholder="Digite su número telefónico" id="txt_telefono_reg">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Ciudad:</h2>
                        <input type="text" name="ciudad_id_ciudad" class="form-control d-none" id="txt_ciudad_id_ciudad_reg">
                        <%
                            ciudadDAO ciudadDao = new ciudadDAO();
                            ArrayList<ciudad> miciudad = ciudadDao.ConsultarListadoCiudad(" ", "");
                            out.println("<select class='form-control'id ='SelectCiudad'>");
                            out.println("<option onclick='setCiudad(\"" + "" + "\")'>" + "Seleccione su ciudad" + "</option>");

                            for (ciudad C : miciudad) {
                                out.println("<option onclick='setCiudad(\"" + C.getId_ciudad() + "\")'>" + C.getDescrip_ciudad() + "</option>");
                            }
                            out.println("</select>");
                        %>
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6 select" >
                        <h2>Tipo usuario:</h2>
                        <input type="text" name="tipo_usuario_id_tipo_usuario" class="form-control d-none" id="txt_id_tipo_usuario_Reg">
                        <%
                            tipoUsuarioDAO tipousuarioDao = new tipoUsuarioDAO();
                            ArrayList<tipo_usuario> mitipodocumento = tipousuarioDao.ConsultarListadoTipoUsuario(' ', "");
                            out.println("<select class='form-control id ='SelectTipoUsuario'>");
                            out.println("<option onclick='setIdTipoUsuario(\"" + "" + "\")'>" + "Seleccione su tipo usuario" + "</option>");

                            for (tipo_usuario C : mitipodocumento) {
                                out.println("<option onclick='setIdTipoUsuario(\"" + C.getId_tipo_usuario() + "\")'>" + C.getDescp_usuario() + "</option>");
                            }
                            out.println("</select>");
                        %>
                    </div>

                    <div class="form-group col-md-6" >
                        <h2>Tipo documento:</h2>
                        <input type="text" name="tipo_documento_id_tipo_documento" class="form-control d-none" id="txt_tipo_documento_id_tipo_documento_reg">
                        <%
                            tipoDocumentoDAO tipoDocumentoDao = new tipoDocumentoDAO();
                            ArrayList<tipo_documento> mitipoDocumento = tipoDocumentoDao.ConsultarListadoTipoDocumento(' ', "");
                            out.println("<select class='form-control'id ='SelectCiudad'>");
                            out.println("<option onclick='setTipoDocumento(\"" + "" + "\")'>" + "Seleccione su tipo documento" + "</option>");

                            for (tipo_documento D : mitipoDocumento) {
                                out.println("<option onclick='setTipoDocumento(\"" + D.getId_tipo_documento() + "\")'>" + D.getDescrip() + "</option>");
                            }
                            out.println("</select>");
                        %>
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Tipo género:</h2>
                        <input type="text" name="tipo_genero_id_tipo_genero" class="form-control d-none" id="txt_tipo_genero_id_tipo_genero_reg">
                        <%
                            tipoGeneroDAO tipoGeneroDao = new tipoGeneroDAO();
                            ArrayList<tipo_genero> mitipoGenero = tipoGeneroDao.ConsultarListadoTipoGenero(' ', "");
                            out.println("<select class='form-control'id ='SelectTipoGenero'>");
                            out.println("<option onclick='setTipoGenero(\"" + "" + "\")'>" + "Seleccione su genero" + "</option>");

                            for (tipo_genero G : mitipoGenero) {
                                out.println("<option onclick='setTipoGenero(\"" + G.getId_tipo_genero() + "\")'>" + G.getDescrip_genero() + "</option>");
                            }
                            out.println("</select>");
                        %>
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Estado usuario:</h2>
                        <input type="text" name="estado_usuario_id_estado_usuario" class="form-control d-none" id="txt_estado_usuario_id_estado_usuario_reg">
                        <%
                            estadoUsuarioDAO estadoUsuarioDao = new estadoUsuarioDAO();
                            ArrayList<estado_usuario> miestadoUsuario = estadoUsuarioDao.ConsultarListadoEstadoUsuario(' ', "");
                            out.println("<select class='form-control'id ='SelectEstadoUsuario'>");
                            out.println("<option onclick='setEstadoUsuario(\"" + "" + "\")'>" + "Seleccione su estado" + "</option>");

                            for (estado_usuario E : miestadoUsuario) {
                                out.println("<option onclick='setEstadoUsuario(\"" + E.getId_estado_usuario() + "\")'>" + E.getDescrip_estado() + "</option>");
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
        <div id="Actualizar" class="bd-example d-none container" style="background-color: white">
            <h1>Actualizar usuarios</h1>
            <form action="/vigiwebB/ActualizarUsuarios" method="post">

                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Número de identificación:</h2>
                        <input type="number" readonly name="numero_documento" class="form-control" value="<%=request.getParameter("NumeroDoc")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Nombre:</h2>
                        <input type="text" name="nombre_usuario" class="form-control" value="<%=request.getParameter("Nombres")%>">
                    </div>
                </div>

                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Contraseña:</h2>
                        <input type="password" name="contrasena" class="form-control" value="<%=request.getParameter("Contrasena")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Barrio:</h2>
                        <input type="text" name="barrio" class="form-control" value="<%=request.getParameter("Barrio")%>">
                    </div>

                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Dirección:</h2>
                        <input type="text" name="direccion" class="form-control" value="<%=request.getParameter("Direccion")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Correo electrónico:</h2>
                        <input type="text" name="correo" class="form-control" value="<%=request.getParameter("Correo")%>">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Número telefónico:</h2>
                        <input type="number" name="telefono" class="form-control" value="<%=request.getParameter("Telefono")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Ciudad:</h2>
                        <input type="text" readonly name="ciudad_id_ciudad" class="form-control" id="txt_ciudad_id_ciudad_reg" value="<%=request.getParameter("Ciudad")%>">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6 select" >
                        <h2>Tipo usuario:</h2>
                        <input type="text" readonly name="tipo_usuario_id_tipo_usuario" class="form-control" id="txt_id_tipo_usuario_Reg" value="<%=request.getParameter("Tipo_usuario")%>">
                    </div>

                    <div class="form-group col-md-6" >
                        <h2>Tipo documento:</h2>
                        <input type="text" readonly name="tipo_documento_id_tipo_documento" class="form-control" id="txt_tipo_documento_id_tipo_documento_reg" value="<%=request.getParameter("Tipo_doc")%>">
                    </div>
                </div>
                <div class="form-row" >
                    <div class="form-group col-md-6" >
                        <h2>Tipo género:</h2>
                        <input type="text" readonly name="tipo_genero_id_tipo_genero" class="form-control" id="txt_tipo_genero_id_tipo_genero_reg" value="<%=request.getParameter("Genero")%>">
                    </div>
                    <div class="form-group col-md-6" >
                        <h2>Estado usuario:</h2>
                        <input type="text" readonly name="estado_usuario_id_estado_usuario" class="form-control" id="txt_estado_usuario_id_estado_usuario_reg" value="<%=request.getParameter("Estado_usuario")%>">
                    </div>
                </div>
                <center><button type="submit" class="btn btn-ActReg">Actualizar</button></center>
            </form>
        </div>
        <!--FORMULARIO ACTUALIZAR-->

        <!--FORMULARIO LISTAR-->
        <div id="Listado" class="bd-example contenedor2">
            <form action="/vigiwebB/ConsultarUsuarios" method="post">
                <div class="row justify-content-md-center">
                    <div id="ControlRegistro" class="input-group">
                        <input id="txt_Id_Consultado" type="text" class="form-control input-search" name="IdConsultado" value="<%=buscando%>" autofocus="autofocus" placeholder="Ingresar Número de documento, Nombre o Apellido."/>
                        <button type="button" class="btn btn-arg" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onclick="realizarBusqueda()">Buscar</button>
                    </div>    
                    <div>
                        <h2 class="title-table">Listado Usuarios</h2>
                        <div id="Tabla_Usuarios"></div>
                        <%
                            usuariosDAO usuariodao = new usuariosDAO();
                            ArrayList<usuarios> usuarioList = new ArrayList<usuarios>();
                            usuarioList = usuariodao.ConsultarListadoUusarios(buscando, buscando, buscando);
                            out.println("<table class='table table-light table-striped table-hover table-borderless border-dark'><thead class='thead-info'><tr><th>Número de documento</th><th>Nombre</th><th>Contraseña</th><th>Telefono</th><th>Dirección</th><th>Correo</th><th>Barrio</th><th>Estado Usuario</th><th>Tipo Usuario</th><th>Tipo Documento</th><th>Tipo Genero</th><th>Ciudad</th><th>Actualizar</th><th>Eliminar</th></tr></thead>");

                            for (usuarios C : usuarioList) {

                                out.println("<tr>");
                                out.println("<td>" + C.getNumero_documento() + "</td>");
                                out.println("<td>" + C.getNombre_usuario() + "</td>");
                                out.println("<td>" + C.getContrasena() + "</td>");
                                out.println("<td>" + C.getTelefono() + "</td>");
                                out.println("<td>" + C.getDireccion() + "</td>");
                                out.println("<td>" + C.getCorreo() + "</td>");
                                out.println("<td>" + C.getBarrio() + "</td>");
                                out.println("<td>" + C.getEstado_usuario_id_estado_usuario() + "</td>");
                                out.println("<td>" + C.getTipo_usuario_id_tipo_usuario() + "</td>");
                                out.println("<td>" + C.getTipo_documento_id_tipo_documento() + "</td>");
                                out.println("<td>" + C.getTipo_genero_id_tipo_genero() + "</td>");
                                out.println("<td>" + C.getCiudad_id_ciudad() + "</td>");

                                out.println("<td>" + "<input type = 'submit' class='btn btn-secondary btn btn-login' value='Actualizar'name='Actualizar'onclick='SetIdConsulta(" + C.getNumero_documento() + ")'/>" + "</td>");
                                out.println("<td>" + "<input type = 'submit' class='btn btn-danger btn btn-login' value='Eliminar'name='Eliminar'onclick='SetIdConsulta(" + C.getNumero_documento() + ")'/>" + "</td>");
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

