package com.example;

/**
 * Created by YasuhiraChiba on 2017/03/17.
 */

import com.example.app.Calculator;
import com.example.app.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

@EnableAutoConfiguration
@ComponentScan
public class App {

    public static void main(String[] args){
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class,args)){

            Frontend frontend = context.getBean(Frontend.class);
            frontend.run();
        }
    }
}
