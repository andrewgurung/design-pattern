package polymorphism;

public class WorkWithAnimals {
	public static void main(String[] args) {
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		System.out.println("Doggy says: " + doggy.getSound()); // Doggy says: Bark
		System.out.println("Kitty says: " + kitty.getSound()); // Kitty says: Meow
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		System.out.println("Doggy says: " + animals[0].getSound()); // Doggy says: Bark
		System.out.println("Kitty says: " + animals[1].getSound()); // Kitty says: Meow
		
		speakAnimal(doggy); // Animal says: Bark
		
		((Dog)doggy).digHole(); // Dug a hole
		
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Frank");
		System.out.println(giraffe.getName()); // Frank
 	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: " + randAnimal.getSound());
	}
}