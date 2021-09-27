package com.lt.compare;

import java.util.Comparator;

public class TestCompare {

    public static void main(String[] args) {

        Student s1 = new Student(14,174.0,"丽丽");
        Student s2 = new Student(19,174.0,"n丽丽");

        /*Comparator bj01 = new Bijiao01();
        System.out.println(bj01.compare(s1, s2));*/

        /*Comparator bj02 = new Bijiao02();
        System.out.println(bj02.compare(s1, s2));*/

        Comparator bj03 = new Bijiao03();
        System.out.println(bj03.compare(s1, s2));



    }

}
