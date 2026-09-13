package model;

import exception.InvalidStudentException;

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

        validateId(id);
        validateText(name, "Student name");
        validateEmail(email);
        validateText(program, "Program");

        if (status == null) {
            throw new InvalidStudentException(
                    "Student status cannot be null."
            );
        }

        this.id = id;
        this.name = name;
        this.email = email;
        this.program = program;
        this.status = status;
    }

    private void validateId(int id) {

        if (id <= 0) {
            throw new InvalidStudentException(
                    "Student ID must be greater than 0."
            );
        }
    }

    private void validateText(String value, String fieldName) {

        if (value == null || value.isBlank()) {
            throw new InvalidStudentException(
                    fieldName + " cannot be empty."
            );
        }
    }

    private void validateEmail(String email) {

        if (email == null
                || email.isBlank()
                || !email.contains("@")) {

            throw new InvalidStudentException(
                    "Student email is invalid."
            );
        }
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

        validateText(name, "Student name");
        this.name = name;
    }

    public void setEmail(String email) {

        validateEmail(email);
        this.email = email;
    }

    public void setProgram(String program) {

        validateText(program, "Program");
        this.program = program;
    }

    public void setStatus(StudentStatus status) {

        if (status == null) {
            throw new InvalidStudentException(
                    "Student status cannot be null."
            );
        }

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