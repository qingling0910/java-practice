package tk.amrom.ooptest01;

public class Maintainer extends AdminStaff{
    public Maintainer(){

    }

    public Maintainer(String id, String name){
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("维护专员在维护设备");
    }
}
