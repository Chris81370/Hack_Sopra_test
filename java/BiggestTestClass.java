package pack;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.InvalidListException;

public class BiggestTestClass {

	@Test
	public void biggestWithNominalCase() {
		App app = new App();
		int[] list = new int[] { 7, 8, 9 };
		int biggest = app.biggestNumber(list);

		assertEquals(9, biggest);
	}

	@Test
	public void biggestWithNegativeValue() {
		App app = new App();
		int[] list = new int[] { -7, -8, -9 };
		int biggest = app.biggestNumber(list);

		assertEquals(-7, biggest);
	}

	@Test
	public void biggestWithEmptyValue() {
		App app = new App();
		int[] list = new int[] {};
		int biggest = app.biggestNumber(list);

		assertEquals(Integer.MIN_VALUE, biggest);
	}

	/*
	 * @Test public void biggestWithNullValue() { App app = new App(); int[] list =
	 * null; int biggest = app.biggestNumber(list);
	 * 
	 * assertEquals(Integer.MIN_VALUE, biggest); }
	 */

	@Test(expected = InvalidListException.class)
	public void biggestWithNullValue() {
		App app = new App();
		app.biggestNumber(null);

	}

}
