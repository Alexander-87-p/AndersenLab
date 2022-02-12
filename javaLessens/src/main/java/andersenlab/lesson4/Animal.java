package andersenlab.lesson4;

public class Animal {
    private static int count;
    String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
        System.out.println("Animal ran: " + distance + " m.");
    }

    public void swim(int distance) {
        System.out.println("Animal swam: " + distance + " m.");
    }

    public void info() {
        System.out.println("Name animal: " + name);
    }

    public void infoAnimalsCreated() {
        System.out.println("Animals created = " + count);
    }
}
