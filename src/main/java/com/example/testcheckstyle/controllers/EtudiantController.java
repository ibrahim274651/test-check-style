package com.example.testcheckstyle.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

import com.example.testcheckstyle.entities.Etudiant;
import com.example.testcheckstyle.services.EtudiantService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/etudiants")
@RequiredArgsConstructor
public class EtudiantController {

    private final EtudiantService etudiantService;

    @PostMapping
    public Etudiant create(@RequestBody Etudiant etudiant) {
        return etudiantService.create(etudiant);
    }

    @GetMapping
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

    @GetMapping("/{id}")
    public Etudiant findById(@PathVariable Long id) {
        return etudiantService.findById(id);
    }

    @PutMapping("/{id}")
    public Etudiant update(
            @PathVariable Long id,
            @RequestBody Etudiant etudiant
    ) {
        return etudiantService.update(id, etudiant);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        etudiantService.delete(id);
    }
}
