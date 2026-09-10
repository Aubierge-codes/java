public class InterfacePolymorphism {

    public static void main(String[] args) {

        Programmer programmer1 = new CodingStudent("Aubierge");
        Programmer programmer2 = new WebStudent("Flora");

        programmer1.code();
        programmer2.code();
    }
}

interface Programmer {

    void code();
}

class CodingStudent implements Programmer {

    private String name;

    public CodingStudent(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name + " is coding Java.");
    }
}

class WebStudent implements Programmer {

    private String name;

    public WebStudent(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name + " is coding web applications.");
    }
}