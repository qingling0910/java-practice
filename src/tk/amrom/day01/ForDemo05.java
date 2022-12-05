package tk.amrom.day01;

import java.util.Scanner;

public class ForDemo05 {
    public static void main(String[] args) {
      /*
    统计满足条件的数字
    需求：加盘录入两个数字，表示一个范围
    统计这个范围中
    既能被3整除，又能被5整除的数字有多少个
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始的数字：");
        int start = sc.nextInt();

        System.out.println("请输入结束的数字：");
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }

        }
        System.out.println(count);
    }
}
