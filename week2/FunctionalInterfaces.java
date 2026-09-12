public class FunctionalInterfaces {

    public static void main(String[] args) {

        Calculator addition = new Calculator() {

            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println(
                "10 + 5 = " + addition.calculate(10, 5)
        );


        Calculator multiplication = new Calculator() {

            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        System.out.println(
                "10 * 5 = " + multiplication.calculate(10, 5)
        );
    }
}

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}