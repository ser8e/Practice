package practice.test;

import static org.junit.Assert.*;

import org.junit.Test;

import practice.tasks.Part2;

public class Part2Test {
	
	@Test
	public void testGetSquaresFromRectangle7() {
		int a = 130, b = 543;
		int n = Part2.getSquaresFromRectangle7(a, b);
		assertEquals(4, n);		
	}

	@Test
	public void testGetSum19() {
		int sum = Part2.getSum19(1234);
		assertEquals(10, sum);		
	}
	
	@Test
	public void testGetProduct19() {
		int product = Part2.getProduct19(1234);
		assertEquals(24, product);		
	}
	
	@Test
	public void testConvertTimeToAngle() {
		assertEquals(90.0, Part2.convertTimeToAngle(3, 0, 0), 0.01);
		assertEquals(95.25, Part2.convertTimeToAngle(3, 10, 30), 0.01);
	}

}
