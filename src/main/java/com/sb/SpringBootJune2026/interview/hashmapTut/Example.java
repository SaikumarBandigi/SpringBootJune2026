package com.sb.SpringBootJune2026.interview.hashmapTut;

import java.util.*;

public class Example {
    public static void main(String[] args) {

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
        map.put(10, "India");
        map.put(5, "Australia");
        map.put(20, "New Zealand");
    }
}


/*

Step 1: hashCode Calculation
For a String, Java computes the hash code like this:

hashcode =(hashcode*31)+character

String x = "Aa";
String y="BB;

h = 0
h = 31 * h + 'A'   // 65
h = 31 * h + 'B'   // 2081
h = 31 * h + 'C'   // 64578

"ABC".hashCode() = 64578

___________________________________________
Step 2: Bucket Index Calculation
After getting the hash code, HashMap converts it to a bucket index.

Conceptually:

index = hashCode % bucketSize

Example:

hashCode = 64578
bucketSize = 16

index = 64578 % 16
      = 2

So the entry goes into bucket 2.

_______________________________________________________________

Capacity  = 16
LoadFactor = 0.75
Threshold = 16 × 0.75 = 12


| Current Capacity | Threshold | New Capacity |
| ---------------- | --------- | ------------ |
| 16               | 12        | 32           |
| 32               | 24        | 64           |
| 64               | 48        | 128          |
| 128              | 96        | 256          |


Capacity tells "how many buckets exist"; Threshold tells "when to resize".

Index (Bucket Number)

0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15

Total buckets = 16

____________________________

Important Clarification

Capacity ≠ Number of Entries

A HashMap with capacity 16 can store more than 16 entries because multiple entries can be stored in the same bucket due to collisions.

Example:

Bucket 0 -> (A,100) -> (B,200)
Bucket 1 -> (C,300)
Bucket 2 -> (D,400) -> (E,500) -> (F,600)
...

Even though there are only 16 buckets, you might have 20, 50, or 100 entries.


Important

1)What Happens During Resize?
New bucket array is created.
Old Capacity = 16
New Capacity = 32

2)New threshold is calculated.
32 × 0.75 = 24

3)All existing entries are rehashed and redistributed into the new 32 buckets.
Old Buckets : 0 to 15
New Buckets : 0 to 31

Some entries stay in the same bucket, some move to new buckets.

 */