package com.lt.synchronizedC;

import org.junit.jupiter.api.parallel.Execution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        List list = Collections.synchronizedList(al);
        ExecutorService es = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 10000; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    list.add("aaa");
                }
            });
        }
        es.shutdown();

        while (true){
            if (es.isTerminated()) {
                System.out.println("所有线程执行结束了");
                if (list.size() == 10000) {
                    System.out.println("安全");
                } else {
                    System.out.println("不安全");
                }
                break;
            }
        }

    }
}
