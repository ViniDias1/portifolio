package com.vinicius.portifolio.dto;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class ProjectDTO {

    @NonNull
    private final Long id;

    @NonNull
    private final String name;

    @NonNull
    private final String description;

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
