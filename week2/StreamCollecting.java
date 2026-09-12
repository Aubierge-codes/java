import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollecting {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Aubierge");
        names.add("Flora");
        names.add("Liam");
        names.add("Kevin");
        names.add("Ange");

        List<String> longNames = names.stream()
                .filter(name -> name.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Long names:");
        System.out.println(longNames);


        List<String> uppercaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nUppercase names:");
        System.out.println(uppercaseNames);


        List<String> selectedNames = names.stream()
                .filter(name -> name.length() >= 5)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nSelected uppercase names:");
        System.out.println(selectedNames);
    }
}