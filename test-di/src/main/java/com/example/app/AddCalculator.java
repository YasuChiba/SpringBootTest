package com.example.app;

import org.springframework.stereotype.Component;

/**
 * Created by YasuhiraChiba on 2017/03/17.
 */
@Component
public class AddCalculator implements Calculator{
    @Override
    public int calc(int a, int b){
        return a+b;
    }
}
