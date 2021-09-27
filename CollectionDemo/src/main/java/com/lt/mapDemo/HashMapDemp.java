package com.lt.mapDemo;

import java.util.HashMap;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HashMapDemp {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap();

        System.out.println(hm.put(12, "丽丽"));
        hm.put(12,"丽");
        hm.put(7,"kk");
        hm.put(2,"lmk");
        hm.put(9,"hujnm");

        System.out.println(hm.size());
        System.out.println(hm);




    }
}
