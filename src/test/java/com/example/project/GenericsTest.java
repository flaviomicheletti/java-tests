package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

//
// https://www.tutorialspoint.com/java/java_generics.htm
//
class GenericsTest {

    public static < E > int getLength( E[] arr )
    {
        return arr.length;
    }


	@Test
	void firstTest() {
        Integer[] intArray    = { 1, 2, 3 };
        Double[] doubleArray  = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        assertEquals(3, getLength(intArray));
        assertEquals(4, getLength(doubleArray));
        assertEquals(5, getLength(charArray));

    }

    @Test
    void casting() {

      List list1 = new ArrayList();
      list1.add("hello");
      String s1 = (String) list1.get(0); // cast

      List<String> list2 = new ArrayList<String>();
      list2.add("hello");
      String s2 = list2.get(0);   // no cast

    }

    //
    // https://www.devmedia.com.br/java-generics-trabalhando-com-metodos/30911
    //
    @Test
    void listComSemGenerics() {

    	Generics obj = new Generics();
        assertEquals(6, obj.listComGenerics());
        assertEquals(6, obj.listSemGenerics());

    }


}
