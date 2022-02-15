package andersenlab.lesson5;

public class Apple extends Fruit {

    public Apple() {
        super.weight = 10;
    }

    @Override
    public String toString() {
        return "Apple: " + "weight = " + weight;
    }
}
