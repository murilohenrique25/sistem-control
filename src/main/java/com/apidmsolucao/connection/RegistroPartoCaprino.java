package com.apidmsolucao.connection;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class RegistroPartoCaprino {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nomeMatriz;
    private String nomeReprodutor;
    private String data;
    private int quantidade;
    private int quantMachos;
    private int quantFemeas;
    private String problema;
    private String tipoInseminacao;
    private double totalPartos;


}
