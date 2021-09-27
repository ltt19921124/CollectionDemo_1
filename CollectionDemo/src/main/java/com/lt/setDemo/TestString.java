package com.lt.setDemo;

import java.util.HashSet;

public class TestString {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("apple");
        hs.add("banana");
        hs.add("banana");
        hs.add("html");
        hs.add("css");
        //5
        System.out.println(hs.size());
        //[banana, apple, css, html, hello]
        System.out.println(hs);

    }
}
