import java.util.ArrayList;
import java.util.List;

public class StreamMapping {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Aubierge");
        names.add("Flora");
        names.add("Liam");
        names.add("Kevin");

        System.out.println("Original names:");

        names.stream()
                .forEach(name -> System.out.println(name));

        System.out.println("\nNames in uppercase:");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

        System.out.println("\nName lengths:");

        names.stream()
                .map(name -> name.length())
                .forEach(length -> System.out.println(length));

        System.out.println("\nLong names:");

        names.stream()
                .filter(name -> name.length() > 5)
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }
}