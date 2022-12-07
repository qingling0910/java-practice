package tk.amrom.test04;

public class GirlFriend {
    //属性
    private int age;

    public void method(){
        int age = 10;
        System.out.println(age);//就近原则
        System.out.println(this.age);
    }
}
