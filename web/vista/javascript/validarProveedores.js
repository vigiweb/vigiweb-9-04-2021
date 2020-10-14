/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var Buscar;

function validarProveedores() {

    var resultado = 'Correcto';
    var pr_nombre = $('#txt_nombre_reg').val();
    var pr_tipo = $('#txt_tipo_reg').val();
    var pr_telefono = $('#txt_telefono_reg').val();
    var pr_direccion = $('#txt_direccion_reg').val();
    var pr_correo = $('#txt_correo_reg').val();
    
    console.log('Información a validar');
    console.log('numero_documento:' + pr_nombre);
    console.log('nombre_usuario:' + pr_tipo);
    console.log('contraseña:' + pr_telefono);
    console.log('telefono:' + pr_direccion);
    console.log('direccion:' + pr_correo);
    
    if (pr_nombre == '') {
        alert('La identificación está vacia');
        resultado = 'Error';
    } else if(pr_tipo == ''){
        alert('El nombre está vacio');
        resultado = 'Error';  
    } else if(pr_telefono == '') {
        alert('La contraseña está vacia');
        resultado = 'Error';  
    } else if (pr_direccion == ''){
        alert('El telefono esta vacio');
        resultado = 'Error';
    } else if (pr_correo == '') {
        alert('La direccion está vacia');
        resultado = 'Error';       
    
    
    } else if (isNaN(pr_telefono)) {
        alert('La identificación debe ser numerica');
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


