import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Step 1: Print programming specifications
        printSpecifications();

        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[10];
        int count = 0;
        int total = 0;

        // Step 2 & 3: Input grades with loop and sentinel value 999 to quit
        while (count < grades.length) {
            System.out.print("Enter quiz grade #" + (count + 1) + " (or enter 999 to stop): ");
            int input = scanner.nextInt();

            if (input == 999) {
                break;
            }

            if (input < 0 || input > 100) {
                System.out.println("Please enter a valid grade between 0 and 100.");
                continue;
            }

            grades[count] = input;
            total += input;
            count++;
        }

        // Step 4: Print all entered grades
        System.out.println("\nGrades entered:");
        for (int i = 0; i < count; i++) {
            System.out.println("Grade #" + (i + 1) + ": " + grades[i]);
        }

        // Step 5: Compute average
        double average = (count > 0) ? (double) total / count : 0;
        System.out.printf("\nAverage grade: %.2f\n", average);

        // Step 6: Determine and display letter grade
        char letterGrade = calculateLetterGrade(average);
        System.out.println("Letter grade: " + letterGrade);

        scanner.close();
    }

    public static void printSpecifications() {
        System.out.println("Java Program Specification:");
        System.out.println("- Accepts up to 10 quiz scores from the user.");
        System.out.println("- Stops accepting input when user enters 999.");
        System.out.println("- Calculates and displays the average of entered grades.");
        System.out.println("- Displays the corresponding letter grade.");
        System.out.println("- Shows all entered quiz scores.\n");
    }

    public static char calculateLetterGrade(double average) {
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }
}
