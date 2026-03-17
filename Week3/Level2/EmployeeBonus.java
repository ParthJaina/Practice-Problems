import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        double bonusPercentage = 0.05;
        if (yearsOfService > 5) {
            double bonusAmount = salary * bonusPercentage;
            System.out.println("The bonus amount is " + bonusAmount);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service");
        }
        input.close();
    }
}
