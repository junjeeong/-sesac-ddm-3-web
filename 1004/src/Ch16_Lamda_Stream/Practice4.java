package Ch16_Lamda_Stream;

import java.util.Arrays;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;

        sum = numbers.stream()
                .mapToInt(i -> i.intValue()) // 왜 꼭 mapToInt가 있어야 할까?
                .sum();

        System.out.println("합계: " + sum); // 합계: 15
    }
}
