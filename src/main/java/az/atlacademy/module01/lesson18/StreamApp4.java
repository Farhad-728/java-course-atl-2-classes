package az.atlacademy.module01.lesson18;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamApp4 {
    public static void main(String[] args) {
        Map<Integer, Long> nums = new Random()
                .ints(20, 0, 10)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), counting()));

        System.out.println(nums);

        IntSummaryStatistics stats = nums
                .keySet()
                .stream()
                .mapToInt(integer -> integer.intValue())
                .summaryStatistics();

        Long maxCount = nums.get(stats.getMax());
        Long minCount = nums.get(stats.getMin());
        System.out.println(minCount);
        System.out.println(maxCount);

    }
}