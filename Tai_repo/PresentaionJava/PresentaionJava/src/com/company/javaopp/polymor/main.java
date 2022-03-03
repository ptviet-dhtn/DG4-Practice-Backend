package com.company.javaopp.polymor;

public class main {
    public static void main(String[] args) {
        polymorphism.Animal myAnimal = new polymorphism.Animal();  // Create a Animal object
        polymorphism.Animal myPig = new polymorphism.Pig();  // Create a Pig object
        polymorphism.Animal myDog = new polymorphism.Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
