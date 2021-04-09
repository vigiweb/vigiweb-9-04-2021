
function validarProveedores() {

    var resultado = 'Correcto';
    var pr_nombre = $('#txt_pr_nombre_Reg').val();
    var pr_tipo = $('#txt_pr_tipo_reg').val();
    var pr_telefono = $('#txt_pr_telefono_reg').val();
    var pr_direccion = $('#txt_pr_direccion_reg').val();
    var pr_correo = $('#txt_pr_correo_reg').val();
    
    console.log('Información a validar');
    console.log('pr_nombre: ' + pr_nombre + ".");
    console.log('pr_tipo: ' + pr_tipo) + ".";
    console.log('pr_telefono: ' + pr_telefono + ".");
    console.log('pr_direccion: ' + pr_direccion + ".");
    console.log('pr_correo: ' + pr_correo + ".");
    
    if (pr_nombre == '') {
        alert('El nombre del proveedor no puede estar vacio');
        resultado = 'Error';
    } else if(pr_tipo == ''){
        alert('El tipo del proveedor no puede estar vacio');
        resultado = 'Error';  
    } else if(pr_telefono == '') {
        alert('El telefono del proveedor no puede estar vacio');
        resultado = 'Error';  
    } else if (pr_direccion == ''){
        alert('El dirección del proveedor no puede estar vacio');
        resultado = 'Error';
    } else if (pr_correo == '') {
        alert('El correo del proveedor no puede estar vacio');
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
function SetIdConsulta(x) {
    $('#txt_Id_Consultado').val(x);
    console.log("valor : " + x);
}

function realizarBusqueda() {
    var textoBuscado = $('#txt_Id_Consultado').val();
    console.log("Texto: " + $('#txt_Id_Consultado').val());
    window.location.href = '/vigiwebB/vista/proveedores.jsp?buscando=' + textoBuscado.trim() + '&';
}



