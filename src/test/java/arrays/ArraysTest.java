package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

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
    public void criandoOutrasFormas(){

    	String[] aArray = new String[5];
    	String[] bArray = {"a","b","c", "d", "e"};
    	String[] cArray = new String[]{"a","b","c","d","e"};

        assertEquals(5, aArray.length);
        assertEquals(5, bArray.length);
        assertEquals(5, cArray.length);

    }

    @Test
    public void instanciando(){

        int myarray[] = {};
        assertEquals("[I", myarray.getClass().getName());

        int otherarray[];
        otherarray = new int[10];
        assertEquals("[I", otherarray.getClass().getName());

    }

    //
    // https://stackoverflow.com/questions/8777257/equals-vs-arrays-equals-in-java
    //
    @Test
    public void equals(){

        int[] arr1 = {};
        int[] arr2 = {};

        assertFalse(arr1 == arr2);
        assertFalse(arr1.equals(arr2));
        assertTrue(Arrays.equals(arr1, arr2));
        assertArrayEquals(arr1, arr2);

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

    @Test
    public void arrayToString(){
    	int[] arr = { 1, 2, 3, 4, 5 };
    	String str = Arrays.toString(arr);

    	assertEquals("[1, 2, 3, 4, 5]", str);
    }

    //
    // next ?
    // https://www.programcreek.com/2013/09/top-10-methods-for-java-arrays/
    //

}
