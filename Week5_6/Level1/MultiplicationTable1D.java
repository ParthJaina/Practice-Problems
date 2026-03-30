import java.util.Scanner;

class MultiplicationTable1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number for its multiplication table: ");
        int number = input.nextInt();
        
        int maxMultiplier = 10;
        int[] table = new int[maxMultiplier];
        
        for (int i = 1; i <= table.length; i++) {
            table[i - 1] = number * i;
        }
        
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= table.length; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
        
        input.close();
    }
}
