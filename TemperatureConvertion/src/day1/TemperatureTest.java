package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	
	void testConvertToFarenhite() {
		Temperature temperature=new Temperature();
		Double actual=temperature.convertToFarenheit(42.8);
		Double expected=109.04;
		assertEquals(expected, actual);
	}

	@Test
	void testConvertToCelsius() {
		Temperature temperature=new Temperature();
		Double actual=temperature.convertToCelsius(109.04);
		Double expected=42.8;
		assertEquals(expected, actual);
	}

}
