/**
 * @author chadrobbins - cerobbins@dmacc.edu
 * CIS 175 - Spring 2022
 * Sep 2, 2022
 */
package Sandwichtests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Order;



/**
 * @author Chad Robbins - cerobbins
 * CIS175 - Fall 2021
 * Sep 2, 2022
 */
public class MeatTests {
	protected String meatType;
	protected double price = 1.00;
	Order testOrder = new Order();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTurkey() {
		testOrder.setMeat("turkey");
		price = 3.00;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testTurkeyCapitalT() {
		testOrder.setMeat("Turkey");
		price = 3.00;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testTurkeyAllCaps() {
		testOrder.setMeat("TURKEY");
		price = 3.00;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testTurkeyMisspelled() {
		testOrder.setMeat("TURRKEY");
		price = 0.00;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testHam() {
		testOrder.setMeat("ham");
		price = 2.50;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testHamCapitalH() {
		testOrder.setMeat("Ham");
		price = 2.50;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testHamAllCaps() {
		testOrder.setMeat("HAM");
		price = 2.50;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testHamMisspelled() {
		testOrder.setMeat("hma");
		price = 0.00;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testPastrami() {
		testOrder.setMeat("pastrami");
		price = 4.50;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testPastramiCapitalP() {
		testOrder.setMeat("Pastrami");
		price = 4.50;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testPastramiAllCaps() {
		testOrder.setMeat("PASTRAMI");
		price = 4.50;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	
	@Test
	public void testPastramiMisspelled() {
		testOrder.setMeat("pastremi");
		price = 0.00;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}
	@Test
	public void testNotMeatOption() {
		testOrder.setMeat("chicken");
		price = 0.00;
		assertEquals(price, testOrder.getMeatPrice(), 0);
	}

}
