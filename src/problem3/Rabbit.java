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
		System.out.println("The current position of the rabbit is: ");
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