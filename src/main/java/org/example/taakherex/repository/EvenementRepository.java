package org.example.taakherex.repository;

import org.example.taakherex.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    List<Evenement> findTop10ByOrderByTijdstipDesc();
} 