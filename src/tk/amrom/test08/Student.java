package tk.amrom.test08;

public class Student {
    //属性
    private int id;
    private String name;
    private int age;

    //空参构造
    public Student(){

    }

    //全参构造
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //set、get
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
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
}
