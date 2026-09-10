public class Objects {

    public static void main(String[] args) {

        try {

            registerStudent(15);

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }
    }

    public static void registerStudent(int age)
            throws InvalidAgeException {

        if (age < 16) {
            throw new InvalidAgeException(
                "Student must be at least 16 years old."
            );
        }

        System.out.println("Student registered.");
    }
}

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}