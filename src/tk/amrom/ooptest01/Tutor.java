package tk.amrom.ooptest01;

public class Tutor extends Teacher{
    public Tutor(){

    }

    public Tutor(String id, String name){
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("助教在协助教学");
    }
}
