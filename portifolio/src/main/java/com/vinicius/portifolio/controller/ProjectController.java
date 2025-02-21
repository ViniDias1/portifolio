package com.vinicius.portifolio.controller;

import com.vinicius.portifolio.dto.ProjectDTO;
import com.vinicius.portifolio.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<ProjectDTO> getProjects() {
        return projectService.getAllProjects();
    }

    @PostMapping
    public ResponseEntity<ProjectDTO> createProject(@RequestBody ProjectDTO project) {
        ProjectDTO newProject = projectService.addProject(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProject);
    }
}