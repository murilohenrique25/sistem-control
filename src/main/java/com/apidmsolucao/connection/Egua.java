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
public class Egua {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String dataNascimento;
    private String pai;
    private String mae;
    private String lote;
    private String estado;
    private String origem;
    private String raca;
    private String resenha;
    private String observacao;
    private String situacao;
    private String diagnosticoGestacao;
    private String vm;
    private String cios;
    private String baia;
    private double peso;
    private String totalPartos;
    private int diasPrenha;
    private String pelagem;
    private String partoPrevisto;
    private String descricao;
    private String dataAcontecido;
    private double valorVendido;
}
