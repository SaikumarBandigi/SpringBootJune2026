package com.sb.SpringBootJune2026.interview.hashmapTut;

import java.util.*;
import java.util.function.Function;

public class Example1 {

    public static void main(String[] args) {

//        Map<String, List<Integer>> map = new HashMap<>();
//
//
//        Function<String, List<Integer>> stringListFunction = new Function<>() {
//            @Override
//            public List<Integer> apply(String s) {
//                return new ArrayList<>();
//            }
//        };
//
//        map.computeIfAbsent("A", stringListFunction).add(10);
//        map.computeIfAbsent("A", stringListFunction).add(20);
//
//        System.out.println(map);

        //////////////////////////

        Map<String, String> map = new HashMap<>();

        map.put("A", "Old");

        map.putIfAbsent("A", getData());

        System.out.println(map);

        System.out.println("----------");


        map.put("B", "New");
        map.computeIfAbsent("B", s -> getData());

        System.out.println(map);

    }

    public static String getData() {
        System.out.println("Creating Value...");
        return "Apple";
    }

}
