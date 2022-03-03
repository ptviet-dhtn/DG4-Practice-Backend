package com.company.javaopp;

public class exception {
        public static void main(String[] args) {
            try {
                int[] myNumbers = {1, 2, 3};
                System.out.println(myNumbers[10]);
            } catch (Exception e) {
                System.out.println("tôi là tài");
            } finally {
                System.out.println("Try catch");
            }
        }
}
