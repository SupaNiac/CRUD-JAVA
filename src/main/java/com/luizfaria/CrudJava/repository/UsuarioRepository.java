package com.luizfaria.CrudJava.repository;

import com.luizfaria.CrudJava.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
