package com.tpg.question1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tpg.question1.IPValidationRegex;

public class IPValidationRegexTest {

	private boolean testIPHelper(IPValidationRegex ipvr, int maxOfA, int maxOfB, int maxOfC, int maxOfD) {
		boolean result = false;
		for(int a = 0; a <= maxOfA; a++) 
			for(int b = 0; b <= maxOfB; b++) 
				for(int c = 0; c <= maxOfC; c++) 
					for(int d = 0; d <= maxOfD; d++) {
						result = ipvr.isValid(a + "." + b + "." + c + "." + d);
						if(!result)
							return false;
					}
		return true;
	}
		
	
	@Test
	public void test0To255Beginning() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = testIPHelper(ipvr, 255, 0, 0, 0);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	public void test0To255Middle() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = testIPHelper(ipvr, 0, 0, 255, 0);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	public void test0To255End() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = testIPHelper(ipvr, 0, 0, 0, 255);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	public void test0To255Combined() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = testIPHelper(ipvr, 255, 0, 255, 0);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	public void testGreaterThan255AtTheBeginning() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = ipvr.isValid("256.0.0.0");
		
		// Then
		assertFalse(result);
	}
	
	@Test
	public void testGreaterThan255AtTheMiddle() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = ipvr.isValid("0.259.0.0");
		
		// Then
		assertFalse(result);
	}
	
	@Test
	public void testGreaterThan255AtTheEnd() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = ipvr.isValid("0.0.0.260");
		
		// Then
		assertFalse(result);
	}

	@Test
	public void testLeadingZeroAtTheBeginning() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = ipvr.isValid("01.0.0.0");
		
		// Then
		assertTrue(result);
	}

	@Test
	public void testLeadingZeroAtTheMiddle() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = ipvr.isValid("0.049.0.0");
		
		// Then
		assertTrue(result);
	}
	
	@Test
	public void testLeadingZeroAtTheEnd() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = ipvr.isValid("0.0.0.050");
		
		// Then
		assertTrue(result);
	}
	
	@Test
	public void testLengthGreaterThan3() {
		// Given
		IPValidationRegex ipvr = new IPValidationRegex();
		
		// When
		boolean result = false;
		result = ipvr.isValid("0.0.0.0150");
		
		// Then
		assertFalse(result);
	}
}
