package com.BingoGranBuda_Ok_Backend.servicios.impl;


import com.BingoGranBuda_Ok_Backend.excepciones.UsuariosFoundException;
import com.BingoGranBuda_Ok_Backend.repositorios.RolRepository;
import com.BingoGranBuda_Ok_Backend.repositorios.UsuarioRepository;
import com.BingoGranBuda_Ok_Backend.entidades.Usuario;
import com.BingoGranBuda_Ok_Backend.entidades.UsuarioRol;
import com.BingoGranBuda_Ok_Backend.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if (usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new UsuariosFoundException("El usuario ya esta presente");
        }
        else {
            for (UsuarioRol usuarioRol:usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);

    }
}
