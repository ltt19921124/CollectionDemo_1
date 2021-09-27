package com.lt.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Test03 {
    public static void main(String[] args) {
//        Comparator<Student> com = new Bijiao();
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        //指定外部比较器
        TreeSet<Student> ts = new TreeSet<>(com);
        ts.add(new Student(10,"zlili"));
        ts.add(new Student(20,"blili"));
        ts.add(new Student(14,"clili"));
        ts.add(new Student(35,"dlili"));
        ts.add(new Student(35,"klili"));
        //4
        System.out.println(ts.size());
        System.out.println(ts);

    }
}
