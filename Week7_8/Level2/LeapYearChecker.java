import java.util.Scanner;

class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int year = input.nextInt();
        
        if (year >= 1582) {
            boolean result = isLeapYear(year);
            if (result) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.err.println("Year must be >= 1582.");
            System.exit(0);
        }
        
        input.close();
    }
}
