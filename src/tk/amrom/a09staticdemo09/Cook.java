package tk.amrom.a09staticdemo09;

public class Cook extends Employee{
    public Cook(){

    }

    public Cook(String id, String name, Double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("厨师正在炒菜");
    }

}
