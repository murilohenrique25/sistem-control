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
public class Leite {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String dataColeta;
    private double quantidade;
    private double gordura;
    private double proteina;
    private double lactose;
    private double ureia;
    private double ccs;
    private double cbt;
    private int idMes;
}
