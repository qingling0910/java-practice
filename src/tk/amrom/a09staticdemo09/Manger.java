package tk.amrom.a09staticdemo09;

public class Manger extends Employee{
    private double bonus;

    //空参
    public Manger(){

    }

    //全参
    //父类 + 子类
    public Manger(String id, String name, double salary,double bonus){
        super(id, name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }
    @Override
    public void work(){
        System.out.println("管理其他人");
    }

}
