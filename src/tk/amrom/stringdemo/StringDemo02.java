package tk.amrom.stringdemo;

import java.util.Scanner;

public class StringDemo02 {
    public static void main(String[] args) {
        /*
        练习：统计字符次数
        键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
         */
        //1、键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        
        //2、统计 --- 计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        
        //3、遍历字符串，并判断
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smallCount++;

            }else if(c >= 'A' && c <= 'Z'){
                bigCount++;

            }else if(c >= '0' && c <= '9'){
                numberCount++;
            }
            
        }
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("小写字母有" + smallCount + "个");
        System.out.println("数字字母有" + numberCount + "个");
        
    }
}
