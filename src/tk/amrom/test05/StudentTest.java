package tk.amrom.test05;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用的空参构造
//        Student s = new Student();
        Student ss = new Student("张三",18);
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
    }
}
