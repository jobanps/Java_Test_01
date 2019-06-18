package problem1;

import java.util.Scanner;

public class BuyingPhones {

	public static void main(String[] args) {
		System.out.println("Enter the regular price of a phone: ");
		Scanner s = new Scanner(System.in);
		double price = s.nextDouble();
		
		//Calculate Price of each phone
		double phonePrice1 = price;
		double phonePrice2 = price;
		double phonePrice3 = price * 0.50;
		
		
		
		s.close();
		

	}

}