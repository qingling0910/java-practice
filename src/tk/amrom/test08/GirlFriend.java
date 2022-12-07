package tk.amrom.test08;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;
    private String hobby;

    //空参构造
    public GirlFriend(){

    }

    //全参构造
    public GirlFriend(String name, int age, String gender, String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    //setXxx()
    public void setName(String name){
        this.name = name;

    }

    //getXxx()
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

    public void setHobby(String hobby){
        this.hobby = hobby;

    }

    public String getHobby(){
        return hobby;
    }
}
