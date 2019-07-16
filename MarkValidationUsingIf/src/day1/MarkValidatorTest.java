package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void testisPass() {
			MarkValidation mv=new MarkValidation();
			boolean actual=mv.isPass(99);
			boolean expected=true;
			assertEquals(expected, actual);
	}
	@Test
	void testGrade() {
		MarkValidation mv=new MarkValidation();
			String actual=mv.Grade(99);
			String expected="Grade A";
		assertEquals(expected, actual);
	}
}
