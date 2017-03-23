package com.example.app;

/**
 * Created by YasuhiraChiba on 2017/03/17.
 */

import org.springframework.stereotype.Component;

import java.io.InputStream;

public interface ArgumentResolver {

    Argument resolve(InputStream stream);

}
