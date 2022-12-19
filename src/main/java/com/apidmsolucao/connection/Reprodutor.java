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
public class Reprodutor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int idLote;
    private String setor;
    private String nomeAnimal;
    private String dataNascimento;
    private String situacao;
    private String pai;
    private String mae;
    private String raca;
    private String baia;
    private String lote;
    private String procedencia;
    private String origem;
    private String observacao;
    private double peso;
    private String dataAbatido;
    private double pesoAbatido;
    private String descricao;
    private String dataAcontecido;
    private double valorVendido;
    private double pesoFinal;


}
