// Program 4 - Convert distance in feet to yards and miles

import java.util.Scanner;

class Problem4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion factors
        double yards = distanceInFeet / 3.0;
        double miles = distanceInFeet / 1760.0;

        // Display results
        System.out.println("The distance in yards is " + yards +
                           ", while the distance in miles is " + miles);
    }
}