package com.cjt.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class FirstServer {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
        new SpringApplicationBuilder(FirstServer.class).run(args);
    }
}
