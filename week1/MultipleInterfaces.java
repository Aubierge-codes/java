public class MultipleInterfaces {

    public static void main(String[] args) {

        CodingStudent student = new CodingStudent("Aubierge");

        student.code();
        student.study();
        student.playVolleyball();
    }
}

interface Programmer {

    void code();
}

interface Learner {

    void study();
}

interface Athlete {

    void playVolleyball();
}

class CodingStudent implements Programmer, Learner, Athlete {

    private String name;

    public CodingStudent(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name + " is coding in Java.");
    }

    @Override
    public void study() {
        System.out.println(name + " is studying Java.");
    }

    @Override
    public void playVolleyball() {
        System.out.println(name + " is playing volleyball.");
    }
}

