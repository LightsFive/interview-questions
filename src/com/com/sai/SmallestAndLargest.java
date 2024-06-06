package com.com.sai;

import java.util.List;
import java.util.stream.Collectors;

public class SmallestAndLargest {

    static void findSmallestAndLargest(int[] arr, int n) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i=0; i < n; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest = " + largest + "; Samllest = " + smallest);
    }

    public static void main(String[] args) {

        int[] inputArr = {10,43,27,98,75,59,191};

        findSmallestAndLargest(inputArr, inputArr.length);

        var result = List.of(1, 2)
                .stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.summarizingInt(i -> i)));
    }
}
