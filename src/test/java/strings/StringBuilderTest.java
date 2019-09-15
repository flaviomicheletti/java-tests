package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    @Test
    public void concatenando(){
        StringBuilder str1 = new StringBuilder("Flavio");
        str1.append(" Alexandre");
        str1.append(" Micheletti");
    	assertEquals("Flavio Alexandre Micheletti", str1.toString());

        StringBuilder str2 = new StringBuilder("Flavio");
        str2.append(" Alexandre").append(" Micheletti");
    	assertEquals("Flavio Alexandre Micheletti", str2.toString());


    }
}
