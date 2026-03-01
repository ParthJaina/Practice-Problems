// Program 2 - Convert Fahrenheit temperature to Celsius

import java.util.Scanner;

class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take temperature in Fahrenheit from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Formula: (F − 32) × 5/9
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }
}