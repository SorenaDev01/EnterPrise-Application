package org.example.taakherex.service;

import org.example.taakherex.Locatie;
import org.example.taakherex.repository.LocatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocatieService {
    
    @Autowired
    private LocatieRepository locatieRepository;
    
    public List<Locatie> getAllLocaties() {
        return locatieRepository.findAll();
    }
    
    public Optional<Locatie> getLocatieById(Long id) {
        return locatieRepository.findById(id);
    }
    
    public Locatie saveLocatie(Locatie locatie) {
        return locatieRepository.save(locatie);
    }
} 