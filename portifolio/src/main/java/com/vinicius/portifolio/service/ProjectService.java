package com.vinicius.portifolio.service;

import com.vinicius.portifolio.dto.ProjectDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private final List<ProjectDTO> projects = new ArrayList<>();

    public ProjectService() {
        projects.add(new ProjectDTO(1L, "teste1", "teste1"));
        projects.add(new ProjectDTO(2L, "teste2", "teste2"));
    }

    public List<ProjectDTO> getAllProjects() {
        return projects;
    }

    public ProjectDTO addProject(ProjectDTO project) {
        projects.add(project);
        return project;
    }
}

