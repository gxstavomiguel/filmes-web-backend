package com.example.filmesweb.controller;

import com.example.filmesweb.dto.FilmesSummaryDTO;
import com.example.filmesweb.service.FilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class FilmesController {

    @Autowired
    private FilmesService filmesService;

    @GetMapping("/popular")
    public List<FilmesSummaryDTO> getFilmesPopular(){
        return filmesService.getFilmesPopular();
    }

    @GetMapping("/search")
    public List<FilmesSummaryDTO> procurarFilmes(@RequestParam String query){
        return filmesService.getFilmesPorTitulo(query);
    }

}
