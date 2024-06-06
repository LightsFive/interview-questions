package com;

import java.util.*;

public class SampleProgram {

    static void printIndices(int[] arr, int n) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i=0; i < n; i++) {

            if (map.containsKey(arr[i])) {

                map.get(arr[i]).add(i);
            }
            else {
                var list = new ArrayList<Integer>();
                list.add(i);
                map.put(arr[i], list);
            }
        }

        map.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }

    static long findOpenCards(int n) {

        int[] arr = new int[n];

        for (int i=0; i < n; i++) {

            int j = i+1;

            for (int k = i; k < n; k++) {

                if ((k + 1) % j == 0) {
                    if (arr[k] == 0) {
                        arr[k] = 1;
                    }
                    else {
                        arr[k] = 0;
                    }
                }
            }
        }

        return Arrays.stream(arr)
                .filter(i -> i == 1)
                .count();
    }

    /*i/p: arr = [1, 2, 1, 3, 4, 5, 2, 1,5]


    O/p: 1 -> (0,2,7)

            2 -> (1,6)

            3-> (3)

            4-> (4)

            5-> (5,8)*/

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 1, 3, 4, 5, 2, 1,5};

        printIndices(arr, arr.length);

        System.out.println(findOpenCards(2));
        System.out.println(findOpenCards(4));
        System.out.println(findOpenCards(5));
        System.out.println(findOpenCards(6));
    }
}
