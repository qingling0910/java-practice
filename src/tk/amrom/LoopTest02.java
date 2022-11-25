package tk.amrom;

import java.util.Scanner;

public class LoopTest02 {
    public static void main(String[] args) {
       /*
       求平方根
        需求：键盘录入一个一个大于等于2的整数x, 计算并返回 x 的平方根
        结果只保留整数部分，小数部分将被舍去
        */
        /*
        1 * 1 = 1
        2 * 2 = 4
        3 * 3 = 9
        4 * 4 = 16
        10的平方根的整数部分就是3
         */
        //键盘录入整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int number = sc.nextInt();
        //开始条件：1，结束条件：number
        for(int i = 1; i <= number; i++){
            //用i * i 与 number进行比较
            if(i * i == number){
                System.out.println(i + "就是" + number + "的平发根的整数部分");
                //一旦找到平方根，循环结束
                break;
            }else if(i * i > number){
                System.out.println((i - 1) + "就是" + number + "的平方根");
                break;

            }


            }
        }
    }

