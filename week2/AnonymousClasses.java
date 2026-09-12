public class AnonymousClasses {

    public static void main(String[] args) {

        Animal animal = new Animal() {

            @Override
            public void makeSound() {
                System.out.println("The animal makes a sound.");
            }
        };

        animal.makeSound();


        Greeting greeting = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Hello, Aubierge!");
            }
        };

        greeting.sayHello();
    }
}

abstract class Animal {

    public abstract void makeSound();
}

interface Greeting {

    void sayHello();
}