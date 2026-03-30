import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalStudents = 10;
        int[] ages = new int[totalStudents];
        int votingAge = 18;
        
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            
            if (ages[i] < 0) {
                System.err.println("Invalid age. Age cannot be negative.");
                System.exit(0);
            }
        }
        
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= votingAge) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        
        input.close();
    }
}
