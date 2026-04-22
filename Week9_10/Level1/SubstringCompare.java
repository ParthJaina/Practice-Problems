import java.util.Scanner;

class SubstringCompare {
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter text: ");
            String text = sc.next();
            
            System.out.print("Enter start index: ");
            int start = sc.nextInt();
            
            System.out.print("Enter end index: ");
            int end = sc.nextInt();
            
            String manualSub = createSubstring(text, start, end);
            String builtInSub = text.substring(start, end);
            
            System.out.println("Manual Substring: " + manualSub);
            System.out.println("Built-in Substring: " + builtInSub);
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: The indices provided are out of bounds for the given string.");
        } catch (Exception e) {
            System.out.println("Exception Caught: Invalid input provided.");
        } finally {
            sc.close();
        }
    }
}
