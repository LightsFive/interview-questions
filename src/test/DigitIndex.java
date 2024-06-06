package test;

import java.util.*;
import java.util.stream.Collectors;

public class DigitIndex {

    /*
“Find the index of each digits from the number 24610 in given number 41716204”
Output:
2 – 5
4 – 0,7
6- 4
1 -1,3
0-6
*/

    /*

2 – 0,4,5,7
4 -0,7
6 – 4
1 – 0,1,2,3,4,5,6,7
0 - 6

*/

    static void printIndex(int a, int b) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        int aCount = 0;

        // a = 41716204


        while (a > 1) {

            int rem = a % 10;

            if (map.containsKey(rem)) {

                List<Integer> indices = map.get(rem);
                indices.add(aCount);
                map.put(rem, indices);
            } else {

                List<Integer> indices = new ArrayList<>();
                indices.add(aCount);

                map.put(rem, indices);

            }
            aCount++;

            a = a / 10;
        }

        final int aIntCount = aCount;

        System.out.println(aIntCount);

        while (b > 1) {

            int rem = b % 10;

            var multipleIndices = new ArrayList<Integer>();

            int i = 2;
            int digit = rem;

            while (rem < 10) {

                if (rem == 0) {

                    multipleIndices.addAll(printIndexForDigit(rem, map, aIntCount));
                    break;
                }

                multipleIndices.addAll(printIndexForDigit(rem, map, aIntCount));

                rem = digit * i;
                i++;
            }

            System.out.println(digit + "-" + multipleIndices);

            b = b / 10;
        }
    }


    static List<Integer> printIndexForDigit(int rem, Map<Integer, List<Integer>> map, int aIntCount) {

        if (map.containsKey(rem)) {

            List<Integer> indices = map.get(rem); // [8, 1] -> [7, 0]

            return indices.stream()
                    .map(index -> aIntCount - index - 1)
                    .sorted()
                    .collect(Collectors.toList());

        }

        return Collections.emptyList();
    }


    public static void main(String[] args) {
        System.out.println("Hello, World!");

        printIndex(41716204, 24610);
    }
}
