package org.example.java;

import java.util.HashMap;
import java.util.Map;

public class MainJava {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countElements(array);

        System.out.println(result);
    }

    public static Map<Integer, Integer> countElements(int[] incomingArray) {
        Map<Integer, Integer> elementsCountHashMap = new HashMap<>();

        for (int element : incomingArray) {
            if (elementsCountHashMap.containsKey(element)) {
                elementsCountHashMap.put(element, elementsCountHashMap.get(element) + 1);
            } else {
                elementsCountHashMap.put(element, 1);
            }
        }
        return elementsCountHashMap;
    }
}