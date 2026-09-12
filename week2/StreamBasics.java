import java.util.ArrayList;

public class StreamBasics {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("All numbers:");

        numbers.stream()
                .forEach(number -> System.out.println(number));

        System.out.println("\nEven numbers:");

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));

        long count = numbers.stream()
                .filter(number -> number > 15)
                .count();

        System.out.println("\nNumbers greater than 15: " + count);
    }
}