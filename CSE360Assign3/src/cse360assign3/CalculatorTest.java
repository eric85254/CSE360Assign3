/**
 * 
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

//import cse360assign3.Calculator;

/**
 * @author eric8_000
 *
 */
public class CalculatorTest {

	/** test to make sure the class doesn't return a null value
	 * Test method for {@link cse360assign3.Calculator#Calculator()}.
	 */
	@Test
	public final void testCalculator() {
		
		Calculator calc = new Calculator();
		
		assertNotNull(calc.getTotal());
	}

	/** Tests getting the total value
	 * Test method for {@link cse360assign3.Calculator#getTotal()}.
	 */
	@Test
	public final void testGetTotal() {
		
		Calculator calc = new Calculator();
		
		assertEquals(0,calc.getTotal());
	}

	/**Tests adding
	 * Test method for {@link cse360assign3.Calculator#add(int)}.
	 */ 
	@Test
	public final void testAdd() {
		
		Calculator calc = new Calculator();
		
		calc.add(1);
		calc.add(2);
		
		assertEquals(3,calc.getTotal());
	}

	/** Tests subtracting
	 * Test method for {@link cse360assign3.Calculator#subtract(int)}.
	 */
	@Test
	public final void testSubtract() {
		
		Calculator calc = new Calculator();
		
		calc.subtract(3);
		
		assertEquals(-3,calc.getTotal());
	}

	/** Tests multiplying
	 * Test method for {@link cse360assign3.Calculator#multiply(int)}.
	 */
	@Test
	public final void testMultiply() {
		
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.multiply(3);
		
		assertEquals(6,calc.getTotal());
	}

	/** Tests dividing
	 * Test method for {@link cse360assign3.Calculator#divide(int)}.
	 */
	@Test
	public final void testDivide() {
		
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.divide(2);
		
		assertEquals(1,calc.getTotal());
	}
	
	/** Tests dividing
	 * Test method for {@link cse360assign3.Calculator#divide(int)}.
	 */
	@Test
	public final void testDivideByZero() {
		
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.divide(0);
		
		assertEquals(0,calc.getTotal());
	}
	/** Tests String
	 * Test method for {@link cse360assign3.Calculator#getHistory()}.
	 */
	@Test
	public final void testGetHistory() {
	
		Calculator calc = new Calculator();
		
		assertEquals("",calc.getHistory());
	}
}
