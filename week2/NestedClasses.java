public class NestedClasses {

    public static void main(String[] args) {

        Student student = new Student("Aubierge", 16);

        student.showStudentInfo();

        Student.Address address =
                new Student.Address("Kigali", "Rwanda");

        address.showAddress();
    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static class Address {

        private String city;
        private String country;

        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        public void showAddress() {
            System.out.println("City: " + city);
            System.out.println("Country: " + country);
        }
    }
}