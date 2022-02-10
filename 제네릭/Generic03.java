package 제네릭;

public class Generic03 {
    public static void main(String[] args) {
    
        AnimalList<Cat> catList = new AnimalList<Cat>();
        catList.add(new Cat());
        
        AnimalList<LandAnimal> dogList = new AnimalList<LandAnimal>();
        dogList.add(new Dog());
        
        AnimalList.cryingAnimalList(catList);
        AnimalList.cryingAnimalList(dogList);
        
    }
	
}


/**
 * <?>           // 타입 변수에 모든 타입을 사용할 수 있음.
 * <? extends T> // T 타입과 T 타입을 상속받는 자손 클래스 타입만을 사용할 수 있음.
 * <? super T>   // T 타입과 T 타입이 상속받은 조상 클래스 타입만을 사용할 수 있음.
 */

