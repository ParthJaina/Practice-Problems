import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        if (number < 0) {
            System.err.println("Invalid Number. Enter a positive number.");
            System.exit(0);
        }
        
        if (number == 0) {
            System.out.println("Frequency of digit 0 is 1");
            System.exit(0);
        }
        
        int count = 0;
        long tempCount = number;
        while (tempCount > 0) {
            count++;
            tempCount /= 10;
        }
        
        int[] digits = new int[count];
        long tempExtract = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int) (tempExtract % 10);
            tempExtract /= 10;
        }
        
        int[] frequency = new int[10];
        
        for (int i = 0; i < digits.length; i++) {
            int currentDigit = digits[i];
            frequency[currentDigit]++;
        }
        
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s).");
            }
        }
        
        input.close();
    }
}
