package cse360assign3;

/**Calculator:
 * A calculator that can add, subtract, multiply, divide
 * and get the history of the calculations you performed
 * 
 * @author Eric Gottfried
 *@version Feb 22 2016
 * PIN: 325
 */
public class Calculator
{

	private int total;
	private String historyList = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * getTotal: gets the total value
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * add: adds a value with the total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		
		historyList = historyList + " + " + value;
	}
	/**
	 * subtract: subtracts the total by the value
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		
		historyList = historyList + " - " + value;
	}
	
	/**
	 * multiplies the total with the value
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		
		historyList = historyList + " * " + value;
	}
	
	/**
	 * divides the total by the value
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
			
			historyList = historyList + " / " + value;
		}
		else {
			total = total / value;
			
			historyList = historyList + " / " + value;
		}
	}
	
	/**
	 * returns a string with the history of calculations
	 * @return
	 */
	public String getHistory () {
		return historyList;
	}
}

