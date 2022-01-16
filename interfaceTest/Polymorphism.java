package interfaceTest;

public class Polymorphism {
    public static void main(String[] args) {
        
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        c.play();
        d.cry();
        d.play();
    }
}
