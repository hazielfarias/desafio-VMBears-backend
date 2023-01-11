package com.haziel.desafio.services;

import com.haziel.desafio.models.Regiao;
import com.haziel.desafio.repositories.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegiaoService {

    @Autowired
    private RegiaoRepository regiaoRepository;

    public ResponseEntity<Regiao> postRegiao(Regiao regiao){
        try{
            return ResponseEntity.ok(regiaoRepository.save(regiao));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }
}
