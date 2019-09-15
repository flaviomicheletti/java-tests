package exceptions;

import org.junit.jupiter.api.Test;


public class TryCatchTest {

	//https://stackify.com/types-of-exceptions-java/
	//https://www.quora.com/What-are-the-types-of-exceptions-in-Java
	//https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
	//https://www.tutorialspoint.com/java/java_exceptions.htm
	//https://stackoverflow.com/questions/32759150/types-of-exception-in-java	
	
	@Test
	public void firstTest() {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("firstTest: catch");
		}

	}

	@Test
	public void second() {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("secondTest: catch");
		} finally {
			System.out.println("secondTest: finally");
		}
	}
	
//	 https://www.mkyong.com/unittest/junit-4-tutorial-2-expected-exception-test/
//    @Test
//    public void testDivisionWithException() {
//        try {
//            int i = 1 / 0;
//            fail(); //remember this line, else 'may' false positive
//        } catch (ArithmeticException e) {
//            assertThat(e.getMessage(), is("/ by zero"));
//			//assert others
//        }
//    }	
	
	
}


