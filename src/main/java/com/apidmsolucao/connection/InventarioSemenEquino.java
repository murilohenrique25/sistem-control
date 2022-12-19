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
public class InventarioSemenEquino {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String identificacao;
    private int quantidade;
    private String cor;
    private String dataCadastro;
    private String dataValidade;
    private String observacao;
    private String vigor;
    private String mortalidade;
    private String turbilhamento;
    private String concentracao;
    private double volume;
    private String aspecto;
    private double celulasNormais;
    private String defeitoMaiores;
    private String defeitoMenores;
}
