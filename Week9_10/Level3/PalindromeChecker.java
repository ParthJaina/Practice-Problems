import java.util.Scanner;

class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a text to check for palindrome: ");
        String text = sc.next();
        
        boolean result = isPalindrome(text);
        
        if (result) {
            System.out.println("The text '" + text + "' is a Palindrome.");
        } else {
            System.out.println("The text '" + text + "' is NOT a Palindrome.");
        }
        
        sc.close();
    }
}
