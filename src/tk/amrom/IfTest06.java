package tk.amrom;

import java.util.Scanner;

public class IfTest06 {
    public static void main(String[] args) {
        /*
        练习：商品的价格
        问题描述：
        在实际开发中，多种情况判断时，会用到if的第三种格式
        需求：
        1、商场都有VIP的会员制，根据不同的会员有不同的折扣；
        2、假设，商品总价为1000；
        3、键盘录入会员级别，并计算出实际支付的钱；
        1）会员1级：打9折；
        2）会员2级：打8折；
        3）会员3级：打7折；
        4）非会员：不打折，要打也是打骨折
         */
        //1、先定义变量，记录商品总价
        int price = 1000;
        // 先键盘录入会员级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级：");
        int grade = sc.nextInt();

        if(grade == 1){
            System.out.println("实际支付价格为" + (price * 0.9));
        }else if(grade == 2){
            System.out.println("实际支付价格为" + (price * 0.8));
        }else if(grade == 3){
            System.out.println("实际支付价格为" + (price * 0.7));
        }else{
            System.out.println("实际支付价格为" + price );
        }

        }
    }
