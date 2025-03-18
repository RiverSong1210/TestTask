package duplicateCounter;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesStringCounter {

    public Map<String, Integer> getWordFrequency(List<String> words) {
        Map<String, Integer> stat = new TreeMap<>();

        for (String word : words) {
            if (stat.containsKey(word)) {
                int oldAmount = stat.get(word);
                oldAmount++;
                stat.put(word, oldAmount);
            } else {
                stat.put(word, 1);
            }
        }
        return stat;
    }


    public Map<String, Integer> getWordFrequencyStream(List<String> words) {
        return words.stream().collect(
                Collectors.groupingBy(word -> word, TreeMap::new, Collectors.summingInt(word -> 1)));

    }

    public Map<String, Integer> getSortedStat(List<String> words) {
        Map<String, Integer> stat = getWordFrequency(words);
        Map<String, Integer> result = new LinkedHashMap<>();

        List<Map.Entry<String, Integer>> keys = new ArrayList<>(stat.entrySet());

        keys.sort(Map.Entry.comparingByValue());
        Collections.reverse(keys);

        for (Map.Entry<String, Integer> entry : keys) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;

    }


}
