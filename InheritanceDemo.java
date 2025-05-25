class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The Cat Meow.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();   // Inherited method
        myCat.meow();  // Cat's own method
    }
}