package tk.amrom.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<StudentNew> list = new ArrayList<>();
        loop:while (true){
            System.out.println("-----------欢迎来到黑马学生管理系统-----------------");
            System.out.println("1:添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择：");
            String choose = sc.next();
            switch (choose){
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    alterStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("退出");
                    break loop;
                default:
                    System.out.println("没有那个选项");
            }
    }

    }
    //添加学生
    public static void addStudent(ArrayList<StudentNew> list){
        //利用空参构造学生对象
        StudentNew s = new StudentNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        s.setId(id);

        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭住址");
        String address = sc.next();
        s.setAddress(address);

        //把学生对象添加到集合中
        list.add(s);

        //提示用户添加成功
        System.out.println("学生信息添加成功");
    }

    //修改学生
    public static void deleteStudent(ArrayList<StudentNew> list){
        System.out.println("删除学生");
    }

    //修改学生
    public static void alterStudent(ArrayList<StudentNew> list){
        System.out.println("修改学生");
    }

    //查询学生
    public static void queryStudent(ArrayList<StudentNew> list){
        System.out.println("查询学生");
        if(list.size() == 0){
            System.out.println("当前无学生信息，请添加后再查询");
            return;

        }
        //打印表头
        System.out.println("id\t \t姓名\t年龄\t家庭住址");
        //有学生信息
        for (int i = 0; i < list.size(); i++) {
            StudentNew stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress() );
        }
    }
}
