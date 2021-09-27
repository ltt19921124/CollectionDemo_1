package com.lt.treeSet;

import java.util.TreeSet;

public class Test02 {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("alili");
        ts.add("blili");
        ts.add("clili");
        ts.add("dlili");
        ts.add("dlili");
        ts.add("elili");

        System.out.println(ts.size());
        System.out.println(ts);


    }


}

