package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SampleTesting {


    public static void main(String[] args) {

        List<String> input = Arrays.asList("abc", "acb12", "8", "xyz2", "5");

        var sum = input.stream()
                .filter(str -> str.matches("\\w+\\d+") || str.matches("\\d+"))
                .map(str -> str.replaceAll("[^\\d+]", ""))
                .map(Integer::parseInt)
                .reduce(0, (a, b) -> a + b);

        //stringdigits.forEach(System.out::println);

        System.out.println(sum);
    }

    private static boolean isNumber(String s) {

        try {
            Integer.parseInt(s);

        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
