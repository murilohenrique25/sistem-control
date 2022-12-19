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
public class Matriz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private  String dataNascimento;
    private int quantidade;
    private String estado;
    private String lote;
    private String identificacao;
    private String vivos;
    private String mortos;
    private String pai;
    private String mae;
    private String raca;
    private String sexoF;
    private String sexoM;
    private String baia;
    private String pesoNascimento;
    private String pesoDesmama;
    private String dataDesmama;
    private String observacao;
    private String descricao;
    private String dataAcontecido;
    private double precoFinal;
    private double peso;
    private String origem;
    private int numeroPartos;
    private String partoPrevisto;
    private String diagnosticoGestacao;
    private int diasPrenha;
    private String procedencia;
}
