package dev.roms.backend_movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BackendMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendMovieApplication.class, args);
	}

}
