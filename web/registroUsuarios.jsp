<%-- 
    Document   : index
    Created on : 29/09/2020, 08:12:32 AM
    Author     : Famil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.tipo_genero"%>
<%@page import="controlador.tipoGeneroDAO"%>
<%@page import="modelo.tipo_documento"%>
<%@page import="controlador.tipoDocumentoDAO"%>
<%@page import="modelo.tipo_usuario"%>
<%@page import="controlador.tipoUsuarioDAO"%>
<%@page import="modelo.estado_usuario"%>
<%@page import="controlador.estadoUsuarioDAO"%>
<%@page import="controlador.ciudadDAO"%>
<%@page import="modelo.ciudad"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Anton&family=Scada&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/usuarios.css">
        <title>Registro usuario</title>


    </head>
    <body>

       <!-- <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="home.jsp">INICIO</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">CATALOGO</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">CONTACTO</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <button class="btn btn-info my-2 my-sm-0 mr-3" type="button"><a href="inicioSesion.jsp" class="text-decoration-none">Iniciar sesión</a></button>
                    <button class="btn btn-outline-info my-2 my-sm-0" type="button"><a href="registroUsuarios.jsp" class="text-decoration-none">Registrarse</a></button>
                </form>
            </div>
        </nav>-->

        <h1>Registro de usuarios</h1>
        <div class="Formulario bd-example d-none" id="registrar">
            <form form action="registroUsuarios" method="post" onsubmit="return validacionRegistro()">
                <div class="form-group mb-4">
                    <label for="exampleInputEmail1" class="form-label font-weight-bold ">Número de identificación:</label>
                    <input type="text" name="numero_documento" class="form-control bg-dark-x border-0" placeholder="Ingrese su identificación" id="txt_identificacion_reg" aria-describedby="emailHelp">
                </div>
                <div class="form-group mb-4">
                    <label for="exampleInputEmail1" class="form-label font-weight-bold ">Nombre de usuario:</label>
                    <input type="text" name="nombre_usuario" class="form-control bg-dark-x border-0" placeholder="Ingrese su nombre" id="txt_nombre_reg" aria-describedby="emailHelp">
                </div>
                <div class="form-group mb-4">
                    <label for="exampleInputPassword1" class="form-label font-weight-bold">Contraseña:</label>
                    <input type="password" name="contraseña" class="form-control bg-dark-x border-0" placeholder="Ingrese su contraseña" id="txt_contraseña_reg">
                </div>
                <div class="form-group mb-4">
                    <label for="exampleInputEmail1" class="form-label font-weight-bold ">Número de telefono:</label>
                    <input type="text" name="telefono" class="form-control bg-dark-x border-0" placeholder="Ingrese su número de contacto" id="txt_telefono_reg" aria-describedby="emailHelp">
                </div>
                <div class="form-group mb-4">
                    <label for="exampleInputEmail1" class="form-label font-weight-bold ">Dirección:</label>
                    <input type="text" name="direccion" class="form-control bg-dark-x border-0" placeholder="Ingrese su dirección" id="txt_direccion_reg" aria-describedby="emailHelp">
                </div>
                <div class="form-group mb-4">
                    <label for="exampleInputEmail1" class="form-label font-weight-bold ">Barrio:</label>
                    <input type="text" name="barrio" class="form-control bg-dark-x border-0" placeholder="Ingrese su barrio" id="txt_barrio_reg" aria-describedby="emailHelp">
                </div>
                <div class="form-group mb-4">
                    <label for="exampleInputEmail1" class="form-label font-weight-bold ">Correo electrónico:</label>
                    <input type="text" name="correo" class="form-control bg-dark-x border-0" placeholder="Ingrese su correo" id="txt_correo_reg" aria-describedby="emailHelp">
                </div>

                <h5 for="Id_doc_identificacion_usuario">Tipo de documento de identificación del usuario</h5>
                <input id="txt_id_doc_identificacion_Reg" type="text" class="form-control d-none" name="tipo_documento">

                <%
                    tipoDocumentoDAO mi_doc_usuario_dao = new tipoDocumentoDAO();
                    ArrayList<tipo_documento> mi_doc_usuario = mi_doc_usuario_dao.ConsultarListadoTipoDocumento(1, "");
                    out.println("<select class='form-control' id='SelectTipoDoc' size='1'>");
                    out.println("<option onclick='setIdTipo(\"" + "" + "\")'>" + "Seleccione" + "</option>");
                    for (tipo_documento C : mi_doc_usuario) {

                        out.println("<option onclick='setIdTipo(\"" + C.getId_tipo_documento() + "\")'>" + C.getDescrip() + "</option>");

                    }
                    out.println("</select>");
                %>

                <h5 for="Id_tipo_usuario">Tipo de usuario</h5>
                <input id="txt_id_tipo_usuario_Reg" type="text" class="form-control d-none" name="tipo_usuario">

                <%
                    tipoUsuarioDAO mi_tipo_usuario_dao = new tipoUsuarioDAO();
                    ArrayList<tipo_usuario> mi_tipo_usuario = mi_tipo_usuario_dao.ConsultarListadoTipoUsuario(1, "");
                    out.println("<select class='form-control' id='SelectTipousuario' size='1'>");
                    out.println("<br>");
                    out.println("<option onclick='setIdTipousuario(\"" + "" + "\")'>" + "Seleccione" + "</option>");
                    for (tipo_usuario C : mi_tipo_usuario) {

                        out.println("<option onclick='setIdTipousuario(\"" + C.getId_tipo_usuario() + "\")'>" + C.getDescp_usuario() + "</option>");

                    }
                    out.println("</select>");

                %>

                <br>
                <h5 for="Id_genero_usuario">Genero de usuario</h5>
                <input id="txt_id_genero_usuario_Reg" type="text" class="form-control d-none" name="tipo_genero">

                <%                                tipoGeneroDAO mi_genero_usuario_dao = new tipoGeneroDAO();
                    ArrayList<tipo_genero> mi_genero_usuario = mi_genero_usuario_dao.ConsultarListadoTipoGenero(1, "");
                    out.println("<select class='form-control' id='SelectGenero' size='1'>");
                    out.println("<option onclick='setIdGenerousuario(\"" + "" + "\")'>" + "Seleccione" + "</option>");
                    for (tipo_genero C : mi_genero_usuario) {

                        out.println("<option onclick='setIdGenerousuario(\"" + C.getId_tipo_genero() + "\")'>" + C.getDescrip_genero() + "</option>");

                    }
                    out.println("</select>");
                %>

                <br>
                <h5 for="Id_estado_producto">Estado usuario</h5>
                <input id="txt_id_estado_usuario_Reg" type="text" class="form-control d-none" name="estado_usuario">

                <%
                    estadoUsuarioDAO mi_estado_usurio_dao = new estadoUsuarioDAO();
                    ArrayList<estado_usuario> mi_estado_usurio = mi_estado_usurio_dao.ConsultarListadoEstadoUsuario(1, "");
                    out.println("<select class='form-control' id='SelectEstado' size='1'>");
                    out.println("<option onclick='setIdEstadousuario(\"" + "" + "\")'>" + "Seleccione" + "</option>");
                    for (estado_usuario C : mi_estado_usurio) {

                        out.println("<option onclick='setIdEstadousuario(\"" + C.getId_estado_usuario() + "\")'>" + C.getDescrip_estado() + "</option>");

                    }
                    out.println("</select>");

                %>

                <br>
                <h5 for="Id_ciudad">Ciudad</h5>
                <input id="txt_id_ciudad_Reg" type="text" class="form-control d-none" name="ciudad">
                <%  ciudadDAO mi_ciudad_dao = new ciudadDAO();
                    ArrayList<ciudad> mi_ciudad = mi_ciudad_dao.ConsultarListadoCiudad("1", "");
                    out.println("<select class='form-control' id='SelectCiudad' size='1'>");
                    out.println("<option onclick='setIdCiudad(\"" + "" + "\")'>" + "Seleccione" + "</option>");
                    for (ciudad C : mi_ciudad) {

                        out.println("<option onclick='setIdCiudad(\"" + C.getId_ciudad() + "\")'>" + C.getDescrip_ciudad() + "</option>");

                    }
                    out.println("</select>");

                %>
                <div id="controlRegistro" class="bd-example d-none">
                    <input id="txt_bandera_reg" type="text" class="form-control d-none" name="banderaRegistro">
                </div>
                <br>
                <button type="submit" class="btn btn-primary w-100">Registrar</button>
                <br>
            </form>
        </div>
        <script src="vista/javascript/validacionRegistro.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
        <script src="./js/bootstrap.js"></script>
    </body>
</html>
