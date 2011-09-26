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

	@Test
	public void nine() throws Exception {
		assertEquals("IX", romanise(9));
	}

	@Test
	public void ten() throws Exception {
		assertEquals("X", romanise(10));
	}

	@Test
	public void thirteen() throws Exception {
		assertEquals("XIII", romanise(13));
	}

	@Test
	public void fourteen() throws Exception {
		assertEquals("XIV", romanise(14));
	}

	@Test
	public void fifteen() throws Exception {
		assertEquals("XV", romanise(15));
	}

	@Test
	public void eighteen() throws Exception {
		assertEquals("XVIII", romanise(18));
	}

	@Test
	public void nineteen() throws Exception {
		assertEquals("XIX", romanise(19));
	}

	private String romanise(int arabic) {
		if (arabic <= 0)
			throw new IllegalArgumentException(
					"The Romans didn't have a way to write " + arabic);

		if (arabic >= 10) {
			return "X" + foo(arabic - 10);
		} else {
			return foo(arabic);
		}
	}

	private String repeatOnes(int howMany) {
		String ones = "";
		while (howMany-- > 0) {
			ones += "I";
		}
		return ones;
	}

	private String foo(int arabic) {
		if (arabic == 9) {
			return "I" + "X";
		} else if (arabic >= 5) {
			return "V" + repeatOnes(arabic - 5);
		} else if (arabic == 4) {
			return "I" + "V";
		} else if (arabic >= 0) {
			return repeatOnes(arabic);
		} else {
			return "";
		}
	}
}