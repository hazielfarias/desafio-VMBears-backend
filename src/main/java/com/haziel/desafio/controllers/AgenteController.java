package com.haziel.desafio.controllers;

import com.haziel.desafio.models.Agente;
import com.haziel.desafio.services.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agente")
public class AgenteController {

    @Autowired
    private AgenteService agenteService;

    @PostMapping
    public ResponseEntity<Agente> postAgente(@RequestBody Agente agente){
        return agenteService.postAgente(agente);
    }

    @GetMapping
    public ResponseEntity<List<Agente>> getAll(){
        return agenteService.getAll();
    }
}
