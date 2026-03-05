package com.sistema.examenes.excepciones;

public class UsuariosFoundException extends Exception {

    public  UsuariosFoundException() {
        super("El usuario con ese username ya existe en la base de datos, vuelva a intentarlo ");
    }

    public UsuariosFoundException(String mensaje){

        super(mensaje);
    }
}
