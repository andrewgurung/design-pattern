package polymorphism;

public abstract class Creature {
	// protected fields are like private fields except
	// subclasses can inherit them
	protected String name;
	protected int weight;
	protected String sound;
	
	public abstract void setName(String newName);
	public abstract String getName();
	
	public abstract void setWeight(double newWeight);
	public abstract double getWeight();
	
	public abstract void setSound(String newSound);
	public abstract String getSound();
}
