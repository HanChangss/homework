package abstractTest;

public abstract class Animal extends Creature{
    
    public Animal(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void attack() {
        System.out.println("멍멍이 펀치로 공격!");
    }
    /**
     * 추상클래스에서는 전부다 오버라이드를 할 필요가 없다... 다른 클래스에게 넘겨줄 수 있음.. 그럼 추후 Animal 또는 Creature를 상속시 
     */
}
