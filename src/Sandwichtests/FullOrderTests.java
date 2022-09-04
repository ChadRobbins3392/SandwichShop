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
public class FullOrderTests {
	protected double price;
	Order testOrder = new Order();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTurkeyAmericanWhiteNoTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("White");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 5.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeyAmericanWhiteTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("White");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 6.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeyAmericanFlatbreadNoTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("Flatbread");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 5.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeyAmericanFlatbreadTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("Flatbread");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 6.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeyAmericanItalianNoTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("italian");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 6.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeyAmericanItalianTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("italian");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 6.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeyPepperJackWhiteTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("white");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 5.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeyPepperJackWhiteNoTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("white");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 4.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}

	@Test
	public void testTurkeyPepperJackFlatBreadNoTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("flatbread");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 4.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeyPepperJackFlatBreadTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("flatbread");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 5.0;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeySwissWhiteTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("white");
		testOrder.setCheese("swiss");
		testOrder.setTomato(true);
		price = 6.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeySwissWhiteNoTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("white");
		testOrder.setCheese("swiss");
		testOrder.setTomato(false);
		price = 6.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}

	@Test
	public void testTurkeySwissFlatBreadNoTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("swiss");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 3.0;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testTurkeySwissFlatBreadTomato() {
		testOrder.setMeat("TURKEY");
		testOrder.setBread("swiss");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 3.5;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiAmericanWhiteNoTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("White");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 7.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiAmericanWhiteTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("White");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 7.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiAmericanFlatbreadNoTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("Flatbread");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 7.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiAmericanFlatbreadTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("Flatbread");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 7.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiAmericanItalianNoTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("italian");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 7.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiAmericanItalianTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("italian");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 8.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiPepperJackWhiteTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("white");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 6.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiPepperJackWhiteNoTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("white");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 6.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}

	@Test
	public void testPastramiPepperJackFlatBreadNoTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("flatbread");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 6.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiPepperJackFlatBreadTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("flatbread");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 6.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiSwissWhiteTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("white");
		testOrder.setCheese("swiss");
		testOrder.setTomato(true);
		price = 8.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiSwissWhiteNoTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("white");
		testOrder.setCheese("swiss");
		testOrder.setTomato(false);
		price = 7.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}

	@Test
	public void testPastramiSwissFlatBreadNoTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("swiss");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 4.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testPastramiSwissFlatBreadTomato() {
		testOrder.setMeat("PASTRAMI");
		testOrder.setBread("swiss");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 5.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamAmericanWhiteNoTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("White");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 5.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamAmericanWhiteTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("White");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 5.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamAmericanFlatbreadNoTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("Flatbread");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 5.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamAmericanFlatbreadTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("Flatbread");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 5.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamAmericanItalianNoTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("italian");
		testOrder.setCheese("American");
		testOrder.setTomato(false);
		price = 5.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamAmericanItalianTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("italian");
		testOrder.setCheese("American");
		testOrder.setTomato(true);
		price = 6.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamPepperJackWhiteTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("white");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 4.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamPepperJackWhiteNoTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("white");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 4.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}

	@Test
	public void testHamPepperJackFlatBreadNoTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("flatbread");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 4.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamPepperJackFlatBreadTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("flatbread");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 4.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamSwissWhiteTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("white");
		testOrder.setCheese("swiss");
		testOrder.setTomato(true);
		price = 6.25;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamSwissWhiteNoTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("white");
		testOrder.setCheese("swiss");
		testOrder.setTomato(false);
		price = 5.75;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}

	@Test
	public void testHamSwissFlatBreadNoTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("swiss");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(false);
		price = 2.50;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}
	
	@Test
	public void testHamSwissFlatBreadTomato() {
		testOrder.setMeat("HAM");
		testOrder.setBread("swiss");
		testOrder.setCheese("peperjack");
		testOrder.setTomato(true);
		price = 3.00;
		assertEquals(price, testOrder.getTotalPrice(), 0);
	}


}

