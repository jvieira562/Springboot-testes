package br.com.dialeto.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching

public class MavenApplication {


	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);
	}

}
