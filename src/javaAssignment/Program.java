package javaAssignment;

import java.util.Scanner;

public class Program {


     // Displays the numbers starting from 10 and going down to 1.

    public static void printNumbersDescending() {
        for (int number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // even or odd
    public static void printEvenOrOdd() {
        for (int number = 1; number <= 10; number++) {
            if (number % 2 == 0) {
                System.out.println(number + " -> Even");
            } else {
                System.out.println(number + " -> Odd");
            }
        }
    }

    // type number
    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
    // summation two number
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();

                    String result = checkNumberType(number);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    System.out.print("Enter the first number: ");
                    int number1 = scanner.nextInt();

                    System.out.print("Enter the second number: ");
                    int number2 = scanner.nextInt();

                    int sum = calculateSum(number1, number2);
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println();

        } while (choice != 5);

        scanner.close();
    }
}
