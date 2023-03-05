package io.javabrains.javabasics;

import javax.swing.plaf.synth.SynthStyle;

/*
1.  Create a class called `Car` with member variables for the make, model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */
class Car {
    String make, Model;
    int Year;

    Car(String make, String Model, int Year) {
        this.make = make;
        this.Model = Model;
        this.Year = Year;
    }

    String getmake() {
        return this.make;
    }

    String getModel() {
        return this.Model;
    }

    int getYear() {
        return this.Year;
    }

    String CarDetails() {
        return this.make + " " + this.Model + " " + Integer.toString(this.Year);
    }

}

public class ClassesAndObjects {

    public static void main(String[] args) {
        Car c = new Car("Toyoto", "Camry", 2020);
        System.out.println("Make : " + c.getmake());
        System.out.println("Model : " + c.getModel());
        System.out.println("Year : " + c.getModel());
        System.out.println("Details : " + c.CarDetails());
    }
}
