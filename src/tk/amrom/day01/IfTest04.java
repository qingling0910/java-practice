package tk.amrom.day01;

import java.util.Scanner;

public class IfTest04 {
    public static void main(String[] args) {
        /*
        练习：电影院选座
        需求：
        1、在实际开发中，电影院选座也会使用到if判断
        2、假设某影院销售了100张票，票的序号为1～100；
        3、其中奇数票号坐左侧，偶数票号坐右侧；
        4、键盘录入一个整数表示电影院到票号；
        5、根据不同情况，给出不同到提示：
        1）如果票号为奇数，那么打印坐左边；
        2）如果票号为偶数，那么打印坐右边
         */
        //1、键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号");
        int ticket = sc.nextInt();
        if (ticket >= 0 && ticket <= 100) {
            if(ticket % 2 == 0){
                System.out.println("请坐右边");
            }else {
                System.out.println("请坐左边");
            }


        }
    }
}
