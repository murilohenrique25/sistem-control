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
public class TouroCorte {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String dataNascimento;
    private String raca; //Raça
    private String origem;
    private int idLote;
    private String nomeLote;
    private double peso;
    private String pai;
    private String mae;
    private String situacao;
    private String cec;
    private String observacao;
    private String dataAcontecido;
    private String descricao;
    private double pesoFinal;
    private String comprador;
    private double precoVivo;
    private int animalAbatido;
    private String exameGeral;
    private String exameSistemaGenital;
    private String perimetroEscrotal;
    private String consistenciaEscrotal;
    private String glandulasSexuaisAcessorias;
    private String regiaoPrepucial;
    private String exameObservacao;
    private String temperamento;
    private String texteLibido;
    private String reflexoFleming;
    private String capacidadeIdenticarFemeaCio;
    private String perseguicaoFemeaPersistencia;
    private String tentativasMontas;
    private String monta;
    private String saltos;
    private String avaliacao;
    private String tipoAvaliacao;
    private String vigor;
    private String motilidade;
    private String turbilhamento;
    private String concentracao;
    private String volume;
    private String aspecto;
    private String celulasNormais;
    private String defeitosMenores;
    private String defeitosMaiores;
    private String cor;
    private String dataExame;



}
