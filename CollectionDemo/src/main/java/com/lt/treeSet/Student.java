package com.lt.treeSet;

import java.util.Comparator;

public class Student {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Bijiao implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return o1.getName().compareTo(o2.getName());

    }
}
