package FifthLesson;

import junit.framework.Assert;

import org.junit.Test;

public class MyExceptionLessonTEST {

	@Test
	public void testPass() {
	}

	@Test(timeout = 10)
	public void testPassTimeOut() {
		System.out.println("Time out pass");
	}

	@Test(timeout = 10)
	public void testPassFailTimeOut() {
		while (true) {
			System.out.println(System.currentTimeMillis());
		}
	}
	
//	@Test(expected = myException.class)
//	public void testExPass() throws MyException{
//		throw new myException();
//	}
//	
	@Test
	public void testAssert(){
		
		
		
		Assert.fail();
	}
}
