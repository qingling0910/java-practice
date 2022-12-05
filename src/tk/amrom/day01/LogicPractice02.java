

package tk.amrom.day01;

import java.util.Scanner;

/*
需求：
数字6是一个伟大的数字，键盘录入两个整数
如果其中一个为6，最终结果输出true
如果它们的和为6的倍数，最终结果输出true
其他情况都是false
 */
public class LogicPractice02 {
    public static void main(String[]args){
        //先键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int number_01 = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int number_02 = sc.nextInt();

        //哪种情况下满足条件
        //a == 6
        //b == 6
        //(a + b) % 6 == 0

        boolean result01 = number_01 == 6 || number_02 == 6;
        boolean result02 = result01 || (number_01 + number_02) % 6 == 0;
        boolean result = result01 || result02;
        System.out.println(result);



    }
}
