# Design Pattern
Design Pattern in Java

Author Info
-----------
Author: Andrew Gurung <br>
URL: http://www.andrewgurung.com/

-----------

## Inheritance
[Inheritance Source Code](DesignPatterns/src/inheritance)

### Class
- Class is a blueprint
  - Fields (Instance variables)
  - Methods (Functions)
- Instance variables are declared in the class
- Local variables are declared in a methods

### Inheritance
- Abstract out common features and put them in `super` class
- Then override or extend methods in `sub` class
- Subclasses have all the methods of super class
  - super(): Calling `super()` method from subclass will call the parent constructor
- Best Practice: Use inheritance only if there exists 'is-a' or 'has-a' relationship
- Do not use inheritance just for the sake of code reuse

### Encapsulation
- Hide data by declaring variables as `private`
- Use `public` getters and setters to access them
- Encapsulation can also perform some data validation
```
private int weight;
void setWeight(int newWeight) {
  if (newWeight > 0) {
    weight = newWeight;
  } else {
    System.out.println("Please enter a weight greater than zero");
  }
}
```

### Pass by value VS Pass by reference
- Primitive data types are passed by value
- Objects are passed by reference

-----------

## Polymorphism
[Polymorphism Source Code](DesignPatterns/src/polymorphism)

- Polymorphism allows us to write methods that don't need to change if new subclasses are created
- Subclass can add a new method or override a method without affecting the parent class
- Different subclasses' object can be added in one array by defining parent class
```
Animal doggy = new Dog();
Animal kitty = new Cat();
Animal[] animals = new Animal[4];
animals[0] = doggy;
animals[1] = kitty;
System.out.println("Doggy says: " + animals[0].getSound()); // Doggy says: Bark
System.out.println("Kitty says: " + animals[1].getSound()); // Kitty says: Meow
```

### Casting object
- Subclass objects declared as parent types cannot access methods that weren't declared in parent
- To access them, we need to cast the object

Subclass `Dog` has a custom digHole() method that isn't in parent class `Animal`
```
public class Dog extends Animal{
	public void digHole() {
		System.out.println("Dug a hole");
	}
  ...
}
```

App.java
```
Animal doggy = new Dog();
doggy.digHole(); // --> Error undefined for type Animal
(Dog(doggy)).digHole(); // Cast to subclass type
```

### Static reference to the non-static field
- Cannot call a non-static variable or method inside a static method
```
public class Animal {
  int num = 10;
  void hello() { System.out.println("Hello"); }

  public static void main(String[] args) {
    System.out.println(num); // Error non-static variable
    hello(); // Error non-static method
  }
}
```

### Abstract class
- Allows to use polymorphism without any extra work
- Syntax: `public abstract class Creature`
- All methods don't have to be abstract
- There aren't any abstract fields
- Can have static methods
- Abstract classes cannot be instantiated. ie Cannot make objects out of abstract classes. However can be extended

Creature.java
```
public abstract class Creature {
	protected String name;

	public abstract void setName(String newName);
	public abstract void getName();
  // ...
}

```

Giraffe.java
```
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
  // ...
}
```

App.java
```
Giraffe giraffe = new Giraffe();
giraffe.setName("Frank");
System.out.println(giraffe.getName()); // Frank
```

### Interface
- A class with only abstract methods
- A class can `implement` multiple interfaces
- By default all methods inside an interface is abstract. No need to append `abstract` before method names
- Syntax: `public interface Living`

-----------

## Strategy Design Pattern
[Source Code](DesignPatterns/src/strategy)
- Dynamically change an algorithm used by an object at run time
- Separates behavior from super and subclasses
![Strategy Design Pattern](https://upload.wikimedia.org/wikipedia/commons/4/45/W3sDesign_Strategy_Design_Pattern_UML.jpg)

-----------

## Observer Design Pattern
[Source Code](DesignPatterns/src/observer)
- The subject (Publisher) maintains a list of its dependents
- The dependents are called observers (Subscribers)
- Publisher notifies observers automatically of any state changes, usually by calling one of their methods
![Observer Design Pattern](https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/854px-Observer.svg.png)

-----------

## Factory Design Pattern

-----------

## Abstract Factory Design Pattern

-----------

## Singleton Design Pattern

-----------
