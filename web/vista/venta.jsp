<%-- 
    Document   : venta
    Created on : 25/02/2021, 07:58:04 PM
    Author     : Famil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="col-sm-5">
                <div class="card">
                    <form action="Controlador" method="post" >
                        <div class="card-body">
                            <div class="form-group">
                                <label>Datos del usuario</label>  
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="identificacionUsuario" class="form-control" placeholder="Identificacion"/>
                                    <input type="submit" name="accion" value="BuscarUsuario" class="btn btn-outline-warning">
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" name="nombreUsuario" class="form-control">
                                </div>                                                        
                            </div>
                            <label>Datos del artículo</label> 
                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="identificacionProducto" class="form-control" placeholder="Código"/>
                                    <input type="submit" name="accion" value="Buscar" class="btn btn-outline-warning">
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" name="nombreProducto" class="form-control">
                                </div>                                                        
                            </div>

                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="Precio" class="form-control" placeholder="$"/>
                                </div>
                                <div class="col-sm-3">
                                    <input type="number" name="Cantidad" class="form-control" placeholder="#">
                                </div>   
                                <div class="col-ms-3">
                                    <input type="text" name="Stock" class="form-control" placeholder="Stock">                                
                                </div>
                            </div>
                            <div class="form-group">
                                <center><input type="submit" name="accion" value="Agregar" class="btn btn-outline-warning"></center> 
                            </div>

                        </div>
                    </form>
                </div>
            </div>  
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-5 ml-auto">
                            <label>Numero de documento</label>
                            <input type="text" name="NroSerie" class="form-control">
                        </div>
                        <br>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Nro</th>
                                    <th>Codigo</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                    <th>Cantidad</th>
                                    <th>Subtotal</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    
                                </tr>                                                             
                            </tbody>
                        </table>
                    </div>
                    <div class="card-footer">
                        <div>
                            <br>
                            <input type="submit" name="accion" value="Generar Venta" class="btn btn-info">
                            <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">      
                        </div>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
