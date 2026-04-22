import java.util.Scanner;

class StringCompare {
    // Method to compare strings using charAt
    public static boolean compareWithCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        
        boolean manualResult = compareWithCharAt(s1, s2);
        boolean builtInResult = s1.equals(s2);
        
        System.out.println("Result using user-defined charAt() method: " + manualResult);
        System.out.println("Result using built-in equals() method: " + builtInResult);
        
        sc.close();
    }
}
