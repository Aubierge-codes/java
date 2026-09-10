public class Exceptions {

    public static void main(String[] args) {

        int number = 10;
        int divisor = 0;

        try {

            int result = number / divisor;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("You cannot divide by zero.");
        }

        System.out.println("Program continues running.");
    }
}