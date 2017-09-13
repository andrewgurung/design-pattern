package strategy;

public class Bird extends Animal{
	public Bird() {
		super();
		setSound("Tweet");
		
		// Set the Flys interface polymorphically
		flyType = new ItFlys();
	}
}
