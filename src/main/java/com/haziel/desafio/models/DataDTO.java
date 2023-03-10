package com.haziel.desafio.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataDTO {

    private Agente agente;
    private List<Regiao> regiaoList;


}
