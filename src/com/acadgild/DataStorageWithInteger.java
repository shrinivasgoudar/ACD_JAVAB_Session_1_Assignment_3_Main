/**
 * 
 */
package com.acadgild;

/**
 * @author shrinivasa.goudar
 *
 */
public class DataStorageWithInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Data can not be stored in  integer Program!!!");
		// Declaration of variables
		
		
		//Datatype variable1, variable2, variabl3,variable4
		int number1;
		float number2; 
		long number3;
		
		char a ='A';
		
		// Assigning the float value to number2 variable and long value to number3
		number2 = 9799999999.8f;
		number3 = 199999999999999l;
		number1 = (int) number2;
		System.out.println("Number 1 :"+number1);
		number1 = (int) number3;
		System.out.println("Number 1 :"+number1);
		// assigning char to int
		number1= a;
		System.out.println("Number 1 :"+number1);
	}

}
