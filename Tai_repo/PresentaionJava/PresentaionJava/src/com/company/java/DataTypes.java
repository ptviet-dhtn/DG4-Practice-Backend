package com.company.java;

public class DataTypes {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);

        double myDou = 9.78d;
        int Int = (int) myDouble; // Manual casting: double to int
        System.out.println(myDou);
        System.out.println(Int);
    }
}
