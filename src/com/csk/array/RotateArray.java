package com.csk.array;

import java.util.Arrays;

public class RotateArray {

    // input = 1, 2, 3, 4, 5   - 2
    // output = 3, 4, 5, 1, 2


    static void rotate(int[] arr, int r) {

        reverse(arr, 0, r-1);
        reverse(arr, r, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = new int[] {1, 2, 3, 4, 5};

        rotate(arr1, 2);

        Arrays.stream(arr1).forEach(System.out::print);
    }
}
