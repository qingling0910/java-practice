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
                   System.out.println("注册");
                   break;

               case "3":
                   System.out.println("忘记密码");
                   break;

               default:
                   System.out.println("没有这个选项");
           }
       }
    }

    private static void login() {
    }
}
