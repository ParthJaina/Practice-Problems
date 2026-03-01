// Program 1 - Convert Celsius temperature to Fahrenheit

import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take temperature in Celsius from the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Formula: (C × 9/5) + 32
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}