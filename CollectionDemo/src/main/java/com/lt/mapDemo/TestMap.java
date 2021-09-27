package com.lt.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        System.out.println(map.put("pp", 109));
        System.out.println(map.put("pp", 189));
        map.put("opp",690);
        map.put("plp",19);
        map.put("pp",89);

        Map<String,Integer> map2 = new HashMap();
        System.out.println(map2.put("pp", 109));
        System.out.println(map2.put("pp", 189));
        map2.put("opp",690);
        map2.put("plp",19);
        map2.put("pp",89);
//        map.clear();
        System.out.println(map.size());
        System.out.println(map);
        System.out.println("===");
//        map.remove("opp");

        System.out.println(map.containsKey("opp"));
        System.out.println(map.size());
        System.out.println(map);


        System.out.println(map == map2);
        System.out.println(map.equals(map2));



    }


}



