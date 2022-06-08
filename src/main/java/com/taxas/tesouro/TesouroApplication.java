package com.taxas.tesouro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TesouroApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesouroApplication.class, args);
    }

}
