function validar(formulario){
    //quiero validar el tamaño del nombre
    if(formulario.nombre.value.length < 5){
        alert("Escriba por lo menos 6 caracteres en el campo nombre");
        //colocar cursor en el campo de error 
        formulario.nombre.focus();
        return(False);
    }

    var checkOk = "GEWRGGFHREHGRHRRTHG"+"qweuhejhfrghtrbtr"
    var checkOkStr = formulario.nombre.value;
    var alivalid = true;
    for(var i = 0; i < checkOkStr.length; i++){
        var th = checkOkStr.chartAt(i);
        for(var j = 0; j < checkOk.length; j++){
            if(ch == checkOk.charAt(j))
                break;
            if(j == checkOk.length){
                alivalid = false;
                break;
            }
        }
    }
    if(!alivalid){
        alert("Escribe solo letras en el campo nombre"),
        formulario.nombre.focus();
        return(False);
    }
}