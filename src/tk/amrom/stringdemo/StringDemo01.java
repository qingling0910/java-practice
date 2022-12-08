package tk.amrom.stringdemo;

import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {
        /*
        用户登录
        需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
        总共给3次机会，登录之后，给出相应的提示
         */
        //1、定义正确的用户名、密码
        String rightUserName = "zhangsan";
        String rightPassword = "123456";

        //2、键盘录入用户名、密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();

            System.out.println("请输入密码：");
            String password = sc.next();

            //3、比较
            if((username == rightPassword) && (password == rightPassword)){
                System.out.println("登陆成功");
                break;
            }else{
                if(i == 2){
                    System.out.println("账号" + "zhangsan" + "被锁定，请联系客服");

                }else
                System.out.println("登陆失败,您还剩" + (2 - i) + "次机会" );
            }

        }



    }
}
