public class StudentStatus {

    public static void main(String[] args) {

        Student student = new Student(
            "Aubierge",
            Status.ACTIVE
        );

        student.displayStatus();
    }
}

enum Status {

    ACTIVE,
    INACTIVE,
    GRADUATED
}

class Student {

    private String name;
    private Status status;

    public Student(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public void displayStatus() {

        System.out.println(
            name + " is currently " + status
        );
    }
}