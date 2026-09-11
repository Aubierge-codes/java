public class StaticMembers {

    public static void main(String[] args) {

        Student student1 = new Student("Aubierge");
        Student student2 = new Student("Flora");

        student1.display();
        student2.display();

        System.out.println("Total students: " + Student.getStudentCount());
    }
}

class Student {

    private String name;

    private static int studentCount = 0;

    public Student(String name) {

        this.name = name;
        studentCount++;
    }

    public void display() {

        System.out.println("Student: " + name);
    }

    public static int getStudentCount() {

        return studentCount;
    }
}