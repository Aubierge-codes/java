class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Upcasting {

    public static void main(String[] args) {

        // UPCASTING
        Animal dog = new Dog();

        dog.eat();

        // DOWNCASTING
        Dog myDog = (Dog) dog;

        myDog.bark();


        // Another example of UPCASTING
        Animal cat = new Cat();

        cat.eat();

        // DOWNCASTING
        Cat myCat = (Cat) cat;

        myCat.meow();
    }
}