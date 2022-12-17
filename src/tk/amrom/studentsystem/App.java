package tk.amrom.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
       while (true){
           System.out.println("欢迎来到学生管理系统");
           System.out.println("请选择操作1登录 2注册 3忘记密码");

           Scanner sc = new Scanner(System.in);
           System.out.println("请输入你的选择");
           String choose = sc.next();

           switch (choose){
               case "1" :
                   login();
                   break;

               case "2" :
                   register();
                   break;

               case "3":
                   forgetPassword();
                   break;

               case "4" :
                   System.out.println("谢谢使用，再见！");
                    System.exit(0);
               default:
                   System.out.println("没有这个选项");
           }
       }
    }
    //忘记密码
    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }
    //注册
    private static boolean register(ArrayList<User> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        //先验证格式是否正确，再验证是否唯一

        boolean flag = checkUsername(username);
    }

    private static boolean checkUsername(String username) {
        //用户名长度必须在3~15位之间
        int len = username.length();
        if(len < 3 || len > 15){
            return false;
        }
        //代码执行到这里，说明用户名长度在3～15之间
        //只能是字母加数字的组合
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c > 'a' && c < 'z') || (c > 'A' && c < 'Z') || (c > '0' && c < '9'))){
                return false;
            }
        }
        //当代码执行到这里，说明用户名满足两个条件：1、长度满足；2、内容满足
        int count = 0
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                count++;
                break;
            }
        }
                return count > 0;
//        用户名唯一
//        用户名长度必须在3~15位之间
//        ，但是不能是纯数字
    }

    //登录
    private static void login(ArrayList<User> list) {
        System.out.println("登录");
    }
}
