package com.sb.SpringBootJune2026.interview.hashmapTut;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

    public static void main(String[] args) {

//        String key1 = "Aa";
//        String key2 = "BB";
//
//        System.out.println("Aa hashCode: " + key1.hashCode());
//        System.out.println("BB hashCode: " + key2.hashCode());
//
//        HashMap<String, Integer> phoneMap = new HashMap<>();
//
//        phoneMap.put(key1, 987654321);
//        phoneMap.put(key2, 912345678);
//
//        System.out.println("\nStored values:");
//        System.out.println("Aa -> " + phoneMap.get("Aa"));
//        System.out.println("BB -> " + phoneMap.get("BB"));


        // One common dataset (ONLY 3 PUTS)
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        // Insert only once per map setup block (same data)
        insertData(hashMap);
        insertData(linkedHashMap);
        insertData(treeMap);

        System.out.println("HashMap Output:");
        System.out.println(hashMap);

        System.out.println("\nLinkedHashMap Output:");
        System.out.println(linkedHashMap);

        System.out.println("\nTreeMap Output:");
        System.out.println(treeMap);

    }
    static void insertData(Map<Integer, String> map) {
        map.put(10, "CSK");
        map.put(5, "MI");
        map.put(20, "RCB");
    }

}
