package com.taxas.tesouro.domain.response;

import lombok.Data;

@Data
public class Titulos {
    private String nome;
    private String rentabilidade;
    private Double investimentoMinimo;
    private Double precoUnitario;
    private String vencimento;
    private String indexador;
}
