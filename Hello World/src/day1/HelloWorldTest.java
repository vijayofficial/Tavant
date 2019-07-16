package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld h=new HelloWorld();
		String result=h.getMessage();
		assertEquals("Hello World",result);
	}

}
