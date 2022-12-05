package tk.amrom.day01;

import java.util.Scanner;

public class LoopTest03 {
    public static void main(String[] args) {
        /*
        练习：求质数
        需求：键盘录入一个正整数 x,判断该整数是否为一个质数
         */
        //分析：什么是质数？---除了1和它本身以外不再有其他因数的自然数。
        //for example： 7 = 1 * 7
        //先键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int number = sc.nextInt();

        boolean flag = true;
        //循环判断number是不是质数
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是一个质数");

        } else {
            System.out.println(number + "不是一个质数");
        }
    }

        }

