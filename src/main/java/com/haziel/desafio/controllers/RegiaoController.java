package com.haziel.desafio.controllers;

import com.haziel.desafio.models.Regiao;
import com.haziel.desafio.services.RegiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regiao")
public class RegiaoController {

    @Autowired
    private RegiaoService regiaoService;

    @PostMapping
    public ResponseEntity<Regiao> postRegiao(@RequestBody Regiao regiao){
        return regiaoService.postRegiao(regiao);
    }

    @PostMapping("/list")
    public ResponseEntity<List<Regiao>> postListRegiao(@RequestBody List<Regiao> list){
        return regiaoService.postListRegiao(list);
    }

    @GetMapping
    public ResponseEntity<List<Regiao>> getAll(){
        return regiaoService.getAll();
    }
}
