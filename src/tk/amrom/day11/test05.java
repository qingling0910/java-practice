package tk.amrom.day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个集合，添加一些学生对象，并进行遍历
        学生类的属性为：姓名、年龄
        要求：对象的数据来自键盘录入
         */
        //1、创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2、键盘录入学生对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            System.out.println("请输入学生的姓名：");
            String name =  sc.next();

            System.out.println("请输入学生的姓名：");
            int age = sc.nextInt();

            //把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            //把学生对象添加到集合中
            list.add(s);

        }
        //3、遍历
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
