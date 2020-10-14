<%-- 
    Document   : proveedores
    Created on : 13/10/2020, 06:59:45 PM
    Author     : Famil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="registroProveedores" method="post" onsubmit="return validarProveedores())">
            <div class="form-group mb-4">
                <label for="exampleInputEmail1" class="form-label font-weight-bold ">Nombre</label>
                <input type="text" name="pr_nombre" class="form-control bg-dark-x border-0" placeholder="Ingrese el nombre del proveedor" id="txt_nombre_reg" aria-describedby="emailHelp">
            </div>
            <div class="form-group mb-4">
                <label for="exampleInputPassword1" class="form-label font-weight-bold">Tipo</label>
                <input type="text" name="pr_tipo" class="form-control bg-dark-x border-0" placeholder="Ingrese el tipo de proveedor" id="txt_tipo_reg">
            </div>
            <div class="form-group mb-4">
                <label for="exampleInputEmail1" class="form-label font-weight-bold ">Telefono</label>
                <input type="text" name="pr_telefono" class="form-control bg-dark-x border-0" placeholder="Ingrese el telefono del proveedor" id="txt_telefono_reg" aria-describedby="emailHelp">
            </div>
            <div class="form-group mb-4">
                <label for="exampleInputEmail1" class="form-label font-weight-bold ">Dirección</label>
                <input type="text" name="pr_direccion" class="form-control bg-dark-x border-0" placeholder="Ingrese la dirección del proveedor" id="txt_direccion_reg" aria-describedby="emailHelp">
            </div>
            <div class="form-group mb-4">
                <label for="exampleInputEmail1" class="form-label font-weight-bold ">Correo</label>
                <input type="text" name="pr_correo" class="form-control bg-dark-x border-0" placeholder="Ingrese el correo del proveedor" id="txt_correo_reg" aria-describedby="emailHelp">
            </div>
            <div id="controlRegistro" class="bd-example d-none">
                <input id="txt_bandera_reg" type="text" class="form-control d-none" name="banderaRegistro">
            </div>

            <button type="submit" class="btn btn-primary w-100">Registrar</button>
        </form>
        <script src="vista/javascript/validarProveedores.js"></script>
    </body>
</html>
