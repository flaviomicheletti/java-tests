package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

//import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.CsvSource;

public class ArraysTest {

    @Test
    public void criando(){

        // type var-name[];
        int myarray[] = {};
        assertEquals(0, myarray.length);

        // type[] var-name;
        int[] otherarray = {};
        assertEquals(0, otherarray.length);

        int[] fooarray = new int[] {1, 2, 3, 4, 5};
        assertEquals(5, fooarray.length);

        // declaring
        int arr[];
        arr = new int[10];
        assertEquals(10, arr.length);

    }	
    
    @Test
    public void instanciando(){

        int myarray[] = {};
        assertEquals("[I", myarray.getClass().getName());

        int otherarray[];
        otherarray = new int[10];
        assertEquals("[I", otherarray.getClass().getName());

    }
    
    // @Test
    // public void add(){

    //     int arr[] = {};
    //     arr[0] = 1;
    //     assertEquals(0, arr.length);

    // }

    @Test
    public void equals(){

        // int[] arr1 = {};
        // int[] arr2 = {};

        //
        // https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html#assertArrayEquals(byte[],%20byte[])
        //
        // assertArrayEquals(arr1, arr2);

        //
        // https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
        //
        // assertTrue(Arrays.equals(arr1, arr2));

    }

    @Test
    public void somando(){
        int[] arr = new int[] {10, 10, 10};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        assertEquals(30, sum);

        assertEquals(30, Arrays.stream(arr).sum());
    }    
	
}
