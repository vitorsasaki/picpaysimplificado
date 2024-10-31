package com.picpaysimplificado.picpaysimplificado.repository;

import com.picpaysimplificado.picpaysimplificado.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioRepository, Long> {

    Optional<Usuario> findByCpfCnpj(Long aLong);
}
