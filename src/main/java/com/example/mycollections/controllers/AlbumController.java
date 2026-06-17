package com.example.mycollections.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mycollections.models.Album;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    private List<Album> albums = new ArrayList<>() {{
        add(new Album("Glass Houses", 1980, "Billy Joel", 10));
        add(new Album("Dark Side of the Moon", 1980, "Pink Floyd", 12));
        add(new Album("Hell Yeah KPop", 2025, "KPop Demon Hunters", 80));
    }};

    @GetMapping("/json")
    public List<Album> getAlbums() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbum() {
        String html = """
 <html>
    <body>
        <ul>
 """;

        for (Album album : albums) {
            html += "<li>" + album.getName() + ": " + album.getYear() + ": " + album.getArtist() + ": " + album.getTracks() + "</li>";
        }

        html += """
        </ul>
    </body>
 </html>""";

        return html;
    }
}

