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
public class CheeseTest {
	protected String cheeseType;
	protected double price = 1.00;
	Order testOrder = new Order();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAmerican() {
		testOrder.setCheese("american");
		price = 1.00;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testAmericanCapitalA() {
		testOrder.setCheese("American");
		price = 1.00;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testAmericanAllCaps() {
		testOrder.setCheese("AMERICAN");
		price = 1.00;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testAmericanMisspelled() {
		testOrder.setCheese("Ammerican");
		price = 0.00;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testPepperJack() {
		testOrder.setCheese("pepperjack");
		price = 1.25;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testPepperJackCapitalP() {
		testOrder.setCheese("Pepperjack");
		price = 1.25;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testPepperJackAllCaps() {
		testOrder.setCheese("PEPPERJACK");
		price = 1.25;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testPepperJackMisspelled() {
		testOrder.setCheese("peperjack");
		price = 0.00;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testSwiss() {
		testOrder.setCheese("swiss");
		price = 1.50;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testSwissCapitalS() {
		testOrder.setCheese("Swiss");
		price = 1.50;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testSwissAllCaps() {
		testOrder.setCheese("SWISS");
		price = 1.50;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
	
	@Test
	public void testSwissMisspelled() {
		testOrder.setCheese("swisss");
		price = 0.00;
		assertEquals(price, testOrder.getCheesePrice(), 0);
	}
}
