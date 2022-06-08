package com.taxas.tesouro.infrastructure.feign;

import com.taxas.tesouro.domain.response.Titulos;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "titulos", url = "${titulos.url}")
public interface TitulosClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/order")
    List<Titulos> getTitulos();


}
