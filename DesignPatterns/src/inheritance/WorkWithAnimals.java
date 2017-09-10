package inheritance;

public class WorkWithAnimals {
	public static void main(String[] args) {
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		
		fido.setWeight(-1);
		
		// Pass by value
		int randNum = 10;
		fido.changeVar(randNum); // randNum in method: 12
		System.out.println("randNum after method call: " + randNum); //randNum after method call: 10
		
		// Pass by reference
		changeObjectName(fido);
		System.out.println("Dog name after method call: " + fido.getName()); // Dog name after method call: Marcus
		
	}
	
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}
}