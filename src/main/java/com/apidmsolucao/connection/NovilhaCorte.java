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
public class NovilhaCorte {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String dataNascimento;
    private String raca; //Raça
    private String origem;
    private int idLote;
    private String nomeLote;
    private double peso;
    private String pai;
    private String mae;
    private String situacao;
    private String cec;
    private String observacao;
    private String dataAcontecido;
    private String descricao;
    private double pesoFinal;
    private String comprador;
    private double precoVivo;
    private int animalAbatido;
    private String ultimaInseminacao;
    private String partoPrevisto;
    private String secagemPrevista;
    private String diagnosticoGestacao;
    private String dataParto;
    private int diasPrenha;
    private String dataDiagnosticoGestacao;
    private String dataInseminacao;
    private String idadeDesmama;
    private double pesoDesmama;
    private String idadePrimeiraCobertura;
    private double pesoPrimeiraCobertura;
    private String idadePrimeiroParto;
    private double pesoPrimeiroParto;
    private int virouAdulto;
    private String tipoDiagnosticoGestacao;
    private String tipoParto;
}
