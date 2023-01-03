package tk.amrom.a04polymorphismdemo04;

public class Dog extends Animal {
    /*
    看家lookHome方法(无参数)
     */
    public Dog(){

    }

    public Dog(int age, String color){
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "在吃");
    }
    public void lookHome(){
        System.out.println("狗在看家");

    }
}
