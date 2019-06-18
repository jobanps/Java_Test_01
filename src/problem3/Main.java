package problem3;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) throws InterruptedException {
		//Taking x and y values from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial value of x position");
		int xPos = input.nextInt();
		System.out.println("Enter initial value of y position");
		int yPos = input.nextInt();
		
		Rabbit rabbit = new Rabbit(xPos, yPos);
		rabbit.sayHello();
		
		
		boolean runForever = true;
		boolean isLeft = true; // rabbit is moving to leftSide first when it starts if true
		
		while (runForever == true) {
			System.out.println("Carrot");
			Thread.sleep(1000);//every 1 second it moves
			isLeft = rabbit.moveRabbit(isLeft);
			rabbit.printCurrentPosition();
		}
		
		input.close();
	}

}

