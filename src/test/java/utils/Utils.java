package utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.concurrent.atomic.AtomicLong;

public class Utils {

    @Test
    public void atomic(){
    	
    	// https://spring.io/guides/gs/intellij-idea/
		// https://github.com/spring-guides/gs-rest-service    	
        AtomicLong counter = new AtomicLong();
        
        assertEquals(1, counter.incrementAndGet());
        assertEquals(2, counter.incrementAndGet());
        assertEquals(3, counter.incrementAndGet());
    }	
}
