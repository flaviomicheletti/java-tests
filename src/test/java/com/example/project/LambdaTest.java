package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


interface myLambdaFunction1 {
    String call();
}

interface myLambdaFunction2 {
    int call(int x);
}


public class LambdaTest {

	
    @Test
    public void lambda01Test(){
    	myLambdaFunction1 lamb = () -> "Hello world";
        assertEquals("Hello world", lamb.call());
    }

    @Test
    public void lambda02Test(){
    	myLambdaFunction2 lamb = (int x) -> 2 * x;
        assertEquals(20, lamb.call(10));
    }

}

