package andersenlab.lesson4;

public class CatsCreator {
    public Cat[] createCatsArray() {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 12);
        cats[1] = new Cat("Myrka", 10);
        cats[2] = new Cat("Pyshok", 20);
        cats[3] = new Cat("Kyzia", 8);
        cats[4] = new Cat("Vafelka", 13);
        return cats;
    }
}
