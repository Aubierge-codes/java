import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Aubierge");

        System.out.println("Name: " + name.get());


        Optional<String> missingName = Optional.empty();

        System.out.println(
                "Is a name present? " + missingName.isPresent()
        );


        String result = missingName.orElse("Unknown");

        System.out.println("Result: " + result);


        Optional<String> searchedName = findStudent("Flora");

        if (searchedName.isPresent()) {
            System.out.println(
                    "Student found: " + searchedName.get()
            );
        } else {
            System.out.println("Student not found.");
        }
    }

    public static Optional<String> findStudent(String name) {

        if (name.equalsIgnoreCase("Flora")) {
            return Optional.of("Flora");
        }

        return Optional.empty();
    }
}