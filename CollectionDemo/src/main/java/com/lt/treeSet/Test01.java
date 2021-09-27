package com.lt.treeSet;

import com.lt.setDemo.TreeSet_Compare;
import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Test01 {

    public static void main(String[] args) {
        //创建TreeSet
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(3);
        ts.add(7);
        ts.add(3);
        ts.add(9);
        ts.add(16);
        //5
        System.out.println(ts.size());
        //[3, 7, 9, 12, 16] 有序且是升序，
        System.out.println(ts);


    }
}
