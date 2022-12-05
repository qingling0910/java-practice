package tk.amrom.day01;

import java.util.Scanner;

public class SwtichTest02 {
    public static void main(String[] args) {
        /*
        练习：用户选择
        需求：在实际开发中，如果我们需要在多种情况下选择其中一个，就可以使用switch语句；
        当我们拨打了某些服务时，一般都会有按键选择；
        假设我们现在拨打了一个机票预订电话
        电话语音中提示：
        1、机票查询
        2、机票预定
        3、机票改签
        4、退出服务
        其他按键也是退出服务。请使用switch模拟该业务
         */
        //1、键盘录入一个整数，表示我们的选择
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;

        }
    }
}
