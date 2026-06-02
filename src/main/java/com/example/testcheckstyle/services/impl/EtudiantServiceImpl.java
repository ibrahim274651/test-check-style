package com.example.testcheckstyle.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.testcheckstyle.entities.Etudiant;
import com.example.testcheckstyle.repositories.EtudiantRepository;
import com.example.testcheckstyle.services.EtudiantService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant create(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(Long id) {
        return etudiantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Étudiant introuvable avec id : " + id));
    }

    @Override
    public Etudiant update(Long id, Etudiant etudiant) {
        Etudiant existingEtudiant = findById(id);

        existingEtudiant.setNom(etudiant.getNom());
        existingEtudiant.setClasse(etudiant.getClasse());

        return etudiantRepository.save(existingEtudiant);
    }

    @Override
    public void delete(Long id) {
        Etudiant existingEtudiant = findById(id);
        etudiantRepository.delete(existingEtudiant);
    }
}
