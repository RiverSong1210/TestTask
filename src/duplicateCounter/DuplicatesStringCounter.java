package duplicateCounter;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DuplicatesStringCounter {

    public static Map<String, Integer> getWordFrequency(List<String> words) {

        Map <String, Integer>  result = new TreeMap<>();

//        for (String word : words) {
//            if (result.containsKey(word)) {
//                result.put(word, result.get(word) +1);
//            } else {
//                result.put(word, 1);
//            }
//        }

        for (String word :words) {
            result.put(word, Collections.frequency(words, word));
        }

        return result;
    }

}
