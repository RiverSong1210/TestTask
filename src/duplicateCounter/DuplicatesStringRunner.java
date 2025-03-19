package duplicateCounter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static duplicateCounter.DuplicatesStringCounter.getWordFrequency;

public class DuplicatesStringRunner {
    public static void main(String[] args) {

        DuplicatesStringCounter fd = new DuplicatesStringCounter();

        List<String> words = Arrays.asList(
//                "apple", "apple", "apple",
//                "banana", "banana", "banana",
//                "cherry", "cherry",
//                "date", "date", "date", "date",
//                "elderberry", "elderberry", "elderberry",
//                "fig", "fig", "fig", "fig", "fig", "fig", "fig", "fig",
//                "grape", "grape", "grape",
//                "honeydew", "honeydew", "honeydew",
//                "kiwi",
//                "lemon", "lemon", "lemon",
                "cat", "cat", "mary", "mary", "mary", "dog"
        );



        Map<String, Integer> myWordsStat = getWordFrequency(words);

        for (Map.Entry<String, Integer> entry : myWordsStat.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
