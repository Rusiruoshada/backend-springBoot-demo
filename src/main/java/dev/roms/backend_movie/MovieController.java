package dev.roms.backend_movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
    @GetMapping
    public String allMovies() {
        return "all movies";
    }

}
