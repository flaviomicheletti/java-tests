// https://github.com/junit-team/junit4/wiki/exception-testing
// https://github.com/eugenp/tutorials/tree/master/testing-modules/junit-5
package exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ExceptionTest {

	protected void vaiDarRuim() {
        String test = null;
        test.length();
	}

    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        String test = null;
        assertThrows(NullPointerException.class, () -> {
            test.length();
        });
    }

    @Test
    public void whenDerivedExceptionThrown_thenAssertionSucceds() {
        String test = null;
        assertThrows(RuntimeException.class, () -> {
            test.length();
        });
    }

    //
    // https://howtodoinjava.com/junit5/expected-exception-example/
    //
    @Test
    void testExpectedException() {
    	Assertions.assertThrows(NumberFormatException.class, () -> {
    		Integer.parseInt("One");
    	});
    }

    //
    // https://www.codejava.net/testing/junit-test-exception-examples-how-to-assert-an-exception-is-thrown
    //
    @Test
    public void testUsernameIsNull() {
        assertThrows(NumberFormatException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
        		Integer.parseInt("One");
            }
        });
    }

}
