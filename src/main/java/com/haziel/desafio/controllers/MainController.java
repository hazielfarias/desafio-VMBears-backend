package com.haziel.desafio.controllers;

import com.haziel.desafio.models.DataDTO;
import com.haziel.desafio.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class MainController {

    @Autowired
    private MainService mainService;

    @PostMapping
    public ResponseEntity<List<DataDTO>> saveAllData(@RequestBody List<DataDTO> list){
        return mainService.saveData(list);
    }
}
