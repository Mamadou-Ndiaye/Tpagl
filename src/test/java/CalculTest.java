import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculTest {
	
	private Calcul subject;

	@Before
	public void setup() {
		subject = new Calcul();
	}
	
	@Test
	public void testAddition() {
		assertEquals(5, subject.addition(2,3));
	}

	 
	@Test
	public void testMultiplication(){
		assertEquals(8, subject.multiplication(2,4));
	}

}
