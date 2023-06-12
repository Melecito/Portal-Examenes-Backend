package com.sistema.examenes.excepciones;

public class UsuariosNotFoundException  extends  Exception{

    public  UsuariosNotFoundException() {
        super("El usuario con ese username no existe en la base de datos, vuelva a intentarlo ");
    }

    public UsuariosNotFoundException(String mensaje){
        super(mensaje);
    }
}
