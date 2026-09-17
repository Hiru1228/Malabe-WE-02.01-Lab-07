import java.util.Scanner;

public class IT26101928Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Variables to store marks
        double mark1, mark2, mark3, mark4, average;
        
        // Input marks
        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextDouble();
        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextDouble();
        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextDouble();
        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextDouble();
        
        // Calculate average
        average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        
        // Determine grade
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        // Output results
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);
        
        input.close();
    }
}
