package tk.amrom.ooptest01;

public class Teacher extends Employee {

    public Teacher() {
    }

    public Teacher(String id, String name){
        super(id, name);

    }
    @Override
    public void work(){
        System.out.println("教研部的员工正在工作");
    }
}
