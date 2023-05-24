package az.atlacademy.module01.lesson17;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApp3 {
    public static void main(String[] args) {
        final String line = "GARABAGH";
        char[] chars = line.toCharArray();

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : chars) {
            Integer count = counts.get(c);
            if (count == null) {
                counts.put(c, 1);
            } else {
                counts.put(c, count + 1);
            }
        }
        System.out.println(counts);

        Map<Character, Integer> counts2 = new HashMap<>();
        for (char c : chars) {
            counts2.merge(c, 1, Integer::sum);
        }
        System.out.println(counts2);

        Map<Integer, Integer> counts4 = line
                .chars()
                .boxed()
                .collect(Collectors.toMap(k -> k, v -> 2, Integer::sum));
        System.out.println(counts4);

        Map<Integer, Long> counts3 = line
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(counts3);
    }

}
