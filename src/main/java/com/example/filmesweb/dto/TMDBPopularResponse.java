package com.example.filmesweb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TMDBPopularResponse {

    private int page;
    private List<FilmesSummaryDTO> results;

    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("total_results")
    private int totalResults;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<FilmesSummaryDTO> getResults() {
        return results;
    }

    public void setResults(List<FilmesSummaryDTO> results) {
        this.results = results;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}

