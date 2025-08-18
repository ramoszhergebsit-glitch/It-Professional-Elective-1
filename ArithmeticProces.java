public class ArithmeticProces {
    public static void main(String[] args) {
        int a = 143;
        int b = 125;

        // Addition
        if (a >= b) {
            System.out.println("Addition: " + (a + b));
        } else {
            System.out.println("Addition: " + (b + a));
        }

        // Subtraction
        if (a >= b) {
            System.out.println("Subtraction: " + (a - b));
        } else {
            System.out.println("Subtraction: " + (b - a));
        }

        // Multiplication
        if (a != 0 && b != 0) {
            System.out.println("Multiplication: " + (a * b));
        } else {
            System.out.println("Multiplication result is 0");
        }

        // Division
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }

        // Modulus
        if (b != 0) {
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Cannot find remainder (modulus) with zero");
        }
    }
}
