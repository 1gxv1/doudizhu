package com.demo;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static class TestStudent{
        public static void main(String[] args) {
            int j=1;
            int[] k=new int[1];
            k[0]=j;
            System.out.println(k[0]);
            Student[] students=new  Student[3];// 创建一个学生数组存储信息
            Student s1=new Student("S",1);//定义一个学生对象
            Student s2=new Student("D",12);//定义一个学生对象
            Student s3=new Student("C",13);//定义一个学生对象
            students[0]=s1;/*存入数组当中,将所定义的类的对象内容存入数组当中，存入的是地址的位置,数组指向类的对象*/
            students[1]=s2;
            students[2]=s3;
            System.out.println(students[0]);
            for (int i = 0; i <students.length ; i++) {
                Student s=students[i];
                System.out.println(s.getAge()+"___"+s.getName());
            }
        }
    }

}

