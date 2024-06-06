package com.com.sai;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    public static void main(String[] args) {



        String[] arr1 = new String[] {"Sai", "Krishna", "Sai", "Mohan"};

        String[]  arr = {"abc", "java", "john", "java", "john" };

        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                System.out.println(arr[i]);
            }
            map.put(arr[i], i);
        }
    }
}
