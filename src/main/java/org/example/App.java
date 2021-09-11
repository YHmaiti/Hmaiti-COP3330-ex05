/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program prompts for two numbers. Prints the sum,
// difference, product, and quotient of those numbers as shown in
// the assignment prompt

package org.example;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // Variables declaration that will store the multiple results
        // of the operations that need to be executed using the first
        // and second number
        int sum;
        int subtraction;
        int multiplication;
        int division;

        // prompt the user for the first number
        System.out.print("What is the first number? ");

        // store the first number as a string then convert it
        // to a numerical value of type integer
        String firstnum = scanner.nextLine();
        int first = Integer.valueOf(firstnum);

        // check if the value entered is negative
        // if so ask the user to enter a positive number instead
        while (first < 0) {

            System.out.print("Please enter a positive number!!");
            System.out.println("What is the first number? ");
            firstnum = scanner.nextLine();
            first = Integer.valueOf(firstnum);

        }

        // prompt the user for the second number and store is as a string
        // then convert it to a numerical value of type integer
        System.out.print("What is the second number? ");
        String secondnum = scanner.nextLine();
        int second = Integer.valueOf(secondnum);

        // check if the value entered is negative
        // if so ask the user to enter a positive number instead
        while (second < 0) {

            System.out.print("Please enter a positive number!!");
            System.out.println("What is the second number? ");
            secondnum = scanner.nextLine();
            second = Integer.valueOf(secondnum);

        }

        // execute the mathematical operations required and store them
        // in the appropriate variables
        sum = first + second;
        subtraction = first - second;
        multiplication  = first * second;
        division = first / second;

        // output as requested by the assignment
        System.out.print(first + " + " + second + " = " + sum + "\n" + first + " - " + second + " = " + subtraction + "\n" + first + " * " + second + " = " + multiplication + "\n" + first + " / " + second + " = " + division);

    }

}
