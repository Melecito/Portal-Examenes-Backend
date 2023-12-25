package com.BingoGranBuda_Ok_Backend.servicios;

import com.BingoGranBuda_Ok_Backend.entidades.Usuario;
import com.BingoGranBuda_Ok_Backend.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {


    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);

}
