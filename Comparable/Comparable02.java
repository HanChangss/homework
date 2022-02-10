package Comparable;

import java.util.Comparator;

public class Comparable02 {
    public static void main(String[] args) {
        
    }
}

class Car implements Comparator<Car> {

    private String modelName;

    private int modelYear;

    private String color;

    Car(String mn, int my, String c) {
        this.modelName = mn;
        this.modelYear = my;
        this.color = c;
    }

    public String getModel() {
        return this.modelYear + "식 " + this.modelName + " " + this.color;
    }
    @Override
    public int compare(Car o1, Car o2) {
        return o1.modelYear - o2.modelYear;
    }

}
