package tk.amrom.interfacetest;

public class Dog extends Animal implements Swim{
    public Dog(){

    }

    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("狗在啃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗会狗刨");
    }
}
