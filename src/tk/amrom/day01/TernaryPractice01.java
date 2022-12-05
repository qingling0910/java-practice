package tk.amrom.day01;

import java.util.Scanner;

/*
练习：两只老虎
需求：
动物园里有两只老虎，体重分别为通过键盘录入获得，
请用程序实现判断两只老虎的体重是否相同
 */
public class TernaryPractice01 {
    public static void main(String[]args){
        //先定义两个变量，键盘录入
        Scanner sc = new Scanner(System.in);

        //录入第一个整数
        System.out.println("请输入第一只老虎的体重：");
        int weight01 = sc.nextInt();

        System.out.println("请输入第二只老虎的体重：");
        int weigth02 = sc.nextInt();

        String result =  weight01 == weigth02 ? "相同" : "不同";
        System.out.println(result);
    }
}
