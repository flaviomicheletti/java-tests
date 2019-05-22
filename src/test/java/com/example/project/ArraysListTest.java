package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/*
 * https://docs.oracle.com/javase/10/docs/api/java/util/ArrayList.html
 */
public class ArraysListTest {
   

	/*
	 * https://pt.stackoverflow.com/questions/11740/como-criar-um-array-infinito
	 */
    @Test
    public void tamanhoVariavel(){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("foo");
        lista.add("bar");
        lista.add("baz");
        assertEquals(3, lista.size());

        lista.add("lish");
        assertEquals(4, lista.size());
        
    }     
    
}
