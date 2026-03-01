// Program 4 - Compute Distance and Time using user inputs for cities and values

import java.util.Scanner;

class Problem4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user inputs for city names
        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();

        // Take distances from user (km)
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + ": ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + ": ");
        double viaToFinalCity = sc.nextDouble();

        // Take time (in minutes)
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " (minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        // Compute total distance and time
        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display results
        System.out.println("The Total Distance travelled by " + fromCity + " → " + viaCity + " → " + toCity +
                           " is " + totalDistance + " km");

        System.out.println("The Total Time taken is " + totalTime + " minutes");
    }
}