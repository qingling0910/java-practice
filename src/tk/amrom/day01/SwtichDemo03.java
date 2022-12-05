package tk.amrom.day01;

import java.util.Scanner;

public class SwtichDemo03 {
    public static void main(String[]args){
        /*
        需求：键盘录入星期数，输出工作日、休息日
        （1～5）工作日，（6～7）休息日
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入星期数：");

        int week = sc.nextInt();
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期数");

        }
    }
}
