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
		
		//Output price of each Phone
		System.out.println("Phone 1 Price : $" + phonePrice1);
		System.out.println("Phone 2 Price : $" + phonePrice2);
		System.out.println("Phone 3 Price : $" + phonePrice3);
		
		s.close();
		

	}

}