package andersenlab.lesson5;

public class Orange extends Fruit {

    public Orange() {
        super.weight = 15;
    }

    @Override
    public String toString() {
        return "Orange: " + "weight = " + weight;
    }
}
