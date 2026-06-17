package com.example.mycollections.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mycollections.models.Movie;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private List<Movie> movies = new ArrayList<>() {{
        add(new Movie("Project Hail Mary", "Phil Lord", 2026, 156));
        add(new Movie("Tarzan", "Kevin Lima, Chris Buck", 1999, 78));
        add(new Movie("Dreamgirls", "Bill Condon", 2006, 130));
    }};

    @GetMapping("/json")
    public List<Movie> getMovies() {
        return movies;
    }

    @GetMapping("/html")
    public String getMovie() {
        String html = """
 <html>
    <body>
        <ul>
 """;

        for (Movie movie : movies) {
            html += "<li>" + movie.getName() + ": " + movie.getYear() + ": " + movie.getDirector() + ": " + movie.getRunTime() + "</li>";
        }

        html += """
        </ul>
    </body>
 </html>""";

        return html;
    }
}
