package com.navestec.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.navestec.course.model.entity.Contato;
import com.navestec.course.model.repository.ContatoRepository;

@SpringBootApplication
public class Application {
	
	@Bean
	public CommandLineRunner commandLineRunner(@Autowired ContatoRepository repository) {
		return args -> {
			Contato contato = new Contato();
			contato.setNome("Teste");
			contato.setEmail("teste@teste.com");
			contato.setFavorito(false);
			
			repository.save(contato);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
