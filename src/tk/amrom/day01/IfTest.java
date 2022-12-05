package tk.amrom.day01;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        /*
        练习：商品付款
        在实际开发中，如果要根据两种不同的情况来执行不同的代码，就需要用到if的第二种格式；
        需求：
        1、假设，用户在超市实际购买，商品总价为：600元
        2、键盘录入一个整数表示用户实际支付的钱；
        3、如果付款大于等于600，表示付款成功。否则付款就失败。
         */
        //1、键盘录入
        //2、定义变量，接收付款

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入付款数");

        int pay = sc.nextInt();
        //3、判断
        if(pay >= 600){
            System.out.println("付款成功");
        }else {
            System.out.println("付款失败");
        }
    }
}
