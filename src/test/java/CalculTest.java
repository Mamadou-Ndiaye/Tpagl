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
		assertEquals(5.0, subject.addition(2.0,3.0),0);
	}

	 
	@Test
	public void testMultiplication(){
		assertEquals(8.0, subject.multiplication(2.0,4.0),0);
	}

}
