package andersenlab.lesson4;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int i) {
        if (food < i) {
            System.out.println("Not enough food");
        } else {
            food -= i;
        }
    }

    public void addFood(int i) {
        food += i;
    }

    public void info() {
        System.out.println("plate: " + food + " units of food");
    }
}
