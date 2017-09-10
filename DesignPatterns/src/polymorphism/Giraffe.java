package polymorphism;

public class Giraffe extends Creature {
	private String name;

	@Override
	public void setName(String newName) {
		name = newName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setWeight(double newWeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSound(String newSound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return null;
	}

}
