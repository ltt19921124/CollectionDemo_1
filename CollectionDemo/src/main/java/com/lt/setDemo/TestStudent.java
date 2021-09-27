package com.lt.setDemo;

import java.util.HashSet;

public class TestStudent {
    public static void main(String[] args) {
        /**
         * HashSet特点、原理：
         * 1,集合中存入数据(以Integer为例)：底层是数组，底层调用了hashcode方法
         *
         * 2,
         *
         *
         */
        HashSet<Student> hs =new HashSet<>();
        hs.add(new Student(19,"lili"));
        hs.add(new Student(20,"nana"));
        hs.add(new Student(21,"lili"));
        hs.add(new Student(19,"lili"));
        hs.add(new Student(22,"feifei"));
        //5
        System.out.println(hs.size());
        System.out.println(hs);


    }

}
