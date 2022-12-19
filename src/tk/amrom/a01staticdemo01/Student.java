package tk.amrom.a01staticdemo01;

public class Student {
    //属性：姓名、年龄、性别
    String name;
    int age;
    String gender;
    public static String teacherName;

    public Student(){

    }

    public Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    //行为
    public void study(){
        System.out.println(name + "正在学习");
    }

    public void show(){
        System.out.println(name + ", " + age + ", " + gender + ", " + teacherName);
    }
}
