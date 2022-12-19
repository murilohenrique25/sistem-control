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
public class Touro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String dataNascimento;
    private String raca;
    private int idLote;
    private String nomeLote;
    private String estado;
    private String pai;
    private String mae;
    private String avoMMaterno;
    private String avoFMaterno;
    private String avoMPaterno;
    private String avoFPaterno;

}
