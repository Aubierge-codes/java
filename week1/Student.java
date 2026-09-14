public class Student {

   private String firstName;
   private String lastName;
    private String email;

    // First constructor
    Student(String firstName) {
        this.firstName = firstName;
    }

    // Second constructor
    Student(String firstName, String lastName, String email) {
        this(firstName);

        this.lastName = lastName;
        this.email = email;
    }

    void displayStudent() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {

        Student student = new Student(
                "Aubierge",
                "Umurerwa",
                "aubierge7557@gmail.com"
        );

        student.displayStudent();
    }
}