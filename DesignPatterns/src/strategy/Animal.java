package strategy;

public class Animal {
	private String name;
	private int weight;
	private String sound;
	
	// Uses composition instead of inheritance
	public Flys flyType;
	
	public void setName(String newName) { name = newName; }
	public String getName() { return name; }
	
	public void setWeight(int newWeight) {
		if(newWeight > 0) {
			weight = newWeight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}
	public int getWeight() { return weight; }
	
	public void setSound(String newSound) { sound = newSound; }
	public String getSound() { return sound; }
	
	// Delegates responsibility of flying to flyType
	// Superclass doesn't care about the behavior
	public String tryToFly() {
		return flyType.fly();
	}
	
	// Used to change flyType dynamically
	public void setFlyingAbility(Flys newFlyType) {
		flyType = newFlyType;
	}
	
}
