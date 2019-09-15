package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//
// https://docs.oracle.com/javase/10/docs/api/java/util/ArrayList.html
//
public class ArraysListTest {
   
	//
	// O List é uma interface e o ArrayList é a classe que a implementa
	//
	@Test
    public void listInterface(){
        List arr, linked;
        
        arr    = new ArrayList();
        linked = new LinkedList();

        assertEquals("class java.util.ArrayList", arr.getClass().toString());
        assertTrue(arr instanceof List);
        assertTrue(arr instanceof ArrayList);

        assertEquals("class java.util.LinkedList", linked.getClass().toString());
        assertTrue(linked instanceof List);
        assertTrue(linked instanceof LinkedList);

    }  	

	/*
	 * https://pt.stackoverflow.com/questions/11740/como-criar-um-array-infinito
	 */
    @Test
    public void tamanhoVariavel(){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("generics");
        lista.add("bar");
        lista.add("baz");
        assertEquals(3, lista.size());

        lista.add("lish");
        assertEquals(4, lista.size());
        
    }     
    
}

