// Program 5 - Divide pens among students and find the remainder

class Problem5 {
    public static void main(String[] args) {

        // Total pens and number of students
        int totalPens = 14;
        int students = 3;

        // Find pens per student (quotient)
        int pensPerStudent = totalPens / students;

        // Find remaining pens (remainder)
        int remainingPens = totalPens % students;

        // Display results
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}