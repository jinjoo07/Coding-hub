import java.util.Scanner;

public class AgeGroupClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Determine the age group
        if (age >= 0 && age <= 12) {
            System.out.println("Age Group: Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Age Group: Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Age Group: Adult");
        } else if (age >= 65) {
            System.out.println("Age Group: Senior");
        } else {
            System.out.println("Invalid age entered.");
        }

        scanner.close();
    }
}
