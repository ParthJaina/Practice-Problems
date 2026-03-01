// Program 3 - Find side of a square from its perimeter

import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Perimeter = 4 * side
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side);
    }
}