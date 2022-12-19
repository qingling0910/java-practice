package tk.amrom.a03staticdemo03;

public class Student {
    private String name;
    private int age;
    private String gender;

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
        this.age =age;
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

}
