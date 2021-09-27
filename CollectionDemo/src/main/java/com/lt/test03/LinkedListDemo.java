package com.lt.test03;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        //
        LinkedList<String> list = new LinkedList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");
        System.out.println(list);//LinkedList可以添加重复元素
        list.addFirst("k");
        list.addLast("j");
        System.out.println(list);

        list.offer("m");
        list.offerFirst("ff");
        list.offerLast("ll");
        System.out.println(list);

        System.out.println("=======");
        System.out.println(list.poll());//
        System.out.println(list);

        System.out.println(list.pollFirst());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list);

//        list.clear();
        //jdk 1.6以后新出的方法，提升了健壮性
//        System.out.println(list.pollFirst());//

        //不友好
//        System.out.println(list.remove());//会抛异常

        System.out.println("========");

        for (int i = 0;i < list.size();i++) {
              System.out.println(list.get(i));
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====");
        for (Iterator<String> it = list.iterator();it.hasNext();) {
            System.out.println(it.next());
        }


    }

}
