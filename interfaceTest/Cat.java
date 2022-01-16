package interfaceTest;

public class Cat implements Animal, Pet{

    @Override
    public void cry() {
        System.out.println("야옹야옹!");
        
    }

    @Override
    public void play() {
        System.out.println("캣타워 사줘!");
        
    }
    
}
