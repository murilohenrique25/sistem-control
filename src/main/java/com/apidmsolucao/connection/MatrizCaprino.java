package com.apidmsolucao.connection;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class MatrizCaprino {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int idLote;
    private String setor;
    private String nome;
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
    private String idadePrimeiroParto;
    private double pesoPrimeiroParto;
    private String ultimaInseminacao;
    private String diagnosticoGestacao;
    private String descricao;
    private String dataAcontecido;
    private double valorVendido;
    private double pesoFinal;
    private int diasPrenha;
}
