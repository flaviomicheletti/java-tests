// https://github.com/junit-team/junit4/wiki/exception-testing
// https://github.com/eugenp/tutorials/tree/master/testing-modules/junit-5
package com.example.project;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

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

}
