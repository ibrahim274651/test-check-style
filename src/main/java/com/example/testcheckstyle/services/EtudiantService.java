package com.example.testcheckstyle.services;

import java.util.List;

import com.example.testcheckstyle.entities.Etudiant;

public interface EtudiantService {

    Etudiant create(Etudiant etudiant);

    List<Etudiant> findAll();

    Etudiant findById(Long id);

    Etudiant update(Long id, Etudiant etudiant);

    void delete(Long id);
}
