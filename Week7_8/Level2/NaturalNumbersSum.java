import java.util.Scanner;

class NaturalNumbersSum {
    public static int sumRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        if (number > 0) {
            int recursiveResult = sumRecursive(number);
            int formulaResult = sumFormula(number);
            
            System.out.println("Recursive Sum: " + recursiveResult);
            System.out.println("Formula Sum: " + formulaResult);
            System.out.println("Are they equal? " + (recursiveResult == formulaResult));
        } else {
            System.err.println("Not a natural number.");
            System.exit(0);
        }
        
        input.close();
    }
}
