//package com.mycompany.triangleareacalculator;

import java.util.Scanner;

/**
 *
 * @author Group A
 */
public class TriangleAreaCalculator {

    private double base;
    private double height;
    private double area;

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.getInput();
        calculator.calculateArea();
        calculator.displayArea();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
    }

    public void calculateArea() {
        area = 0.5 * base * height;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + area + " cm2");
    }
}
