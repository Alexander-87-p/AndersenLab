package andersenlab.lesson4;

public class Cat extends Animal {
    private static int count;
    private final int MAX_DISTANCE_RUN = 200;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        this.satiety = false;
        count++;
    }

    public void eat(Plate plate) {
        if (plate.food < appetite) {
            System.out.println("Little food for " + name + ".");
        } else {
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.println("Cat " + name + " ran: " + distance + " m.");
        } else {
            System.out.println("The maximum running distance for a cat is 200 m. Enter a correct value.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can not swim!!!");
    }

    @Override
    public void info() {
        System.out.println("Cat: " + name + " satiety is: " + satiety);
    }

    public void infoCatsCreated() {
        System.out.println("Cats created = " + count);
    }
}
