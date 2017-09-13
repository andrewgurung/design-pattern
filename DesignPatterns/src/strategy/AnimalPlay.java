package strategy;

public class AnimalPlay {
	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly()); // Dog: I can't fly
		System.out.println("Bird: " + tweety.tryToFly()); // Bird: Flying High
		
		// Dynamically change strategy
		sparky.setFlyingAbility(new ItFlys());
		System.out.println("Dog: " + sparky.tryToFly()); // Dog: Flying High

	}
}
