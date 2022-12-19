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
public class BezerraCorte {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String nome;
    String dataNascimento;
    String raca; //Raça
    String origem;
    int idLote;
    String nomeLote;
    double peso;
    String pai;
    String mae;
    String situacao;
    String cec;
    String observacao;
    String dataAcontecido;
    String descricao;
    double pesoFinal;
    String comprador;
    double precoVivo;
    int animalAbatido;
    String idadeDesmama;
    double pesoDesmama;
    int virouAdulto;

}
