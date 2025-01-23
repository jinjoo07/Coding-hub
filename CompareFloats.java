public class CompareFloats {
    public static boolean compareFloats(double a, double b) {
        // Round both numbers to three decimal places
        a = Math.round(a * 1000) / 1000.0;
        b = Math.round(b * 1000) / 1000.0;
        return a == b;
    }

    public static void main(String[] args) {
        double num1 = 3.1415;
        double num2 = 3.1414;

        if (compareFloats(num1, num2)) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            System.out.println("The numbers are not equal up to three decimal places.");
        }
    }
}
