package com.lt.setDemo;

import java.util.Objects;

public class Student implements Comparable<Student>{
    int age;
    double height;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", anme='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String anme) {
        this.name = anme;
    }

    public Student() {
    }

    public Student(int age, String anme) {
        this.age = age;
        this.name = anme;
    }

    public Student(int age, double height, String anme) {
        this.age = age;
        this.height = height;
        this.name = anme;
    }

    @Override
    public int compareTo(Student o) {

        //按照年龄比较
//        return this.getAge() - o.getAge();

//        return ((Double)(this.getHeight())).compareTo((Double) (o.getHeight()));

        //按照名字进行比较
        return this.getName().compareTo(o.getName());
    }
}
