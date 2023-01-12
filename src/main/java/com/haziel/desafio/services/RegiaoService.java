package com.haziel.desafio.services;

import com.haziel.desafio.models.Regiao;
import com.haziel.desafio.repositories.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegiaoService {

    @Autowired
    private RegiaoRepository regiaoRepository;

    public ResponseEntity<Regiao> postRegiao(Regiao regiao){
        try{
            return ResponseEntity.ok(regiaoRepository.save(regiao));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

    public ResponseEntity<List<Regiao>> postListRegiao(List<Regiao> list){
        List<Regiao> allSaved = new ArrayList<>();
        try{
            list.forEach(regiao->allSaved.add(regiaoRepository.save(regiao)));
            return ResponseEntity.ok(allSaved);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

    public ResponseEntity<List<Regiao>> getAll(){
        try{
            return ResponseEntity.ok(regiaoRepository.findAll());
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

}
