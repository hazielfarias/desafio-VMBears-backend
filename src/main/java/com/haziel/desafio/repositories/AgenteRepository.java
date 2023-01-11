package com.haziel.desafio.repositories;

import com.haziel.desafio.models.Agente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenteRepository extends JpaRepository<Agente, Integer> {
}
