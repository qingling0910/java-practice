package tk.amrom;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[]args){
        //键盘录入女婿的酒量，如果大于2，输出"小伙子，不错哟！"
        //否则，无反应
        //分析步骤：1、键盘录入酒量
        //2、if判断
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();

        if (wine > 2){
            System.out.println("小伙子，不错哟！");
        }
    }


}
