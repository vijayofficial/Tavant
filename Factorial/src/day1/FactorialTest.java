package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

		@Test
		void testCalculateFactorial() {
			Factorial factorial=new Factorial();
			int ans=factorial.calculateFactorial(7);
			assertEquals(5040, ans);
		}
}
