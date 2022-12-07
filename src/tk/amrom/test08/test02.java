package tk.amrom.test08;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        //键盘录入的两套体系不能混用的
        //弊端：先用nextINt()，再用nextLine()会导致下面的nextLine()接收不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        System.out.println(s);
    }
}
