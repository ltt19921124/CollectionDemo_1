package com.lt.mapDemo;

import java.util.LinkedHashMap;

public class TestMap3 {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lk = new LinkedHashMap();
        lk.put("ii",12);
        lk.put("bii",12);
        lk.put("cii",12);
        lk.put("dii",12);

        System.out.println(lk.size());
        System.out.println(lk);


    }



}
