package andersenlab.lesson4;

import java.util.ArrayList;

public class Payment {
    ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(int numberProduct) {
        if (numberProduct == 0 || numberProduct > products.size()) {
            System.out.println("Invalid number entered");
        } else {
            products.remove(numberProduct - 1);
        }
    }

    static class Product {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product: " + name + ", price = " + price;
        }

    }

    public void info() {
        System.out.println("Products to buy " + products);
    }
}
