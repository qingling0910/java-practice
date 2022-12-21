package tk.amrom.ooptest01;

public class Buyer extends AdminStaff{
    public Buyer(){

    }

    public Buyer(String id, String name){
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("采购员在采购");
    }
}
