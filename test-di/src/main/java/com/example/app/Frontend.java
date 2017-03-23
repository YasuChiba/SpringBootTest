package com.example.app;

/**
 * Created by YasuhiraChiba on 2017/03/20.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Frontend {
    @Autowired
    ArgumentResolver argumentResolver;
    @Autowired
    Calculator calculator;

    public void run(){
        System.out.println("enter 2 numbers");
        Argument argument = argumentResolver.resolve(System.in);
        int result = calculator.calc(argument.a,argument.b);
        System.out.println("result = " + result);
    }

}
