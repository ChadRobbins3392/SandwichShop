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
public class BreadTests {
	String breadType;
	double price;
	Order testOrder = new Order();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWhite() {
		price = 1.75;
		testOrder.setBread("white");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testWhiteCapitalW() {
		price = 1.75;
		testOrder.setBread("White");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testWhiteAllCaps() {
		price = 1.75;
		testOrder.setBread("WHITE");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testWhiteMisspelled() {
		price = 0.00;
		testOrder.setBread("whitte");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testItalian() {
		price = 2.00;
		testOrder.setBread("italian");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testItalianCapitalI() {
		price = 2.00;
		testOrder.setBread("Italian");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testItalianAllCaps() {
		price = 2.00;
		testOrder.setBread("ITALIAN");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testItalianMisspelled() {
		price = 0.00;
		testOrder.setBread("italean");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}

	@Test
	public void testFlatbread() {
		price = 1.50;
		testOrder.setBread("flatbread");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testFlatbreadCapitalF() {
		price = 1.50;
		testOrder.setBread("Flatbread");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testFlatbreadAllCaps() {
		price = 1.50;
		testOrder.setBread("FLATBREAD");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testFlatbreadMisspelled() {
		price = 0.00;
		testOrder.setBread("flat bread");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
	@Test
	public void testNotAnOption() {
		price = 0.00;
		testOrder.setBread("Zuccini Bread");
		assertEquals(price, testOrder.getBreadPrice(), 0);
	}
	
}
