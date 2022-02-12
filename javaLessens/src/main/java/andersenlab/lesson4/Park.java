package andersenlab.lesson4;

import java.util.ArrayList;

public class Park {
    ArrayList<Park.Attraction> attractions = new ArrayList<Attraction>();

    public void addAttraction(Park.Attraction attraction) {
        attractions.add(attraction);
    }

    public void deleteAttraction(int numberAttraction) {
        if (numberAttraction == 0 || numberAttraction > attractions.size()) {
            System.out.println("Invalid number entered");
        } else {
            attractions.remove(numberAttraction - 1);
        }
    }

    static class Attraction {
        String name;
        String workingHours;
        int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction: " + name + ", working hours = " + workingHours + ", price = " + price;
        }
    }

    public void info() {
        System.out.println("Attractions in the park: " + attractions);
    }
}
