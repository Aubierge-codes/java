public class Exceptions {

    public static void main(String[] args) {

        try {

            int number = 10;
            int result = number / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("You cannot divide by zero.");
        }

        System.out.println("Program continues running.");
    }
}