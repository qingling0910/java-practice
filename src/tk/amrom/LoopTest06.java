package tk.amrom;

import java.util.Random;
import java.util.Scanner;

public class LoopTest06 {
    public static void main(String[] args) {
        //需求：程序自动生成1～100之间的随机数，使用程序实现猜出这个数字
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        //键盘录入一个数字
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(true){
            System.out.println("请输入你要猜的数字：");
            int guessNubmer = sc.nextInt();

            count++;
            if(count == 3){
                System.out.println("猜中了");
                break;
            }
            if(guessNubmer > number){
                System.out.println("大了");
            }else if(guessNubmer < number){
                System.out.println("小了");
            }else {
                System.out.println("猜中了");
                break;
        }




        }
    }
}
