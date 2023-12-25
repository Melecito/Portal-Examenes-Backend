package com.BingoGranBuda_Ok_Backend;

import com.BingoGranBuda_Ok_Backend.entidades.Rol;
import com.BingoGranBuda_Ok_Backend.entidades.Usuario;
import com.BingoGranBuda_Ok_Backend.entidades.UsuarioRol;
import com.BingoGranBuda_Ok_Backend.excepciones.UsuariosFoundException;
import com.BingoGranBuda_Ok_Backend.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BingoGranBuda_Ok_BackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(BingoGranBuda_Ok_BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*try{

			Usuario usuario = new Usuario();

			usuario.setNombre("Ahimelec");
			usuario.setApellido("Chia");
			usuario.setUsername("AhimelecC");
			usuario.setPassword(bCryptPasswordEncoder.encode("AC123"));
			usuario.setEmail("chia@gmail.com");
			usuario.setTelefono("320899111");
			usuario.setPerfil("foto.png");

			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setNombre("ADMIN");


			Set<UsuarioRol> usuarioRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuarioRoles.add(usuarioRol);

			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuarioRoles);
			System.out.println(usuarioGuardado.getUsername());

		}catch (UsuariosFoundException exception){
			exception.printStackTrace();
		}*/


	}
}
