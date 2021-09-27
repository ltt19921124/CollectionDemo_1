package com.lt.mapDemo;


import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("alili",12);
        treeMap.put("blili",12);
        treeMap.put("blili",12);
        treeMap.put("clili",12);
        treeMap.put("dlili",12);
        treeMap.put("elili",12);
        //
        System.out.println(treeMap.size());
        System.out.println(treeMap);


    }
}
