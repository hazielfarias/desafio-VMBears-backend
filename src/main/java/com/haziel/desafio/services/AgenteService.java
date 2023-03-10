package com.haziel.desafio.services;

import com.haziel.desafio.models.Agente;
import com.haziel.desafio.repositories.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgenteService {
    @Autowired
    private AgenteRepository agenteRepository;

    public ResponseEntity<Agente> postAgente(Agente agente){
        Agente savedAgent;
        try {
            savedAgent = agenteRepository.save(agente);
            return ResponseEntity.ok(savedAgent);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

    public ResponseEntity<List<Agente>> getAll(){
        try{
            return ResponseEntity.ok(agenteRepository.findAll());
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

    public ResponseEntity<List<Agente>> postListAgente(List<Agente> list){
        try{
            return ResponseEntity.ok(agenteRepository.saveAll(list));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }
}
