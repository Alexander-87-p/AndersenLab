package andersenlab.lesson4;

public class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik");
        dog.swim(15);
        dog.run(100);

        Plate plate = new Plate(40);

        Cat[] cats = new CatsCreator().createCatsArray();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }
        plate.addFood(15);
        plate.info();

        cats[1].run(75);
        cats[3].swim(1);
        dog.infoAnimalsCreated();
        dog.infoDogsCreated();
        cats[2].infoCatsCreated();

        Payment payment = new Payment();
        payment.addProduct(new Payment.Product("Salt", 10));
        payment.addProduct(new Payment.Product("Bread", 20));
        payment.addProduct(new Payment.Product("Sugar", 15));
        payment.info();
        payment.deleteProduct(2);
        payment.info();

        Park park = new Park();
        park.addAttraction(new Park.Attraction("Ships", "10.00 - 20.00", 10));
        park.addAttraction(new Park.Attraction("Shooting range", "10.00 - 20.00", 15));
        park.addAttraction(new Park.Attraction("Race", "10.00 - 20.00", 20));
        park.info();
        park.deleteAttraction(1);
        park.info();
    }
}
