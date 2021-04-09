function validarfactura() {

    var resultado = 'Correcto';
    var fecha = document.getElementById("txt_fecha_factura_Reg").value;
    var usuarios = document.getElementById("txt_usuarios_id_usuarios_Reg").value;
    
    
    console.log("-- Informacion a validar -- ");
    console.log("fecha : " + fecha);
    console.log("usuarios : " + usuarios);
    

    if (fecha == '') {

        alert("La fecha no puede estar vacia");
        resultado = 'Error';
    }
    if (usuarios == '') {

        alert("El usuario no puede estar vacia");
        resultado = 'Error';
    }
   
    $('#txt_Bandera_Reg').val(resultado);
    console.log('Resultado:' + $('#txt_Bandera_Reg').val());
    if (resultado == 'Correcto') {

        return true;

    } else {

        return false;
    }

}

function setEstadoUsuario(x){
    $('#txt_usuarios_id_usuarios_Reg').val(x);
    console.log("valor : " + x);   
}

function realizarBusqueda() {
    var textoBuscado = $('#txt_Id_Consultado').val();
    console.log("Texto: " + $('#txt_Id_Consultado').val());
    window.location.href = '/vigiwebB/vista/factura.jsp?buscando=' + textoBuscado.trim() + '&';
}

function SetIdConsulta(x) {
    $('#txt_Id_Consultado').val(x);
    console.log("valor : " + x);
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

function DefinirFoco() {
    document.getElementById("txt_Id_Consultado").focus();
}

$('#txt_Id_Consultado').change(function () {
    console.log("Texto" + $('#txt_Id_Consultado').val());
});







