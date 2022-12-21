package tk.amrom.ooptest01;

public class AdminStaff extends Employee{
    public AdminStaff(){

    }

    public AdminStaff(String id, String name){
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("行政部员工在工作");
    }
}
