package tk.amrom.stringdemo;

public class StringDemo06 {
    public static void main(String[] args) {
        /*
        截取手机号
         */
        //1、获取一个手机号
        String phoneNumber = "13112345678";

        //2、截取前三位
        String start = phoneNumber.substring(0, 3);

        //3、截取后四位
        String end = phoneNumber.substring(7);

        //4、拼接
         String result = start + "****" + end;

        //5、打印
        System.out.println(result);
    }
}
