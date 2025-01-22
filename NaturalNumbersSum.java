public class NaturalNumbersSum {
    public static void main(String[] args) {
        int n = 20; // Number of natural numbers
        int sum = 0;

        System.out.println("The first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);
    }
}
