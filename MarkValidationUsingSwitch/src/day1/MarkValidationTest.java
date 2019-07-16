package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidationTest {

	@Test
	void testIsPass1() {
		MarkValidation mv=new MarkValidation();
		boolean actual=mv.isPass(39);
		boolean expected=false;
		assertEquals(expected, actual);
	}

	@Test
	void testMarkGrade() {
		MarkValidation mv=new MarkValidation();
			String actual=mv.Grade(72);
			String expected="Grade C";
		assertEquals(expected, actual);
	}

}
