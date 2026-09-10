public class Objects {

    public static void main(String[] args) {

        Programmer programmer = new CodingStudent(
            "Aubierge",
            16,
            "Rwanda Coding Academy"
        );

        programmer.code();
    }
}

interface Programmer {

    void code();
}

class CodingStudent implements Programmer {

    private String name;

    public CodingStudent(String name, int age, String school) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name + " is coding in Java.");
    }
}