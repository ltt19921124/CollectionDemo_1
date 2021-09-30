package com.lt.synchronizedC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {

        List<Object> list = Collections.synchronizedList(new ArrayList<>());



    }
}
