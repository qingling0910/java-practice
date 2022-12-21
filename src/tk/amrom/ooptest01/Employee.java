package tk.amrom.ooptest01;

public class Employee {
    /*需求：
            在黑马程序员中有很多员工(Employee)。
            按照工作内容不同分教研部员工(Teacher)和行政部员工(AdminStaff)

            1. 教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor)
            2. 行政部根据负责事项不同,又分为维护专员(Maintainer),采购专员(Buyer)
            3. 公司的每一个员工都编号,姓名和其负责的工作
            4. 每个员工都有工作的功能，但是具体的工作内容又不一样。

     */
    private String id;
    private String name;

    public Employee(){

    }

    public Employee(String id, String name){
        this.id = id;
        this.name = name;
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
        return this.name;
    }

    //工作
    public void work(){
        System.out.println("员工在工作");
    }


}
