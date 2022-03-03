package com.company.javaopp.inherit;

public class main {
    public static void main(String[] args) {
        inheritance.Car myFastCar = new inheritance.Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.getModelName());
    }
}

