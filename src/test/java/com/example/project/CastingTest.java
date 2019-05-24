package com.example.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CastingTest {

	@Test
    public void seraQueEstaAcontecendoCast(){

        assertEquals(5, (double) 5.0);
        assertEquals(5, (float) 5.0);
        assertEquals(5, (int) 5.0);

        assertEquals(5.0, (double) 5.0);
        assertEquals(5.0, (float) 5.0);
        assertEquals(5.0, (int) 5.0);

	}	

	@Test
    public void doubleToFloat(){
		float num = (float) 5.0;
        assertEquals(5, num);
        assertEquals(5.0, num);
	}	

	@Test
    public void doubleToInt(){
		int num = (int) 5.1987;		
        assertEquals(5, num);
        assertEquals(5.0, num);
	}	

	@Test
    public void ConversaoDeIntParaFloatHeImplicitoNaoPrecisaDeCasting(){
		float num = 100;
		assertEquals(100, num);
	}	

	@Test
    public void ConversaoDeCharParaFloatHeImplicitoNaoPrecisaDeCasting(){
		float num1 = 'a';
		assertEquals(97, num1);

		float num2 = 'b';
		assertEquals(98, num2);

		float num3 = 'c';
		assertEquals(99, num3);
		
		float num4 = 'd';
		assertEquals(100, num4);
	}	

}
