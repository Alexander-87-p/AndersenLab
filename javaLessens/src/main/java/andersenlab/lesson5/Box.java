package andersenlab.lesson5;

import java.util.ArrayList;

public class Box {
    ArrayList<Fruit> fruitInBox = new ArrayList<Fruit>();
    boolean isEmpty = true;

    public void addFruit(Fruit fruit) {
        isEmpty = false;
        if (fruitInBox.size() == 0) {
            fruitInBox.add(fruit);
        } else if (fruitInBox.get(0).equals(fruit)) {
            fruitInBox.add(fruit);
        } else {
            System.out.println("The fruit is not fits, choose another fruit.");
        }
    }

    public int getWeight() {
        return fruitInBox.size() * fruitInBox.get(0).getWeight();
    }

    public boolean compare(Box secondBox) {
        return getWeight() == secondBox.getWeight();
    }

    @Override
    public String toString() {
        if (isEmpty) {
            return "This box is empty.";
        } else {
            return "Fruit in box =" + fruitInBox;
        }
    }
}
