# Design Pattern
Design Pattern in Java

Author Info
-----------
Author: Andrew Gurung <br>
URL: http://www.andrewgurung.com/

-----------

## Inheritance
[Source Code](/src/inheritance)

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
