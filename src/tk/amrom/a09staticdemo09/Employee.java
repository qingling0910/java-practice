package tk.amrom.a09staticdemo09;

public class Employee {
    private String id;
    private String name;
    private Double salary;

    public Employee(){

    }

    public Employee(String id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Double getSalary(){
        return salary;
    }

    //工作
    public void work(){
        System.out.println("员工在工作");
    }

    //吃饭
    public void eat(){
        System.out.println("吃米饭");
    }
}

