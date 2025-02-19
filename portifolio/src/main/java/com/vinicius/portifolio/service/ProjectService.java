package com.vinicius.portifolio.service;

import com.vinicius.portifolio.dto.ProjectDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private final List<ProjectDTO> projects = new ArrayList<>();

    public ProjectService() {
        projects.add(new ProjectDTO(1L, "Portfolio Web", "Um site pessoal para exibir meus projetos"));
        projects.add(new ProjectDTO(2L, "API de Gerenciamento", "Uma API para controle de tarefas"));
    }

    public List<ProjectDTO> getAllProjects() {
        return projects;
    }

    public ProjectDTO addProject(ProjectDTO project) {
        projects.add(project);
        return project;
    }
}

