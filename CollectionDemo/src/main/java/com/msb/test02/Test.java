package com.msb.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        //接口 -- 实现类
        Collection col = new ArrayList();

        List list = new ArrayList();

        //直接创建实现类对象
        ArrayList al = new ArrayList();

        al.add("abc");
        System.out.println(al.add("def"));


    }

}
