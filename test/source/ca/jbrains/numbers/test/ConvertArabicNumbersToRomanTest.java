package ca.jbrains.numbers.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertArabicNumbersToRomanTest {
	@Test
	public void zero() throws Exception {
		try {
			romanise(0);
			fail("The romans didn't have zero!");
		} catch (IllegalArgumentException expected) {
			assertEquals("The Romans didn't have a way to write 0",
					expected.getMessage());
		}
	}

	@Test
	public void negative() throws Exception {
		try {
			romanise(-1);
			fail("The romans didn't have negative numbers!");
		} catch (IllegalArgumentException expected) {
			assertEquals("The Romans didn't have a way to write -1",
					expected.getMessage());
		}
	}

	@Test
	public void one() throws Exception {
		assertEquals("I", romanise(1));
	}

	@Test
	public void two() throws Exception {
		assertEquals("II", romanise(2));
	}

	@Test
	public void three() throws Exception {
		assertEquals("III", romanise(3));
	}

	@Test
	public void four() throws Exception {
		assertEquals("IV", romanise(4));
	}

	@Test
	public void five() throws Exception {
		assertEquals("V", romanise(5));
	}

	@Test
	public void six() throws Exception {
		assertEquals("VI", romanise(6));
	}

	@Test
	public void seven() throws Exception {
		assertEquals("VII", romanise(7));
	}

	@Test
	public void eight() throws Exception {
		assertEquals("VIII", romanise(8));
	}

	private String romanise(int arabic) {
		if (arabic <= 0)
			throw new IllegalArgumentException(
					"The Romans didn't have a way to write " + arabic);

		if (arabic >= 5) {
			return appendOnes(arabic - 5, "V");
		} else if (arabic == 4) {
			return "IV";
		} else {
			return appendOnes(arabic, "");
		}
	}

	private String appendOnes(int arabic, String romanSoFar) {
		while (arabic-- > 0) {
			romanSoFar += "I";
		}
		return romanSoFar;
	}
}