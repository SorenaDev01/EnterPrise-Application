package org.example.taakherex.service;

import org.example.taakherex.Evenement;
import org.example.taakherex.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementService {
    
    @Autowired
    private EvenementRepository evenementRepository;
    
    public List<Evenement> getLaatste10Evenementen() {
        return evenementRepository.findTop10ByOrderByTijdstipDesc();
    }
    
    public Optional<Evenement> getEvenementById(Long id) {
        return evenementRepository.findById(id);
    }
    
    public Evenement saveEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }
    
    public List<Evenement> getAllEvenementen() {
        return evenementRepository.findAll();
    }
} 