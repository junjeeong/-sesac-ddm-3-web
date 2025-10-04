package Ch16_Lamda_Stream;

import java.util.Arrays;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        List<Integer> StringLengthArray = words.stream()
                .map(word -> word.split(""))
                .map(string -> string.length)
                .toList();

        System.out.println(StringLengthArray);
    }
}
