package com.msb.test03;

public class MyLinkedList {

    Node first;

    Node last;

    int count = 0;

    public MyLinkedList() {

    }

    //
    public void add(Object o) {
        if (first == null) {
            Node n = new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            first = n;
            last = n;
        } else {
            Node n = new Node();
            n.setPre(last);
            n.setObj(o);
            n.setNext(null);

            last.setNext(n);
            last = n;
        }
        count++;
    }


    public static void main(String[] args) {

        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");
        System.out.println(ml.getSize());


    }

    public int getSize() {
        return count;
    }

}
