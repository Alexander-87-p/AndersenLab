package andersenlab.lesson5;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Object[] array = new Object[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        Swapper.swapsTwoElementsAnArray(array, 1, 3);
        System.out.println(Arrays.toString(array));

        Orange orange = new Orange();
        Apple apple = new Apple();

        System.out.println(orange);
        System.out.println(apple);

        Box boxTwoApples = new Box();
        boxTwoApples.addFruit(apple);
        boxTwoApples.addFruit(apple);
        boxTwoApples.addFruit(orange);
        System.out.println(boxTwoApples.getWeight());

        Box boxOrange = new Box();
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        System.out.println(boxOrange.getWeight());

        Box boxThreeApples = new Box();
        boxThreeApples.addFruit(apple);
        boxThreeApples.addFruit(apple);
        boxThreeApples.addFruit(apple);

        System.out.println(boxTwoApples.compare(boxOrange));
        System.out.println(boxTwoApples.compare(boxTwoApples));

        Box emptyBox = new Box();
        System.out.println(emptyBox);

        TransferFruit.transferringFruit(boxTwoApples, boxOrange);
        System.out.println(boxTwoApples);

        TransferFruit.transferringFruit(boxTwoApples, boxThreeApples);
        System.out.println(boxTwoApples);
        System.out.println(boxThreeApples);
    }
}
