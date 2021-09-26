package com.msb.test01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {

    @Test
    public void test(){


    }



    public static void main(String[] args) {

        Collection collection = new ArrayList();

        collection.add(18);
        collection.add(19);
        collection.add(27);
        collection.add(34);

        List list = Arrays.asList(new Integer[]{11,15,6,8});
        collection.addAll(list);
        System.out.println(collection);

        //清空集合
        collection.clear();
        System.out.println(collection);
        System.out.println("集合中的元素数量为："+collection.size());
        System.out.println("集合是否为空:" + collection.isEmpty());

        Collection collection2 = new ArrayList();

        collection2.add(18);
        collection2.add(19);
        collection2.add(27);
        collection2.add(34);

        Collection collection3 = new ArrayList();

        collection3.add(18);
        collection3.add(19);
        collection3.add(27);
        collection3.add(34);

        System.out.println(collection2.equals(collection3));
        System.out.println(collection2==collection3);//false

        boolean contains = collection3.contains(17);
        System.out.println(contains);

        boolean contains1 = collection3.contains(117);
        System.out.println(contains1);

    }




}
