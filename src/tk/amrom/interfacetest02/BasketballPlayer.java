package tk.amrom.interfacetest02;

public class BasketballPlayer extends Player{
    public BasketballPlayer(){

    }

    public BasketballPlayer(String name, int age){
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }
}
