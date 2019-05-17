package com.example.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;



//
//https://www.tutorialspoint.com/java/java_generics.htm
//
class GenericsTest {
	
    public static < E > void printArray( E[] inputArray )
    {
        for(E element : inputArray)
        {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
	

	@Test
	void test() {
        Integer[] intArray    = { 1, 2, 3, 4, 5 };
        Double[] doubleArray  = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);



        // List list = new ArrayList();
        // list.add("hello");
        // String s = (String) list.get(0); // cast

        List<String> list = new ArrayList<String>();
        list.add("hello");
        String s = list.get(0);   // no cast
    }

}
