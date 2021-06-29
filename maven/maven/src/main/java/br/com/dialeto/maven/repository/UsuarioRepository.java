package br.com.dialeto.maven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dialeto.maven.model.tb_usuarios;

public interface UsuarioRepository extends JpaRepository<tb_usuarios, Long> {
		
}
