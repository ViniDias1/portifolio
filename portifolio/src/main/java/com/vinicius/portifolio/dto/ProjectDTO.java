package com.vinicius.portifolio.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProjectDTO {

    @NotNull(message = "O ID não pode ser nulo")
    private Long id;

    @NotBlank(message = "O nome do projeto é obrigatório")
    private String name;

    @NotBlank(message = "A descrição do projeto é obrigatória")
    private String description;

    public ProjectDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
