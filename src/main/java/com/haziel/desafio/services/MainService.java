package com.haziel.desafio.services;

import com.haziel.desafio.models.Agente;
import com.haziel.desafio.models.DataDTO;
import com.haziel.desafio.repositories.AgenteRepository;
import com.haziel.desafio.repositories.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private RegiaoRepository regiaoRepository;

    @Autowired
    private AgenteRepository agenteRepository;

    public ResponseEntity<List<DataDTO>> saveData(List<DataDTO> list){

        try{
            list.forEach(data -> {
                Agente agente = agenteRepository.save(data.getAgente());
                data.getRegiaoList().forEach(regiao -> {
                    regiao.setAgente(agente);
                });
                data.setRegiaoList(regiaoRepository.saveAll(data.getRegiaoList()));
            });
            return ResponseEntity.ok(list);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }
}
