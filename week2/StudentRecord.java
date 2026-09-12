public class StudentRecord {

    public static void main(String[] args) {

        Student student1 =
                new Student("Aubierge", 16, "Software Development");

        Student student2 =
                new Student("Flora", 17, "Embedded Systems");

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name());
        System.out.println("Age: " + student1.age());
        System.out.println("Program: " + student1.program());

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name());
        System.out.println("Age: " + student2.age());
        System.out.println("Program: " + student2.program());

        System.out.println(
                "\nAre students equal? " + student1.equals(student2)
        );
    }
}

record Student(String name, int age, String program) {
}