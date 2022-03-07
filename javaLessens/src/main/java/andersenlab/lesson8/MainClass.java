package andersenlab.lesson8;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(ArrayOfSpells.setSpells());
        ActionWithList.printUniqueArrayWords(ArrayOfSpells.setSpells());
        ActionWithList.CountHowManyTimesWordIsRepeated(ArrayOfSpells.setSpells());

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(11111, "Potter");
        phoneBook.add(22222, "Potter");
        phoneBook.add(33333, "Potter");
        phoneBook.add(44444, "Granger");
        phoneBook.add(55555, "Granger");
        phoneBook.add(66666, "Weasley");
        phoneBook.add(77777, "Hagrid");
        phoneBook.add(88888, "Dumbledore");
        phoneBook.add(99999, "McGonagall");
        phoneBook.add(10000, "Snape");
        phoneBook.get("Potter");
    }
}
