package com.haziel.desafio.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "agente_id")
    private Agente agente;

    private String geracao;
    private String compra;
    @Column(name = "region_code")
    private String regionCode;

}
