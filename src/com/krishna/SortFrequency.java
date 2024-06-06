package com.krishna;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortFrequency {

    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 3, 2, 2, 2, 1, 1, 2, 3,1 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {

                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        map.entrySet()
                .stream()
                .sorted((e1, e2) -> -1 * e1.getValue().compareTo(e2.getValue()))
                .forEach(entry -> {
                    int key = entry.getKey();
                    int value = entry.getValue();
                    for (int i=0; i < value; i++) {
                        System.out.print(key + ", ");
                    }
                });
    }
}
