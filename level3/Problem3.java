// Program 3 - Calculate Total Income using Salary and Bonus

import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Input bonus
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        // Compute total income
        double totalIncome = salary + bonus;

        // Display result
        System.out.println("The salary is INR " + salary + 
                           ", and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);
    }
}