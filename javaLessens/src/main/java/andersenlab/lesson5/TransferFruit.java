package andersenlab.lesson5;

public class TransferFruit {
    public static Box transferringFruit(Box givingBox, Box receivingBox) {
        if (givingBox.fruitInBox.get(0).equals(receivingBox.fruitInBox.get(0))) {
            receivingBox.fruitInBox.addAll(givingBox.fruitInBox);
            givingBox.isEmpty = true;
            givingBox.fruitInBox.removeAll(givingBox.fruitInBox);
        } else {
            System.out.println("Boxes with different fruits.");
        }
        return receivingBox;
    }
}
