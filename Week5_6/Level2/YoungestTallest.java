import java.util.Scanner;

class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalFriends = 3;
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[totalFriends];
        double[] heights = new double[totalFriends];
        
        for (int i = 0; i < totalFriends; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = input.nextInt();
            
            System.out.print("Enter height (in cm) for " + names[i] + ": ");
            heights[i] = input.nextDouble();
            
            if(ages[i] <= 0 || heights[i] <= 0) {
                System.err.println("Age and height must be positive values.");
                System.exit(0);
            }
        }
        
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        for (int i = 1; i < totalFriends; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + "cm.");
        
        input.close();
    }
}
