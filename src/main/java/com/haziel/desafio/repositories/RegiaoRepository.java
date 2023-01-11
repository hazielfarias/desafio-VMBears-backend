package com.haziel.desafio.repositories;

import com.haziel.desafio.models.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Integer> {
}
