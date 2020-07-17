package Answer3;

import java.util.ArrayList;
import java.util.List;

public class Box <E extends Fruit> {

    private List<E> fruits = new ArrayList<>();

    public void addFruits(E fruit){
        fruits.add(fruit);
    }

    public void toBox(Box<E> anotherBox){
        for ( E fruit : fruits) {
            anotherBox.addFruits(fruit);
        }
        fruits.clear();
    }

    public boolean compareTo(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.001;
    }

    public double getWeight() {
    double sum = 0.0;
        for (E fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }


}
