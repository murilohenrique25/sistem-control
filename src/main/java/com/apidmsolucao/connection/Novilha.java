package com.apidmsolucao.connection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Novilha {

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
    private double pesoNascimento;
    private double pesoDesmama;
    private String dataDesmama;
    private String dataCobertura;
    private double pesoPrimeiraCobertura;
    private double idadePrimeiraCobertura;
    private double idadePrimeiroParto;
    private String diagnosticoGestacao;
    private int virouVaca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public String getNomeLote() {
        return nomeLote;
    }

    public void setNomeLote(String nomeLote) {
        this.nomeLote = nomeLote;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getAvoMMaterno() {
        return avoMMaterno;
    }

    public void setAvoMMaterno(String avoMMaterno) {
        this.avoMMaterno = avoMMaterno;
    }

    public String getAvoFMaterno() {
        return avoFMaterno;
    }

    public void setAvoFMaterno(String avoFMaterno) {
        this.avoFMaterno = avoFMaterno;
    }

    public String getAvoMPaterno() {
        return avoMPaterno;
    }

    public void setAvoMPaterno(String avoMPaterno) {
        this.avoMPaterno = avoMPaterno;
    }

    public String getAvoFPaterno() {
        return avoFPaterno;
    }

    public void setAvoFPaterno(String avoFPaterno) {
        this.avoFPaterno = avoFPaterno;
    }

    public double getPesoNascimento() {
        return pesoNascimento;
    }

    public void setPesoNascimento(double pesoNascimento) {
        this.pesoNascimento = pesoNascimento;
    }

    public double getPesoDesmama() {
        return pesoDesmama;
    }

    public void setPesoDesmama(double pesoDesmama) {
        this.pesoDesmama = pesoDesmama;
    }

    public String getDataDesmama() {
        return dataDesmama;
    }

    public void setDataDesmama(String dataDesmama) {
        this.dataDesmama = dataDesmama;
    }

    public String getDataCobertura() {
        return dataCobertura;
    }

    public void setDataCobertura(String dataCobertura) {
        this.dataCobertura = dataCobertura;
    }

    public double getPesoPrimeiraCobertura() {
        return pesoPrimeiraCobertura;
    }

    public void setPesoPrimeiraCobertura(double pesoPrimeiraCobertura) {
        this.pesoPrimeiraCobertura = pesoPrimeiraCobertura;
    }

    public double getIdadePrimeiraCobertura() {
        return idadePrimeiraCobertura;
    }

    public void setIdadePrimeiraCobertura(double idadePrimeiraCobertura) {
        this.idadePrimeiraCobertura = idadePrimeiraCobertura;
    }

    public double getIdadePrimeiroParto() {
        return idadePrimeiroParto;
    }

    public void setIdadePrimeiroParto(double idadePrimeiroParto) {
        this.idadePrimeiroParto = idadePrimeiroParto;
    }

    public String getDiagnosticoGestacao() {
        return diagnosticoGestacao;
    }

    public void setDiagnosticoGestacao(String diagnosticoGestacao) {
        this.diagnosticoGestacao = diagnosticoGestacao;
    }

    public int getVirouVaca() {
        return virouVaca;
    }

    public void setVirouVaca(int virouVaca) {
        this.virouVaca = virouVaca;
    }
}
