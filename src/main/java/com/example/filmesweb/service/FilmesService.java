package com.example.filmesweb.service;

import com.example.filmesweb.dto.FilmesSummaryDTO;
import com.example.filmesweb.dto.TMDBPopularResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class FilmesService {

    private final String API_KEY = "1e367ba6a8c454679856b3944df84439";
    private final String BASE_URL = "https://api.themoviedb.org/3";

    @Autowired
    private RestTemplate restTemplate;

    public List<FilmesSummaryDTO> getFilmesPopular() {
        String url = BASE_URL + "/movie/popular?api_key=" + API_KEY + "&language=pt-BR&page=1";
        TMDBPopularResponse response = restTemplate.getForObject(url, TMDBPopularResponse.class);

        return response.getResults();
    }

    public List<FilmesSummaryDTO> getFilmesPorTitulo(String query){
        String url = BASE_URL + "/search/movie?api_key=" + API_KEY + "&language=pt-BR&page=1&query=" + query;
        TMDBPopularResponse response = restTemplate.getForObject(url, TMDBPopularResponse.class);

        return response.getResults();
    }

}
