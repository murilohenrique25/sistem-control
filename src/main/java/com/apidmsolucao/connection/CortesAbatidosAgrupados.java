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
public class CortesAbatidosAgrupados {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int quantidadeAnimal;
    private String categoria;
    private String idade;
    private double pesoArroba;
    private double precoKgArroba;
    private double precoTotal;
    private String dia;
    private String comprador;
    private String observacao;

}
