package tk.amrom;

import java.util.Scanner;

public class IfTest03 {
    public static void main(String[]agrs){
        /*
        需求：
        1、键盘录入一个整数，表示身上的钱；
        2、如果大于等于100块，就去网红餐厅
        3、否则，就吃经济实惠的沙县小吃
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你身上的钱");
        int money = sc.nextInt();

        if(money >= 100){
            System.out.println("去吃网红餐厅");
            }
        else{
            System.out.println("吃沙县小吃");
        }

    }
}
