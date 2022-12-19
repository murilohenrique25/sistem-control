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
public class InventarioSemen {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String codigoIA;
    private int idTouro;
    private String nomeTouro;
    private String tamanho;
    private int quantidade;
    private String cor;
    private String dataCadastro;
}
