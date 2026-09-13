package model;

public class Student {

    private int id;
    private String name;
    private String email;
    private String program;
    private StudentStatus status;

    public Student(
            int id,
            String name,
            String email,
            String program,
            StudentStatus status
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.program = program;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProgram() {
        return program;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public void display() {

        System.out.println(
                "ID: " + id
                + " | Name: " + name
                + " | Email: " + email
                + " | Program: " + program
                + " | Status: " + status
        );
    }
}