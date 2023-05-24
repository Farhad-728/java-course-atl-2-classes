package az.atlacademy.module01.lesson17;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        IntSummaryStatistics stats = new Random()
                .ints(0, 30)
                .limit(15)
                .summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());

        Function<Integer, Integer> function = new Function<>() {
            @Override
            public Integer apply(Integer num) {
                return Integer.valueOf(num + " " + num);
            }
        };
    }
}
