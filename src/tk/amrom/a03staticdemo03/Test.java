package tk.amrom.a03staticdemo03;

import java.util.ArrayList;
/*
练习：定义学生类
需求：定义一个集合，用于存储3个学生对象
学生类的属性为：name、age、gender
定义一个工具类，用于获取集合中最大的学生的年龄
 */

public class Test {
    public static void main(String[] args) {
        //1、创建集合用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //2、创建学生对象
        Student stu1 = new Student("zhangsan", 23, "男");
        Student stu2 = new Student("lisi", 24, "女");
        Student stu3 = new Student("wangwu", 25, "男");

        //3、将学生对象添加至集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //4、调用工具类中的方法
        int maxAgeStudent =  StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);

    }
}
