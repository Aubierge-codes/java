public class GenericMethods {

    public static void main(String[] args) {

        printValue("Aubierge");
        printValue(16);
        printValue(96.5);
        printValue(true);
    }

    public static <T> void printValue(T value) {

        System.out.println("Value: " + value);
    }
}