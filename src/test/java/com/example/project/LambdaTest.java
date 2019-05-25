package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


interface myLambdaFunction {
    String call();
}


public class LambdaTest {

    @Test
    public void lambdaHelloWorldTest(){
    	myLambdaFunction lamb = () -> "Hello world";
        assertEquals("Hello world", lamb.call());
    }

}

