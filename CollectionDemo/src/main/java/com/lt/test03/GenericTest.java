package com.lt.test03;

public class GenericTest<E> {
    int age;
    String name;
    E sex;

    public void a(E n){

    }
    public void b(E[] n){

    }

    public static void main(String[] args) {

        GenericTest g1 = new GenericTest();
        g1.a("abc");
        g1.a(17);
        g1.a(9.8);

        g1.b(new String[] {"a","b"});


        GenericTest<String> g2 = new GenericTest();
        g2.sex = "男";
        g2.a("abc");
        g2.b(new String[]{"a","k","j"});

        SubGene sgt = new SubGene();
        sgt.sex = 9;

        SubGene2<String> s = new SubGene2();



    }


}

class SubGene extends GenericTest<Integer> {

}

class SubGene2<E> extends GenericTest<E> {

}


