package tk.amrom.a09staticdemo09;

public class Test {
    public static void main(String[] args) {
        Manger m = new Manger("heima001", "张三", 15000.00, 8000.00 );
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();

        System.out.println("==============");

        Cook c = new Cook();
        c.setId("heima002");
        c.setName("李四");
        c.setSalary(8000.00);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());

        c.eat();
        c.work();

    }
}
