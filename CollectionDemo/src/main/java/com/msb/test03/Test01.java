package com.msb.test03;

import java.util.ArrayList;

public class Test01 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();
        al.add(98);
        al.add(18);
        al.add(39);
        al.add(60);
        al.add(83);
//        al.add("丽丽");

        //
        for (Object obj : al) {
            System.out.println(obj);
        }
        //加了泛型后，
        for (Integer i : al) {
            System.out.println(i);
        }



    }

}
