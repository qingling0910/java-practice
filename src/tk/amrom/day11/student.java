package tk.amrom.day11;

public class Student {
    //1、创建私有化成员变量
    private String name;
    private int age;

    //2、空参构造方法
    public Student(){

    }

    //3、全参构造
    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }

    //4、get/set方法
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
