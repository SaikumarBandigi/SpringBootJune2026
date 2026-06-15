package com.sb.SpringBootJune2026.interview.hashmapTut;

public class Main {

    public static void main(String[] args) {

        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());

    }

}

/*

h = 0

h = 31 * 0 + 65
  = 65

h = 31 * 65 + 97
  = 2015 + 97
  = 2112
 */
