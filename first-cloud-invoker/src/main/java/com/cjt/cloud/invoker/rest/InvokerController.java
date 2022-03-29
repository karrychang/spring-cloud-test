package com.cjt.cloud.invoker.rest;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
@RestController
public class InvokerController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping(value = "/router",produces = "application/json")
    public String router(){
        RestTemplate restTemplate = getRestTemplate();
        return restTemplate.getForObject("http://first-cloud-provider/person/1", String.class);
    }



}
