public class Objects {

    public static void main(String[] args) {

        Box<String> nameBox = new Box<>("Aubierge");
        Box<Integer> ageBox = new Box<>(16);

        System.out.println(nameBox.getValue());
        System.out.println(ageBox.getValue());
    }
}

class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}