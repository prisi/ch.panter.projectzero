package ch.panter.junit.gettingstarted;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Tests {
	
	TestsToTest t;


    @Before
    public void init() {
    	 t = new TestsToTest();
    }
	
	@Test
	public void isEmptyTest() {
		assertTrue(t.isEmpty(""));
	}
	
	@Test
	public void capitalizeTest() {
		String x = "corinne";
		assertEquals(t.capitalize(x), "CORINNE");
	}
	
	@Test
	public void reverseTest() {
		String x = "abcdefg";
		assertEquals(t.reverse(x), "gfedcba");
	}
	
    @Test(expected=NullPointerException.class) 
	public void reverseNullTest() {
		t.reverse(null);
	}
    
    @Test
    public void joinTest() {
    	assertEquals(t.join("Corinne", "schaut", "zu"), "Corinne schaut zu");
    }

}
