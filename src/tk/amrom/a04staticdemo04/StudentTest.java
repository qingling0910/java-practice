package tk.amrom.a04staticdemo04;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿玮老师";

        Student s1 = new Student();
        System.out.println("s1");
        s1.name = "zhangsan";
        s1.age = 23;
        s1.show1();

        System.out.println("===========");

        Student s2 = new Student();
        s2.name = "lisi";
        s2.age = 24;
        s2.show2();
    }
}
