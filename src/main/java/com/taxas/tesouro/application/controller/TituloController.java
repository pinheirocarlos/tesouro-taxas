package com.taxas.tesouro.application.controller;

import com.taxas.tesouro.domain.response.Titulos;
import com.taxas.tesouro.domain.services.TituloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TituloController {

    private TituloService tituloService;

    public TituloController(TituloService tituloService) {
        this.tituloService = tituloService;
    }

    @GetMapping("/v1/titulos")
    public List<Titulos> getAll() {
       return tituloService.retrieveTitulos();
    }

}
