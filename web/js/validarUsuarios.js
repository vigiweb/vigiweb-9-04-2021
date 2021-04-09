
function validarUsuarios() {

    var resultado = 'Correcto';
    var numero_documento = $('#txt_numero_documento_Reg').val();
    var nombre_usuario = $('#txt_nombre_usuario_reg').val();
    var contraseña = $('#txt_contraseña_reg').val();
    var telefono = $('#txt_telefono_reg').val();
    var direccion = $('#txt_direccion_reg').val();
    var correo = $('#txt_correo_reg').val();
    var barrio = $('#txt_barrio_reg').val();
    var estado_usuario_id_estado_usuario = $('#txt_estado_usuario_id_estado_usuario_reg').val();
    var tipo_usuario_id_tipo_usuario = $('#txt_tipo_usuario_id_tipo_usuario_reg').val();
    var tipo_documento_id_tipo_documento = $('#txt_tipo_documento_id_tipo_documento_reg').val();
    var tipo_genero_id_tipo_genero = $('#txt_tipo_genero_id_tipo_genero_reg').val();
    var ciudad_id_ciudad = $('#txt_ciudad_id_ciudad_reg').val();

    console.log('Información a validar');
    console.log('numero_documento: ' + numero_documento + ".");
    console.log('nombre_usuario: ' + nombre_usuario) + ".";
    console.log('contraseña: ' + contraseña + ".");
    console.log('telefono: ' + telefono + ".");
    console.log('direccion: ' + direccion + ".");
    console.log('correo: ' + correo + ".");
    console.log('barrio: ' + barrio + ".");
    console.log('estado_usuario_id_estado_usuario: ' + estado_usuario_id_estado_usuario + ".");
    console.log('tipo_usuario_id_tipo_usuario: ' + tipo_usuario_id_tipo_usuario + ".");
    console.log('tipo_documento_id_tipo_documento: ' + tipo_documento_id_tipo_documento + ".");
    console.log('tipo_genero_id_tipo_genero: ' + tipo_genero_id_tipo_genero + ".");
    console.log('ciudad_id_ciudad: ' + ciudad_id_ciudad + ".");

    if (numero_documento == '') {
        alert('El número de identificación no puede estar vacio');
        resultado = 'Error';
    } else if (nombre_usuario == '') {
        alert('El nombre no puede estar vacio');
        resultado = 'Error';
    } else if (contraseña == '') {
        alert('La contraseña no puede estar vacia');
        resultado = 'Error';
    } else if (telefono == '') {
        alert('El número telefónico no puede estar vacio');
        resultado = 'Error';
    } else if (direccion == '') {
        alert('La dirección no puede estar vacia');
        resultado = 'Error';
    } else if (correo == '') {
        alert('El correo no puede estar vacio');
        resultado = 'Error';
    } else if (barrio == '') {
        alert('El barrio no puede estar vacio');
        resultado = 'Error';
    } else if (estado_usuario_id_estado_usuario == '') {
        alert('El estado de usuario no puede estar vacio');
        resultado = 'Error';
    } else if (tipo_usuario_id_tipo_usuario == '') {
        alert('El tipo de usuario no puede estar vacio');
        resultado = 'Error';
    } else if (tipo_documento_id_tipo_documento == '') {
        alert('El tipo documento no puede estar vacio');
        resultado = 'Error';
    } else if (tipo_genero_id_tipo_genero == '') {
        alert('El tipo género no puede estar vacio');
        resultado = 'Error';
    } else if (ciudad_id_ciudad == '') {
        alert('La ciudad no puede estar vacia');
        resultado = 'Error';


    } else if (isNaN(telefono)) {
        alert('El número telefónico debe ser numérico');
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

function setIdTipoUsuario(x){
    $('#txt_id_tipo_usuario_Reg').val(x);
    console.log("valor : " + x);   
}

function setCiudad(x){
    $('#txt_ciudad_id_ciudad_reg').val(x);
    console.log("valor : " + x);   
}

function setTipoDocumento(x){
    $('#txt_tipo_documento_id_tipo_documento_reg').val(x);
    console.log("valor : " + x);   
}

function setTipoGenero(x){
    $('#txt_tipo_genero_id_tipo_genero_reg').val(x);
    console.log("valor : " + x);   
}

function setEstadoUsuario(x){
    $('#txt_estado_usuario_id_estado_usuario_reg').val(x);
    console.log("valor : " + x);   
}

$('#txt_Id_Consultado').change(function(){
console.log("Texto" + $('#txt_Id_Consultado').val());
});







