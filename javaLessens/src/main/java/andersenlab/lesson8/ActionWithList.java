package andersenlab.lesson8;

import java.util.*;

public class ActionWithList {
    public static void printUniqueArrayWords(ArrayList<String> list) {
        HashSet<String> uniqueWords = new HashSet<>(list);
        System.out.println(uniqueWords);
    }

    public static void CountHowManyTimesWordIsRepeated(ArrayList<String> list) {
        Map<String, Integer> words = new HashMap<>();
        for (String wordsCount : list) {
            if (!words.containsKey(wordsCount)) {
                words.put(wordsCount, 1);
            } else {
                words.put(wordsCount, words.get(wordsCount) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + ", Repeats = " + entry.getValue());
        }
    }
}
