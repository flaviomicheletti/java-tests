package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    public void firstTest(){
        String expected = "my-test";

        Foo obj = new Foo();
        String actual = obj.lish();

        assertEquals(expected, actual);
    }

}