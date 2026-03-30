import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int totalPersons = input.nextInt();
        
        if (totalPersons <= 0) {
            System.err.println("Invalid number of persons.");
            System.exit(0);
        }
        
        double[] weights = new double[totalPersons];
        double[] heights = new double[totalPersons];
        double[] bmis = new double[totalPersons];
        String[] statuses = new String[totalPersons];
        
        for (int i = 0; i < totalPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            
            if (weights[i] <= 0 || heights[i] <= 0) {
                System.err.println("Height and Weight must be greater than zero.");
                System.exit(0);
            }
            
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < totalPersons; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + heights[i] + "m, Weight: " + weights[i] + "kg, BMI: " + bmis[i] + ", Status: " + statuses[i]);
        }
        
        input.close();
    }
}
