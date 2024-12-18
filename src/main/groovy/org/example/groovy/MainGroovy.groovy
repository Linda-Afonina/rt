package org.example.groovy

class MainGroovy {
    static void main(String[] args) {
        int[] array = [1, 3, 4, 5, 1, 5, 4]
        def result = countElements(array)

        println(result)
    }

    static Map<Integer, Integer> countElements(int[] incomingArray) {
        Map<Integer, Integer> elementsCountHashMap = new HashMap<>()

        incomingArray.each { element ->
            elementsCountHashMap.put(element, elementsCountHashMap.get(element, 0) + 1)
        }
        return elementsCountHashMap
    }
}