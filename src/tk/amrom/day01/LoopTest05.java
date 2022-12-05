package tk.amrom.day01;

import java.util.Random;

public class LoopTest05 {
    public static void main(String[] args) {
        Random r = new Random();
        //随机生成1～100之间的随机数
        int number = r.nextInt(100) + 1;
        System.out.println(number);


    }
}
