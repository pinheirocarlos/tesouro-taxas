package com.taxas.tesouro.domain.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class Titulos implements Serializable {
    private String nome;
    private String rentabilidade;
    private Double investimentoMinimo;
    private Double precoUnitario;
    private String vencimento;
    private String indexador;
}
