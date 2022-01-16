package interfaceTest;

public class Dog implements Animal, Pet{

    @Override
    public void cry() {
        System.out.println("멍멍!");
        
    }

    @Override
    public void play() {
        System.out.println("공놀이 하자!");
        
    }
    
}
