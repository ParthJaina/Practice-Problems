import java.util.Scanner;

class StringLengthCalculator {
    public static int calculateLengthManual(String text) {
        int count = 0;
        try {
            // Infinite loop that breaks when charAt throws an exception
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Loop naturally terminates here when index is out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        int manualLength = calculateLengthManual(text);
        int builtInLength = text.length();
        
        System.out.println("Length calculated using exception logic: " + manualLength);
        System.out.println("Length calculated using built-in length(): " + builtInLength);
        
        sc.close();
    }
}
