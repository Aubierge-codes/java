public class Methods {
 
      public static void main(String[] args) {
        sayHello("Aubierge", 25);
        sayHello("Flora", 30);

        int sum = add(5, 10);
        System.out.println("The sum is: " + sum);
    }

    public static void sayHello(String name, int age) {
    System.out.println("Hello, " + name + "!"  + "You are " + age + " years old.");
    }

    public static int add(int a, int b) {
    return a + b;
}

}
