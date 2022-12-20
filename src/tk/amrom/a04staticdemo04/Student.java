package tk.amrom.a04staticdemo04;

import tk.amrom.a03staticdemo03.StudentUtil;

public class Student {
    String name;
    int age;
    static String teacherName;

    public void show1(Student this){
        System.out.println(this.name + ", " + this.age + ", " + teacherName);
    }

    public void show2(){
        System.out.println("show2");
    }

    public static void method(){
        System.out.println("静态方法");
    }
 }
