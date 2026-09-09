public class Objects {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Aubierge";
        student1.age = 16;
        student1.school = "High School";
        student1.study();
        student1.introduce();
        System.out.println(student1.pass(75));
        System.out.println(student1.pass(40));
    }
}

class Student {

    String name;
    int age;
    String school;
    char grade;
    
    

    void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    void study() {
    System.out.println(name + " is studying.");
}

    boolean pass(int score) {
    return score >= 50;
}

}