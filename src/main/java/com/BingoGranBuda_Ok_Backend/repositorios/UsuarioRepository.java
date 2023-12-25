package com.BingoGranBuda_Ok_Backend.repositorios;

import com.BingoGranBuda_Ok_Backend.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);
}
