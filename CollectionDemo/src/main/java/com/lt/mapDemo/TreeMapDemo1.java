package com.lt.mapDemo;


import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {

        TreeMap<Student,Integer> treeMap = new TreeMap<>();
        treeMap.put(new Student(19,"alili",175.6),12);
        treeMap.put(new Student(20,"blili",175.6),12);
        treeMap.put(new Student(21,"clili",175.6),12);
        treeMap.put(new Student(22,"dlili",175.6),12);
        treeMap.put(new Student(23,"dlili",175.6),12);
        //
        System.out.println(treeMap.size());
        System.out.println(treeMap);


    }
}
