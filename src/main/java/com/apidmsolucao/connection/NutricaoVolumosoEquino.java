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
public class NutricaoVolumosoEquino {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int idLote;
    private String nomeLote;
    private String tipo;
    private double quantidadeInd;
    private double quantidadeTotal;
    private double pb;
    private double ndt;
    private double ms;
    private double umidade;
    private String observacao;
    private String data;
    private String baia;


}
