package com.sample;

public class FirstOccurence {

    public static int findFirst(int[] arr, int elem) {

        int l = 0;
        int r = arr.length -1;

        while (l <= r) {
            int mid = l + (r-l)/2;

            if (arr[mid] == elem && arr[mid-1] != elem) {
                return mid;
            }
            else if (arr[mid] > elem) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {



        int[] arr = new int[] {1, 2, 4, 4, 6, 9};

        System.out.println(findFirst(arr, 4));


    }
}
