
function validacionRegistro() {

    var resultado = 'Correcto';
    var numero_documento = $('#txt_numero_documento_reg').val();
    var nombre_usuario = $('#txt_nombre_usuario_reg').val();
    var contraseña = $('#txt_contraseña_reg').val();
    var telefono = $('#txt_telefono_reg').val();
    var direccion = $('#txt_direccion_reg').val();
    var correo = $('#txt_correo_reg').val();
    var barrio = $('#txt_barrio_reg').val();
    var estado_usuario = $('#txt_id_estado_usuario_Reg').val();
    var tipo_usuario = $('#txt_tipo_usuario_id_tipo_usuario_Reg').val();
    var tipo_documento = $('#txt_tipo_documento_id_tipo_documento_Reg').val();
    var tipo_genero = $('#txt_tipo_genero_id_tipo_genero_Reg').val();
    var ciudad = $('#txt_ciudad_id_ciudad_Reg').val();
    
    console.log('Información a validar');
    console.log('numero_documento:' + numero_documento);
    console.log('nombre_usuario:' + nombre_usuario);
    console.log('contraseña:' + contraseña);
    console.log('telefono:' + telefono);
    console.log('direccion:' + direccion);
    console.log('correo:' + correo);
    console.log('barrio:' + barrio);
    console.log('estado_usuario:' + estado_usuario);
    console.log('tipo_usuario:' + tipo_usuario);
    console.log('tipo_documento:' + tipo_documento);
    console.log('tipo_genero:' + tipo_genero);
    console.log('ciudad:' + ciudad);
    
    if (numero_documento == '') {
        alert('La identificación está vacia');
        resultado = 'Error';
    } else if(nombre_usuario == ''){
        alert('El nombre está vacio');
        resultado = 'Error';  
    } else if(contraseña == '') {
        alert('La contraseña está vacia');
        resultado = 'Error';  
    } else if (telefono == ''){
        alert('El telefono esta vacio');
        resultado = 'Error';
    } else if (direccion == '') {
        alert('La direccion está vacia');
        resultado = 'Error';       
    } else if (correo == '') {
        alert('El correo está vacio');
        resultado = 'Error';        
    } else if (barrio == '') {
        alert('El barrio está vacio');
        resultado = 'Error';        
    } else if (estado_usuario == '') {
        alert('El estado de usuarios está vacio');
        resultado = 'Error';       
    } else if (tipo_usuario == '') {
        alert('El tipo de usuario está vacio');
        resultado = 'Error';      
    } else if (tipo_documento == '') {
        alert('El tipo de documento está vacio');
        resultado = 'Error';     
    } else if (tipo_genero == '') {
        alert('El tipo genero está vacio');
        resultado = 'Error';         
    } else if (ciudad == '') {
        alert('La ciudad está vacia');
        resultado = 'Error';          
    
    } else if (isNaN(numero_documento)) {
        alert('La identificación debe ser numerica');
        resultado = 'Error';       
    } else if (isNaN(telefono)) {
        alert('El telefono debe ser numerico');
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

