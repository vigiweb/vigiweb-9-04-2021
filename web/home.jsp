<%-- 
    Document   : home
    Created on : 13/10/2020, 07:05:41 AM
    Author     : Famil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Anton&family=Cuprum&family=Kaushan+Script&family=Pacifico&family=Sansita+Swashed:wght@600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./css/bootstrap.css">     
        <link rel="stylesheet" href="./css/home.css">        
        <title>Inicio</title>
    </head>
    <body>

    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top">
            <a class="navbar-brand" href="home.jsp">Inicio</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <!--<li class="nav-item active">
                        <a class="nav-link" href="#">CATALOGO</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">CONTACTO</a>
                    </li>-->
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <button class="btn btn-info my-2 my-sm-0 mr-3" type="button"><a href="./vista/inicioSesion.jsp" class="text-decoration-none" style="color: white">Iniciar sesión</a></button>
                    <!--<button class="btn btn-outline-info my-2 my-sm-0" type="button"><a href="./vista/usuarios.jsp" class="text-decoration-none" style="color: white">Registrarse</a></button>-->
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
                    <img src="./imagenes/colga (2).jpeg" class="d-block w-100" alt="..."style="height: 600px;">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Personalización</h5>
                        <p>Total personalización de tus prendas.</p>
                    </div>
                </div>
                <div class="carousel-item" style="height: 600px;">
                    <img src="./imagenes/crib-890565_1280.jpg" class="d-block w-100" alt="..."style="height: 600px;">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Desde el inicio</h5>
                        <p>Cada una de las prendas son procesadas desde el comienzo.</p>
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
        
        <div class="contenedor">
            <div class="contenedor-parrafos">
                <p class="contenedor-titulo" style="padding-top: 90px;">BABY RUNNER</p>
                <p class="contenedor-subtitulo">Ropita para tu bebé</p>            
                <p class="contenedor-texto">Empresa dedicada a la elaboración</p>
                <p class="contenedor-texto">de prendas para bebé</p>
            </div>
            <div class="contenedor-img"><img src="./imagenes/booties-2047596_640-removebg-preview.png"></div>
        </div>
        
         <footer>
            <div class="cont-footer">
                <div class="footer-items1">
                    <p>Inicio</p>
                    <p>Contacto</p>
                </div>
                <div class="footer-items">
                    <img src="./imagenes/logo.png" alt="" srcset=""
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
