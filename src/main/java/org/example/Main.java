package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double factorial(double num) {
        double fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return  fact;
    }

    public static double squareRoot(double number1) {
        return Math.sqrt(number1);
    }

    public static double power(double number1, double number2) {
        return Math.pow(number1,number2);
    }

    public static double naturalLog(double number1) {
        return number1 < 0 ? Double.NaN : Math.log(number1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Scientific Calculator using DevOps. \n Choose operation:");
            System.out.print("""
                    1. Factorial
                    2. Square root
                    3. Power
                    4. Natural Logarithm
                    5. Exit
                    Enter your choice:\s""");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of " + number1 + " is : " + factorial(number1));
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of " + number1 + " is : " + squareRoot(number1));
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+ " raised to power "+number2+" is : " + power(number1, number2));
                    System.out.println("\n");
                }
                case 4 -> {
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural Log of " + number1 + " is : " + naturalLog(number1));
                    System.out.println("\n");
                }
                default -> {
                    System.out.println("Exiting....");
                    return;
                }
            }
        } while (true);
    }
    }