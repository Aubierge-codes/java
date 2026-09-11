public class CustomExceptions {

    public static void main(String[] args) {

        try {
            Student student = new Student("Aubierge", -5);
            System.out.println(student.getAge());

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues.");
    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) throws InvalidAgeException {

        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }

        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}