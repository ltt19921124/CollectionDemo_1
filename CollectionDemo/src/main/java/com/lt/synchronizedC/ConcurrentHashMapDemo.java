package com.lt.synchronizedC;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> chs = new ConcurrentHashMap<>();
//        Hashtable chs = new Hashtable();
//        HashMap chs = new HashMap();
        ExecutorService es = Executors.newFixedThreadPool(10);


        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long start = System.currentTimeMillis();
                    for (int j=0;j < 100000;j++) {
                        chs.put("tset"+j,j);
                    }
                    long end = System.currentTimeMillis();
                    System.out.println(end-start);
                }
            }).start();
        }

        /**
         *  new Thread(new Runnable() {
         *                 @Override
         *                 public void run() {
         *                     long start = System.currentTimeMillis();
         *                     for (int j=0;j < 100000;j++) {
         *                         chs.put("tset"+j,j);
         *                     }
         *                     long end = System.currentTimeMillis();
         *                     System.out.println(end-start);
         *                 }
         *             }).start();
         */

    }
}
