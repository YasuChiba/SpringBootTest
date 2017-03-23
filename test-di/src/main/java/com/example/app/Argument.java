package com.example.app;

/**
 * Created by YasuhiraChiba on 2017/03/17.
 */
import lombok.Data;
import org.springframework.stereotype.Component;

public class Argument {
    final int a;
    final int b;

    public Argument(int a,int b) {
        this.a = a;
        this.b = b;
    }
}
