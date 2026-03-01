// Program 2 - Area of Triangle in square inches and square centimeters

class Problem2 {
    public static void main(String[] args) {

        // Base and height of triangle
        double base = 14.0;  // inches
        double height = 6.0; // inches

        // Formula: 1/2 * base * height
        double areaSqInches = 0.5 * base * height;

        // Convert sq inches to sq cm (1 in = 2.54 cm → 1 sq in = 6.4516 sq cm)
        double areaSqCm = areaSqInches * 6.4516;

        // Display results
        System.out.println("The area of the triangle in square inches is " + areaSqInches +
                           " and in square centimeters is " + areaSqCm);
    }
}