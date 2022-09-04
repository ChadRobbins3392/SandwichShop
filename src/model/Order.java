/**
 * @author chadrobbins - cerobbins@dmacc.edu
 * CIS 175 - Spring 2022
 * Sep 2, 2022
 */
package model;




/**
 * @author Chad Robbins - cerobbins
 * CIS175 - Fall 2021
 * Sep 2, 2022
 */
public class Order {
	private String meat;
	private String cheese;
	private String bread;
	private boolean tomato;
	
	/**
	 * default no-arg constructor
	 */
	public Order() {
		super();
	}
	/**
	 * @return the meat
	 */
	public String getMeat() {
		return meat;
	}
	/**
	 * @param meat the meat to set
	 */
	public void setMeat(String meat) {
		this.meat = meat;
	}
	/**
	 * @return the cheese
	 */
	public String getCheese() {
		return cheese;
	}
	/**
	 * @param cheese the cheese to set
	 */
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	/**
	 * @return the bread
	 */
	public String getBread() {
		return bread;
	}
	/**
	 * @param bread the bread to set
	 */
	public void setBread(String bread) {
		this.bread = bread;
	}
	/**
	 * @return the tomato
	 */
	public boolean isTomato() {
		return tomato;
	}
	/**
	 * @param tomato the tomato to set
	 */
	public void setTomato(boolean tomato) {
		this.tomato = tomato;
	}
	
	/**
	 * get the price of the meat on the sandwich
	 * @return
	 */
	public double getMeatPrice() {
		if (meat == "turkey" || meat == "Turkey" || meat == "TURKEY") {
			return 3.00;
		}
		else if (meat == "ham" || meat == "Ham" || meat == "HAM") {
			return 2.50;
		}
		else if (meat == "pastrami" || meat == "Pastrami" || meat == "PASTRAMI") {
			return 4.50;
		} else return 0.00;
	}
	
	/**
	 * get price of the bread on the sandwich
	 * @return
	 */
	public double getBreadPrice() {
		if (bread == "italian" || bread == "Italian" || bread == "ITALIAN") {
			return 2.00;
		}
		else if (bread == "flatbread" || bread == "Flatbread" || bread == "FLATBREAD") {
			return 1.50;
		}
		else if (bread == "white" || bread == "White" || bread == "WHITE") {
			return 1.75;
		} else return 0.00;
	}
	
	/**
	 * get price of the cheese on sandwich
	 * @return
	 */
	public double getCheesePrice() {
		if (cheese == "american" || cheese == "American" || cheese == "AMERICAN") {
			return 1.00;
		}
		else if (cheese == "pepperjack" || cheese == "Pepperjack" || cheese == "PEPPERJACK") {
			return 1.25;
		}
		else if (cheese == "swiss" || cheese == "Swiss" || cheese == "SWISS") {
			return 1.50;
		} else return 0.00;
	}
	
	/**
	 * get price of tomato
	 * @return
	 */
	public double getTomatoPrice() {
		if (tomato) {
			return 0.50;
		}
		else return 0.00;
	}
	
	public double getTotalPrice() {
		return getBreadPrice() + getMeatPrice() + getCheesePrice() + getTomatoPrice();
	}
	
}
