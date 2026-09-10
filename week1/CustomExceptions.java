public class CustomExceptions {

    public static void main(String[] args) {

        try {

            Student student = new Student("Aubierge", 16);

            student.setAge(-5);

        } catch (InvalidAgeException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) throws InvalidAgeException {

        if (age <= 0) {
            throw new InvalidAgeException("Age must be greater than zero.");
        }

        this.name = name;
        this.age = age;
    }

    public void setAge(int age) throws InvalidAgeException {

        if (age <= 0) {
            throw new InvalidAgeException("Age must be greater than zero.");
        }

        this.age = age;
    }
}

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}