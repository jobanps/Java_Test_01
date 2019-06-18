package problem3;

public class Rabbit {
	
	// -----------
	// PROPERTIES
	// -----------
	private int xPosition;
	private int yPosition;
	
	
	// -----------
	// CONSTRUCTOR 
	// ------------
	public Rabbit(int xPos, int yPos) {
		
		this.xPosition = xPos;
		this.yPosition = yPos;

	}
	
	// -----------
	// METHODS 
	// ------------
	public void printCurrentPosition() {
		System.out.println("The current position of the rabbit is : x : "+ xPosition + " , y: " + yPosition );
	}
	
	public boolean moveRabbit(boolean isLeft) {
		
		int diff = 0;
		
		if(isLeft) {				
			if(xPosition >= 15) {
				xPosition = xPosition - 15; // moves to left forever by 15points
				System.out.println("Rabbit moving to LEFT");
				return true;
			} else {
				diff = 15 - xPosition;
				xPosition = diff;
				System.out.println("Rabbit moving to RIGHT");
				return false; //changed sides
			}
			
		} else {
			// 500 - 15 = 485 to make sure it reaches end of wall
			if(xPosition <= 485) {
				xPosition = xPosition + 15; // moves to left forever by 15points
				System.out.println("Rabbit moving to RIGHT");
				return false; // moving to right so isLeft = false;
				} else {
				diff = 500 - xPosition;
				xPosition = 485 + diff;
				System.out.println("Rabbit moving to LEFT");
				return true;
			}
			
		}
	}

	public void sayHello() {
		System.out.println("Hello! I am a rabbit!");
	}
	
	// ----------------
	// ACCESSOR METHODS
	// ----------------
	
	// Put all your accessor methods in this section.
	
	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
}