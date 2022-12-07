package tk.amrom.test01;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        //给手机赋值
        p.brand = "小米";
        p.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法即可
        p.call();
        p.playGames();
    }
}
