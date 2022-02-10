package 제네릭;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        AnimalList<LandAnimal> landAnimal = new AnimalList<>();
        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat());
        landAnimal.add(new Dog());

        for(int i = 0; i < landAnimal.size(); i ++) {
            landAnimal.get(i).crying();
        }

    }
}

class AnimalList<T extends LandAnimal> {

    ArrayList<T> al = new ArrayList<T>();

    void add(T animal) { 
        al.add(animal); 
    }
    T get(int index) { 
        return al.get(index); 
    }
    boolean remove(T animal) { 
        return al.remove(animal); 
    }
    int size() { 
        return al.size(); 
    }
}

