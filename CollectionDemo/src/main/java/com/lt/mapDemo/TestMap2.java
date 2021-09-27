package com.lt.mapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap2 {
    /**
     * map特点：
     * 无序，唯一，键值对，键不可以重复，值可以重复
     *
     * @param args
     */

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("lili", 12);
        map.put("loili", 12);
        map.put("qlili", 12);
        map.put("flili", 12);
        map.put("ylili", 12);

        Set<String> set = map.keySet();

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("=============");

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        System.out.println("=============");

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(map.get(string));
        }
        System.out.println("===========");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("key:" + entry.getKey() + ":" + "value:" + entry.getValue());
        }

    }


}
