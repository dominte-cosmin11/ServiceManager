package com.example.nouproiectdam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@SpringBootApplication

public class NouProiectDamApplication {
  //  private static Logger logger = Logger.getLogger(SpringBootApplication.class.getName());
    public static void main(String[] args) {

     //   logger.info("Loading ... :: SpringBoot - NouProiectDamApplication Default Settings ...  ");
        SpringApplication.run(NouProiectDamApplication.class, args);
    }
}
