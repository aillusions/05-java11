package com.zalizniak;

import org.junit.Test;

import java.util.function.Function;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        Function<String, Void> print = (var s) -> {
            System.out.println(s);
            return null;
        };
        print.apply("Hello World !");

        var i = 2;


    }
}
