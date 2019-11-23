import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculTest {
	
	private Calcul c1;

	@Before
	public void setup() {
		c1 = new Calcul();
	}
	
	@Test
	public void testAddition() {
		assertEquals(5.0, c1.addition(2.0,3.0),0);
		assertEquals(7.0, c1.addition(4.0,3.0),0);
		assertEquals(6.0, c1.addition(3.0,3.0),0);
		assertEquals(9.0, c1.addition(6.0,3.0),0);
	}

	 
	@Test
	public void testMultiplication(){
		assertEquals(8.0, c1.multiplication(2.0,4.0),0);
		assertEquals(10.0, c1.multiplication(2.0,5.0),0);
		assertEquals(7.0, c1.multiplication(1.0,7.0),0);
		assertEquals(0.0, c1.multiplication(0.0,4.0),0);
	}

}
