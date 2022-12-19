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
public class MedicamentoEquino {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private double quantidade;
    private double precoUnitario;
    private double precoTotal;
    private String tempoDescarteLeite;
    private String tipoDosagem;
    private String carenciaMedicamento;
    private String dataVencimento;
    private String fornecedor;
    private String dataAbertura;
    private String dataCompra;
    private String principioAtivo;
    private String observacao;
}
