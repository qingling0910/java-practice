package tk.amrom.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;
/*
### 需求：

​	采取控制台的方式去书写学生管理系统。

### 分析：

#### 初始菜单：

```java
"-------------欢迎来到黑马学生管理系统----------------"
"1：添加学生"
"2：删除学生"
"3：修改学生"
"4：查询学生"
"5：退出"
"请输入您的选择:"
```

#### 学生类：

	属性：id、姓名、年龄、家庭住址

#### 添加功能：

	键盘录入每一个学生信息并添加，需要满足以下要求：

* id唯一

#### 删除功能：
	键盘录入要删除的学生id，需要满足以下要求：

* id存在删除
* id不存在，需要提示不存在，并回到初始菜单

#### 修改功能：

	键盘录入要修改的学生id，需要满足以下要求

* id存在，继续录入其他信息
* id不存在，需要提示不存在，并回到初始菜单

#### 查询功能：

	打印所有的学生信息，需要满足以下要求

* 如果没有学生信息，提示：当前无学生信息，请添加后再查询
* 如果有学生信息，需要按照以下格式输出。（不用过于纠结对齐的问题）

```java
id			姓名		年龄		家庭住址
heima001	张三		23		 南京
heima002	李四		24		 北京
heima003	王五		25		 广州
heima004	赵六	 	26		 深圳
```
 */
public class StudentSystem {
    public static void startStudentSystem() {
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

        String id = null;
        while (true){
            System.out.println("请输入学生id");
            id = sc.next();
            boolean flag = contains(list, id);
            if(flag){
                System.out.println("当前id已存在，请重新录入");
            }
            else{
                s.setId(id);
                break;
            }
        }

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

    //删除学生
    public static void deleteStudent(ArrayList<StudentNew> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        int index =  getIndex(list,id);

        if(index >= 0){
            list.remove(index);
            System.out.println("id为" + id + "删除成功");
        }else{
            System.out.println("id不存在，删除失败");
        }
    }

    //修改学生
    public static void alterStudent(ArrayList<StudentNew> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index == -1){
            System.out.println("要修改的id" + id  + "不存在，请重新输入");
            return;
        }

        StudentNew stu = list.get(index);

        System.out.println("请输入要修改的学生姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生地址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");

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

    //判断id是否存在
    public static boolean contains(ArrayList<StudentNew> list, String id){
//        for (int i = 0; i < list.size(); i++) {
//            StudentNew stu = list.get(i);
//            String  sid = stu.getId();
//            if(sid.equals(id)){
//                return true;
//            }
//        }
//        return false;
        return getIndex(list,id) >= 0;

    }

    public static int getIndex(ArrayList<StudentNew> list, String id){
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每个学生对象
           StudentNew stu =  list.get(i);
           String sid = stu.getId();
           if(sid.equals(id)){
               return i;
           }

        }
        return -1;
    }
}
