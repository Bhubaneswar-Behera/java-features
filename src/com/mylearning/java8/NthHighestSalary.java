package com.mylearning.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);//output
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);

        //Using stream
        Map.Entry<String, Integer> results = getNthHighestSalary(4, map1);
        System.out.println(results);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1300);
        map2.put("daniel", 1300);
        System.out.println(getDynamicNthHighestSalary(3, map1));

    }

    /**
     * This method will only give oen value but it wont result if the entries are duplicate.
     *
     * @param num
     * @param map
     * @return
     */
    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {
        Map.Entry<String, Integer> stringIntegerEntry = map
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num-1);

        return stringIntegerEntry;
    }

    public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int num, Map<String, Integer> map) {
        Map.Entry<Integer, List<String>> integerListEntry = map
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(num - 1);

        return integerListEntry;

    }
}
