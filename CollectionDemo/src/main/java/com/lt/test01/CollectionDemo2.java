package com.lt.test01;

import java.util.*;

public class CollectionDemo2 {

    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(18);
        col.add(19);
        col.add(27);
        col.add(34);
        col.add("abc");
        col.add('v');

        //对集合进行遍历
        for (int i=0;i < col.size();i++) {

        }
        //方式二：增强for循环
        for(Object o : col) {
            System.out.println(o);
        }
        //方式三:迭代器
        /**
         * hasNext()判断有没有下一个元素
         *
         *
         */
        System.out.println("-------" + "方式三");
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
