package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

    public static void main(String[] args) {

        var map = new HashMap<Integer, String>();

        map.put(1, "Sai");
        map.put(2, "Krishna");
        map.put(3, "Reddy");
        map.put(4, "Chityala");

        map.forEach((key, value) -> System.out.println(key + " " + value));

        var entrySet = map.entrySet();

        for (Map.Entry entry: entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // List
        List.of("Sai", "Krishna")
                .forEach(System.out::println);
    }
}
