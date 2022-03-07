package andersenlab.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<Integer, String> phoneBook = new HashMap<>();

    public void add(int phone, String surname) {
        phoneBook.put(phone, surname);
    }

    public void get(String surname) {
        if (phoneBook.containsValue(surname)) {
            Set<Map.Entry<Integer, String>> collection = phoneBook.entrySet();
            for (Map.Entry<Integer, String> temp : collection) {
                if (surname.equals(temp.getValue())) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("There is no such name in the phone book");
        }
    }
}
