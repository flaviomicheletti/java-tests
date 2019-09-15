package vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Vector;

public class VectorTest {

    @Test
    public void criando(){

        /* Vector of initial capacity(size) of 2 */
        Vector<String> vec = new Vector<String>(2);
        assertEquals(2, vec.capacity());

        /* Adding elements to a vector*/
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        assertEquals(4, vec.size());
        assertEquals(4, vec.capacity());

    }
}
