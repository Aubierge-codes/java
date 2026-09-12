public class LambdaExpressions {

    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;

        Calculator multiplication = (a, b) -> a * b;

        Calculator subtraction = (a, b) -> a - b;

        System.out.println(
                "10 + 5 = " + addition.calculate(10, 5)
        );

        System.out.println(
                "10 * 5 = " + multiplication.calculate(10, 5)
        );

        System.out.println(
                "10 - 5 = " + subtraction.calculate(10, 5)
        );
    }
}

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}