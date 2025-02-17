package com.vinicius.portifolio.controller;

import com.vinicius.portifolio.model.dto.ProjectDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping
    public List<ProjectDTO> getProjects() {
        return List.of(
            new ProjectDTO("Meu Projeto TESTE", "Descrição do projeto TESTE", "Java, Spring Boot TESTE", "https://github.com/exemplo TESTE"),
            new ProjectDTO("Projeto 2 TESTE", "Outro projeto interessante TESTE", "Angular, Node.js TESTE", "https://github.com/projeto2 TESTE")
        );
    }

}



