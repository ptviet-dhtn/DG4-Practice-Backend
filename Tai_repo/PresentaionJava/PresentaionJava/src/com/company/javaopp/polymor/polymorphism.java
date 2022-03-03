package com.company.javaopp.polymor;
public class polymorphism {

    public static class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    public static class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    public static class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

}