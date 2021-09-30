package com.lt.synchronizedC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayListDemo2 {
    public static void main(String[] args) {

//        List<Object> list = Collections.synchronizedList(new ArrayList<>());
        //ArrayList集合
        ArrayList arrayList = new ArrayList();
        List list = Collections.synchronizedList(arrayList);

        ExecutorService es = Executors.newFixedThreadPool(100);

        //并发添加10000个数据
        for (int i = 0; i < 10000; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    list.add("aaa");
                }
            });
        }
        //关闭线程资源
        es.shutdown();

        //监控线程是否执行完毕
        while (true) {
            if (es.isTerminated()) {
                System.out.println("子线程执行完毕");
                //
                System.out.println(list.size());
                if (list.size() == 10000) {
                    System.out.println("安全");
                } else {
                    System.out.println("线程不安全");
                }

                break;
            }
        }

    }
}
