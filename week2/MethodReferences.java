import java.util.ArrayList;

public class MethodReferences {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Aubierge");
        names.add("Flora");
        names.add("Liam");

        System.out.println("Using a lambda:");

        names.forEach(name -> System.out.println(name));

        System.out.println("\nUsing a method reference:");

        names.forEach(System.out::println);
    }
}