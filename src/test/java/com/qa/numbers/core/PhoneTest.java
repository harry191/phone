package com.qa.numbers.core;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhoneTest {

	@Test
	void test() {
		
		Phone p = new Phone();
		String result = p.Phone("01234567890");
		assertEquals("01234567890", result);
		
	}

}
