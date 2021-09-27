package com.lt.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add("ert");
        System.out.println(list);
        list.add(3,66);
        System.out.println(list);

        list.set(3,77);
        System.out.println(list);
        list.remove(2);//在集合中存入的是Integer类型的时候，remove方法调用的是remove(index)
        System.out.println(list);

        list.remove("abc");
        System.out.println(list);

        Object o = list.get(0);
        System.out.println(o);
        //遍历
        System.out.println("--------");
        for (int i=0;i < list.size();i++) {
            System.out.println(list.get(i));
        }
        //增强for循环
        for (Object ob : list) {
            System.out.println(ob);
        }
        //方式三
        System.out.println("-------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
