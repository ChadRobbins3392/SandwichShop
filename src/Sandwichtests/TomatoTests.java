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
public class TomatoTests {
	Boolean tomatoOption;
	
	Order testOrder = new Order();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testYesTomatoes() {
		tomatoOption = true;
		testOrder.setTomato(tomatoOption);
		double price = 0.50;
		assertEquals(price, testOrder.getTomatoPrice(), 0);
	}
	
	@Test
	public void testNoTomatoes() {
		tomatoOption = false;
		testOrder.setTomato(tomatoOption);
		double price = 0.00;
		assertEquals(price, testOrder.getTomatoPrice(), 0);
	}

}
