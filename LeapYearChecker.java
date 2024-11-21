//package com.mycompany.leapyearchecker;

import java.util.Scanner;

/**
 *
 * @author Group A
 */
public class LeapYearChecker {

    public static void main(String[] args) {
        checkLeapYear();
    }

    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year of your choice: ");
        int year = scanner.nextInt();

        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
    }
}
