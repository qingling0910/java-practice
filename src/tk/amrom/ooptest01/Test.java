package tk.amrom.ooptest01;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer();
        l.setId("heima001");
        l.setName("张三");
        l.work();

        System.out.println(l.getId() + ", " + l.getName());

    }
}
