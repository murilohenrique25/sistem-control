package com.apidmsolucao.connection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Vaca implements Serializable {

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
    private String ultimaInseminacao;
    private String partoPrevisto;
    private String secagemPrevista;
    private String diagnosticoGestacao;
    private String dataDiagnosticoGestacao;
    private String tipoDiagnosticoGestacao;
    private int diasPrenha;
    private String origem;
    private String observacao;
    private double peso;
    private String cec;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public String getUltimaInseminacao() {
        return ultimaInseminacao;
    }

    public void setUltimaInseminacao(String ultimaInseminacao) {
        this.ultimaInseminacao = ultimaInseminacao;
    }

    public String getPartoPrevisto() {
        return partoPrevisto;
    }

    public void setPartoPrevisto(String partoPrevisto) {
        this.partoPrevisto = partoPrevisto;
    }

    public String getSecagemPrevista() {
        return secagemPrevista;
    }

    public void setSecagemPrevista(String secagemPrevista) {
        this.secagemPrevista = secagemPrevista;
    }

    public String getDiagnosticoGestacao() {
        return diagnosticoGestacao;
    }

    public void setDiagnosticoGestacao(String diagnosticoGestacao) {
        this.diagnosticoGestacao = diagnosticoGestacao;
    }

    public String getDataDiagnosticoGestacao() {
        return dataDiagnosticoGestacao;
    }

    public void setDataDiagnosticoGestacao(String dataDiagnosticoGestacao) {
        this.dataDiagnosticoGestacao = dataDiagnosticoGestacao;
    }

    public String getTipoDiagnosticoGestacao() {
        return tipoDiagnosticoGestacao;
    }

    public void setTipoDiagnosticoGestacao(String tipoDiagnosticoGestacao) {
        this.tipoDiagnosticoGestacao = tipoDiagnosticoGestacao;
    }

    public int getDiasPrenha() {
        return diasPrenha;
    }

    public void setDiasPrenha(int diasPrenha) {
        this.diasPrenha = diasPrenha;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCec() {
        return cec;
    }

    public void setCec(String cec) {
        this.cec = cec;
    }
}
