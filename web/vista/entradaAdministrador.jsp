<%-- 
    Document   : entradaAdministrador
    Created on : 13/10/2020, 07:52:18 PM
    Author     : Famil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Anton&family=Cuprum&family=Kaushan+Script&family=Pacifico&family=Sansita+Swashed:wght@600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="../css/bootstrap.css">     
        <link rel="stylesheet" href="../css/entradaAdministrador.css">        
        <title>Inicio</title>
    </head>
    <body>

    <body>

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

        <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" style="height: 600px;">
                <div class="carousel-item active" style="height: 600px;">
                    <img src="../imagenes/startup-593341_1280.jpg" class="d-block w-100" alt="..." style="height: 600px;">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>¡Bienvenido!</h5>
                        <p>Aquí puedes consultar los usuarios ingresados.</p>
                    </div>
                </div>
                <div class="carousel-item" style="height: 600px;">
                    <img src="../imagenes/office-4776820_1280.jpg" class="d-block w-100" alt="..."style="height: 600px;">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>También</h5>
                        <p style="color: black;">Puedes editar cada uno de tus empleados.</p>
                    </div>
                </div>
                <div class="carousel-item" style="height: 500px;">
                    <img src="../imagenes/money-2724241_1280.jpg" class="d-block w-100" alt="..."style="height: 600px;">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Por otro lado</h5>
                        <p>Baby Runner funcionará sobre ruedas.</p>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

        <div class="contenedor" style="padding-bottom: 90px;">
            <div class="contenedor-parrafos">
                <p class="contenedor-titulo" style="padding-top: 90px;">BABY RUNNER</p>
                <p class="contenedor-subtitulo">Señor dueño o administrador</p>            
                <p class="contenedor-texto">Esta plataforma fue diseñada</p>
                <p class="contenedor-texto">para manejar el inventario de su empresa</p>
            </div>
        </div>

        <footer>
            <div class="cont-footer">
                <div class="footer-items1">
                    <p>Inicio</p>
                    <p>Contacto</p>
                </div>
                <div class="footer-items">
                    <img src="../imagenes/logo.png" alt="" srcset=""
                         style="padding-top: 30px;">
                </div>
                <div class="footer-items1">
                    <i class="fab fa-facebook"></i><br>
                    <i class="fab fa-instagram-square"></i>
                    <i class="fab fa-twitter-square"></i>
                </div>
            </div>
        </footer>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
        <script
            src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
            integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>
        <script src="./js/bootstrap.js"></script>
        <script src="https://kit.fontawesome.com/2760202cbd.js" crossorigin="anonymous"></script>
    </body>
</html>

