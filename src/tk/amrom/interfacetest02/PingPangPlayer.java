package tk.amrom.interfacetest02;

public class PingPangPlayer extends Player implements English{

    public PingPangPlayer(){

    }

    public PingPangPlayer(String name, int age){
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");

    }
}
