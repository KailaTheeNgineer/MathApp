package com.Pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 600;
        int garySalary = 300;
        int HighestSalary = Math.max(bobSalary, garySalary);
                        System.out.println("The highest salary is " + HighestSalary);
        int carPrice = 1000;
        int truckPrice = 5000;
        int minPrice = Math.min(carPrice, truckPrice);
                        System.out.println("The minimum price is " + minPrice);

        double circleRadius = 7.25;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
                        System.out.println("The area of a circle with a radius of " + circleRadius + " is " + circleArea);













    }

}
