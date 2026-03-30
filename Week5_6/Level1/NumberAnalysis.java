import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int arraySize = 5;
        int[] numbers = new int[arraySize];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative.");
            } else {
                System.out.println(numbers[i] + " is Zero.");
            }
        }
        
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        
        System.out.println("\nComparison:");
        if (firstElement == lastElement) {
            System.out.println("First and last elements are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
        
        input.close();
    }
}
