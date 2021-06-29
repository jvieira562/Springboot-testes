package br.com.dialeto.maven.controller;

/*import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavegadorController {
	
	@GetMapping("/navegador")
	//@Cacheable("Navegador")
	public String Navegador()	{
		return "Navegador On!";
	}

}
