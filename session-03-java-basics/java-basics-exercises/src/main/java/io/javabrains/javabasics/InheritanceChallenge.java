package io.javabrains.javabasics;

import java.net.PortUnreachableException;

/*
 * 
 * 1. Create an `Animal` class with member variables for the name and age of the
 * animal and a constructor method that initializes the member variables.
 * 2. Create a `Dog` class that extends the `Animal` class and has a member
 * variable for the breed of the dog and a constructor method that initializes
 * the member variables.
 * 3. Override the `makeSound` method in the `Dog` class to print
 * "The dog barks".
 * 4. Create a `Cat` class that extends the `Animal` class and has a member
 * variable for the number of lives of the cat and a constructor method that
 * initializes the member variables.
 * 5. Override the `makeSound` method in the `Cat` class to print
 * "The cat meows".
 * 6. In the `main` method of this class, create an array of `Animal` objects
 * and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of
 * your choice.
 * 7. Loop through the array of `Animal` objects and print the name, age, and
 * sound of each animal.
 */

class Animal {
    private String name, breed;
    private int age;

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public void makeSound() {
        System.out.println("Animal makes sound : ");
    }
}

class Cat extends Animal {
    private int lives;

    public Cat(String name, int age, String breed, int lives) {
        super(name, age, breed);
        this.lives = lives;
    }

    public void makeSound() {
        System.out.println("Meow-Meow");
    }

    public int getLives() {
        return this.lives;
    }

}

class Dog extends Animal {
    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    public void makeSound() {
        System.out.println("Bow-Bow");
    }
}

class Lion extends Animal {

    public Lion(String name, int age, String breed) {
        super(name, age, breed);
    }

    public void makeSound() {
        System.out.println("Roar-Roar");
    }
}

class Cow extends Animal {

    public Cow(String name, int age, String breed) {
        super(name, age, breed);
    }

    public void makeSound() {
        System.out.println("Maa - Maa");
    }
}

public class InheritanceChallenge {

    public static void main(String args[]) {
        Animal[] arr = new Animal[4];
        arr[0] = new Dog("Tom", 8, "Rajapalayam");
        arr[1] = new Cat("kitty", 5, "Persian", 100);
        arr[2] = new Lion("Shero", 13, "RoaringLion");
        arr[3] = new Cow("Lalu", 12, "Milkycow");

        for (Animal animals : arr) {
            System.out.println("name : " + animals.getName());
            System.out.println("age : " + animals.getAge());
            System.out.println("Breed : " + animals.getBreed());

            if (animals instanceof Cat) {
                System.out.println("Number of lives :" + ((Cat) animals).getLives());
            }
            animals.makeSound();
            System.out.println();
        }
    }
}