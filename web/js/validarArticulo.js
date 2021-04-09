function validarArticulos() {

    var resultado = 'Correcto';
    var nombre_articulo = $('#txt_nombre_articulo_Reg').val();
    var referencia_articulo = $('#txt_referencia_articulo_reg').val();
    var precio_articulo = $('#txt_precio_articulo_reg').val();
    var cantidad_articulo = $('#txt_cantidad_reg').val();
    var iva_articulo = $('#txt_iva_reg').val();
    var descripcion_articulo = $('#txt_descripcion_reg').val();
    var estado_articulo_id_estado_articulo = $('#txt_estado_reg').val();
    var proveedor_id_proveedor = $('#txt_proveedor_reg').val();

    console.log('Información a validar');
    console.log('nombre_articulo: ' + nombre_articulo + ".");
    console.log('referencia_articulo: ' + referencia_articulo) + ".";
    console.log('precio_articulo: ' + precio_articulo + ".");
    console.log('cantidad_articulo: ' + cantidad_articulo + ".");
    console.log('iva_articulo: ' + iva_articulo + ".");
    console.log('descripcion_articulo: ' + descripcion_articulo + ".");
    console.log('estado_articulo_id_estado_articulo: ' + estado_articulo_id_estado_articulo + ".");
    console.log('proveedor_id_proveedor: ' + proveedor_id_proveedor + ".");

    if (nombre_articulo == '') {
        alert('El nombre de artículo no puede estar vacio');
        resultado = 'Error';
    } else if (referencia_articulo == '') {
        alert('La referencia de artícuño no puede estar vacia');
        resultado = 'Error';
    } else if (precio_articulo == '') {
        alert('El presio del artículo no puede estar vacio');
        resultado = 'Error';
    } else if (cantidad_articulo == '') {
        alert('La cantidad del artículo no puede estar vacia');
        resultado = 'Error';
    } else if (iva_articulo == '') {
        alert('El iva del artículo no puede estar vacio');
        resultado = 'Error';
    } else if (descripcion_articulo == '') {
        alert('La descripción del artículo no puede estar vacia');
        resultado = 'Error';
    } else if (estado_articulo_id_estado_articulo == '') {
        alert('El estado del artículo no puede estar vacio');
        resultado = 'Error';
    } else if (proveedor_id_proveedor == '') {
        alert('El proveedor del artículo no puede estar vacio');
        resultado = 'Error';

    } else if (isNaN(referencia_articulo)) {
        alert('La referencia del artículo debe ser numérico');
        resultado = 'Error';

    } else {
        resultado = 'Correcto';
    }
    $('#txt_bandera_reg').val(resultado);
    console.log('Resultado:' + $('#txt_bandera_reg').val());
    if (resultado == 'Correcto') {
        return true;
    } else {
        return false;
    }
}

function setEstado(x){
    $('#txt_estado_reg').val(x);
    console.log("valor : " + x);   
}

function setProvedor(x){
    $('#txt_proveedor_reg').val(x);
    console.log("valor : " + x);   
}

function SetIdConsulta(x) {
    $('#txt_Id_Consultado').val(x);
    console.log("valor : " + x);
}

function realizarBusqueda() {
    var textoBuscado = $('#txt_Id_Consultado').val();
    console.log("Texto: " + $('#txt_Id_Consultado').val());
    window.location.href = '/vigiwebB/vista/articulos.jsp?buscando=' + textoBuscado.trim() + '&';
}

function visualizaOculta(Dato) {

    console.log("Viene " + Dato);
    if (Dato == "Registrar") {

        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');

    } else if (Dato == "Actualizar") {

        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');

    } else if (Dato == "Listado") {

        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }

}




