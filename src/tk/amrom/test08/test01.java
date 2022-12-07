package tk.amrom.test08;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        /*
        键盘录入：
        第一套体系：
        nextInt();    接收整数
        nextDouble(); 接收小数
        next();       接收字符串
        遇到空格、制表符、回车就停止接收。这些符号后面的数据就不会接收了

        第二套体系：
        nextLine();  接收字符串
         */
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个整数：");
//        int num1 = sc.nextInt();
//        System.out.println(num1);//123
//
//
//        System.out.println("请输入第二个整数：");
//        int num2 = sc.nextInt();
//        System.out.println(num2);//123
        System.out.println("请输入第一个字符串");
        String str1 = sc.next();
        System.out.println(str1);

        System.out.println("请输入第二个字符串");
        String str2 = sc.next();
        System.out.println(str2);


    }
}
