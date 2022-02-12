package andersenlab.lesson4;

public class Dog extends Animal {
    private static int count;
    private final int MAX_DISTANCE_RUN = 500;
    private final int MAX_DISTANCE_SWIM = 10;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.println("Dog " + name + " ran: " + distance + " m.");
        } else {
            System.out.println("The maximum running distance for a dog is 500 m. Enter a correct value.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_DISTANCE_SWIM) {
            System.out.println("Dog " + name + " swam: " + distance + " m.");
        } else {
            System.out.println("The maximum swimming distance for a dog is 10 m. Enter a correct value.");
        }
    }

    @Override
    public void info() {
        System.out.println("Dog: " + name);
    }

    public void infoDogsCreated() {
        System.out.println("Dogs created = " + count);
    }
}
