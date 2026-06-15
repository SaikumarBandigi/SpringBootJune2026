package com.sb.SpringBootJune2026.afterspring;


public class Example {

    public static void main(String[] args) {

        String s1 = "AaA";
        String s2 = "BBA";

        System.out.println("s1 hashCode = " + s1.hashCode());
        System.out.println("s2 hashCode = " + s2.hashCode());

        System.out.println("Same hash? " + (s1.hashCode() == s2.hashCode()));
        System.out.println("Equal objects? " + s1.equals(s2));

    }

}