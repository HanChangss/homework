package abstractTest;

public abstract class Human extends Creature implements Talkable{

    public Human(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void talk() {
        System.out.println("나는 인간입니다.");
        
    }

    @Override
    public void attack() {
        System.out.println("도구를 사용 !!");
        
    }
    
}
