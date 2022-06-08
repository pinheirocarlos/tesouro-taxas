package com.taxas.tesouro.domain.services;

import com.taxas.tesouro.domain.response.Titulos;
import com.taxas.tesouro.infrastructure.feign.TitulosClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TituloService {

    private TitulosClient titulosClient;

    public TituloService(TitulosClient titulosClient) {
        this.titulosClient = titulosClient;
    }

    public List<Titulos> retrieveTitulos() {
        List<Titulos> titulos = null;

        try {
            titulos = titulosClient.getTitulos();
        } catch (Exception e) {
            System.out.println("Error on integration: " + e.getMessage());
        }
        return titulos;
    }

}
