package br.com.dialeto.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dialeto.maven.model.tb_usuarios;
import br.com.dialeto.maven.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@PostMapping
	public tb_usuarios salvarPessoa(@RequestBody tb_usuarios usuario)	{
		return usuarioRepository.save(usuario);
	}
	
	@GetMapping
	public List<tb_usuarios> buscarTodas()	{
		return usuarioRepository.findAll();
	}

}
