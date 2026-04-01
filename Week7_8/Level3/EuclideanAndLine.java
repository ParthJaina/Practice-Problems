import java.util.Scanner;

class EuclideanAndLine {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        if (x1 != x2) {
            double[] equationArgs = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of line: y = " + equationArgs[0] + " * x + " + equationArgs[1]);
        } else {
            System.out.println("Vertical line, infinite slope.");
        }
        
        input.close();
    }
}
