package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    public void concatenando(){

        String s  = "";
        int times = 3;

        for (int i = 0; i < times; i++) {
            s += "abc-";
        }
    	assertEquals("abc-abc-abc-", s);

    }

    //
    // https://pt.stackoverflow.com/a/71518
    //
    @Test
    public void concatenandob(){

        StringBuilder s = new StringBuilder();
        int times = 3;

        for (int i = 0; i < times; i++) {
            s.append("abc-");
        }
    	assertEquals("abc-abc-abc-", s.toString());

    }

    @Test
    public void concat(){
    	String s = "abcd";
    	assertEquals("abcdef", s.concat("ef"));
    }


}
