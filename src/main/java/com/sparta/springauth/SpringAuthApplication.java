package com.sparta.springauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.swing.*;

@SpringBootApplication
public class SpringAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthApplication.class, args);
    }

}