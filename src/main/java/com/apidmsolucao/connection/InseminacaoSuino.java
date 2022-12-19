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
public class InseminacaoSuino {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nomeMatriz;
    private String nomeCachaco;
    private String data;
    private String observacao;
    private String inseminador;
    private String tipoReproducao;
    private String palheta;
}
