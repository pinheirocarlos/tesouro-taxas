package com.taxas.tesouro.domain.services;

import com.taxas.tesouro.domain.response.Titulos;
import com.taxas.tesouro.infrastructure.feign.TitulosClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = {"titulos"})
public class TituloService {

    private TitulosClient titulosClient;

    public TituloService(TitulosClient titulosClient) {
        this.titulosClient = titulosClient;
    }

    private static final Logger LOG = LoggerFactory.getLogger(TituloService.class);

    @Cacheable
    public List<Titulos> retrieveTitulos() {
        List<Titulos> titulos = null;

        try {
            titulos = titulosClient.getTitulos();
        } catch (Exception e) {
            LOG.error("Error on integration: " + e.getMessage());
        }
        LOG.info("Retrieve data with success");
        return titulos;
    }

}
