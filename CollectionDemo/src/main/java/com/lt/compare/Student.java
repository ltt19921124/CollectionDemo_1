package com.lt.compare;

import java.util.Comparator;

public class Student{
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

}
//外部比较器使用较多，扩展性好

//外部比较器
class Bijiao01 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //比较年龄

        return o1.getAge() - o2.getAge() ;

    }
}

//外部比较器
class Bijiao02 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //比较年龄

        return o1.getName().compareTo(o2.getName()) ;

    }
}

class Bijiao03 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //年龄相同的情况比较身高

//        return o1.getName().compareTo(o2.getName()) ;
        if ((o1.getAge() - o2.getAge() == 0)){
            return ((Double)o1.getHeight()).compareTo((Double) o2.getHeight());
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}





