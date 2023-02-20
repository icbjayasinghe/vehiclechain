package com.skyhigh.vehiclechain;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.skyhigh.vehiclechain.swagger",
        "com.skyhigh.vehiclechain.controller" ,
        "com.skyhigh.vehiclechain.config.swagger",
        "com.skyhigh.vehiclechain.service",
        "com.skyhigh.vehiclechain.repository",
        "com.skyhigh.vehiclechain.util",
        "com.skyhigh.vehiclechain.exception"})
public class VehiclechainApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehiclechainApplication.class, args);
    }

    @Bean
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}
