// Program 1 - Basic Calculator for two floating point numbers

import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter number1: ");
        float number1 = sc.nextFloat();

        System.out.print("Enter number2: ");
        float number2 = sc.nextFloat();

        // Perform operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Display results
        System.out.println("The addition, subtraction, multiplication, and division value of the two numbers "
                + number1 + " and " + number2 + " are "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}