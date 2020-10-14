<%-- 
    Document   : inicioSesion
    Created on : 30/09/2020, 09:27:43 PM
    Author     : Famil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Anton&family=Scada&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./css/bootstrap.css">
        <link rel="stylesheet" href= "./css/estilo.css">

        <title>INICIAR SESIÓN</title>
    </head>

    <body class="bg-dark">
        
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top" style="height: 90px;">
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
        </nav>
        
        <section>
            <div class="row g-0">
                <div class="col-lg-7">
                    <div class="img-1 min-vh-100"></div>
                </div>
                <div class="col-lg-5 d-flex flex-column align-items-end min-vh-100">
                    <div class="px-lg-5 pt-lg-4 pb-lg-1 p-4 w-100 mb-auto">
                        <img src="./imagenes/logo.png" class="img-fluid">
                    </div>
                    <div class="px-lg-5 py-lg-4 p-4 w-100 align-self-center">
                        <h1 class="font-weight-bold mb-4">¡Bienvenido a Baby Runner!</h1>

                        <form action="inicioSesion" method="post">
                            <div class="form-group mb-4">
                                <label for="exampleInputEmail1" class="form-label font-weight-bold ">Usuario</label>
                                <input type="text" name="usuario" class="form-control bg-dark-x border-0" placeholder="Ingrese su identificación" id="exampleInputEmail1" aria-describedby="emailHelp">
                            </div>
                            <div class="form-group mb-4">
                                <label for="exampleInputPassword1" class="form-label font-weight-bold">Clave</label>
                                <input type="password" name="clave" class="form-control bg-dark-x border-0" placeholder="Ingrese su contraseña" id="exampleInputPassword1">
                            </div>

                            <button type="submit" class="btn btn-primary w-100">Iniciar sesión</button>
                        </form>
                    </div>
                    
                    <div class="text-center px-lg-5 pt-lg-4 p-4 w-100 mt-auto">
                        <p class="d-inline pr-3">¿No tienes una cuenta aún?</p><a href="registroUsuarios.jsp" class="text-light font-weight-bold text-decoration-none">¡Registrate!</a>
                    </div>
                    
                </div>
             
            </div>

        </section>
        


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
