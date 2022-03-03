package com.company.javaopp.inherit;
public class inheritance {

    public static class Vehicle {
        protected String brand = "Ford";

        public void honk() {
            System.out.println("Tuut, tuut!");
        }
    }

    public static class Car extends Vehicle {
        private String modelName = "Mustang";

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }
    }
}
