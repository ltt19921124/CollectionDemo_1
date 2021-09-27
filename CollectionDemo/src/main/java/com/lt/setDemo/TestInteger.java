package com.lt.setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestInteger {

    public static void main(String[] args) {
        //LinkedHashSet：唯一的，有序的。按照输入顺序进行输出

        HashSet<Integer> hs = new HashSet<>();
        System.out.println(hs.add(19));//true
        hs.add(5);
        hs.add(9);
        hs.add(20);
        hs.add(18);
        System.out.println(hs.add(19));//false,这个19没有放入到集合中
        //
        System.out.println(hs.size());//唯一且无序 5
        System.out.println(hs);// [18, 19, 20, 5, 9]


    }


}
